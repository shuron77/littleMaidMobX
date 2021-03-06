package littleMaidMobX.ai;

import littleMaidMobX.entity.EntityDummy;
import littleMaidMobX.entity.EntityLittleMaid;
import net.minecraft.block.material.Material;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class AITracerMove extends EntityAIBase implements IEntityAI {
	
	protected EntityLittleMaid theMaid; 
	protected World world;
	protected boolean isEnable;
	protected int tileX;
	protected int tileY;
	protected int tileZ;


	public AITracerMove(EntityLittleMaid pEntityLittleMaid) {
		theMaid = pEntityLittleMaid;
		world = pEntityLittleMaid.worldObj;
		isEnable = false;
		
		setMutexBits(1);
	}

	@Override
	public void setEnable(boolean pFlag) {
		isEnable = pFlag;
	}

	@Override
	public boolean getEnable() {
		return isEnable;
	}

	@Override
	public boolean shouldExecute() {
		return isEnable && !theMaid.isMaidWaitEx() &&  theMaid.getNavigator().noPath();
	}

	@Override
	public boolean continueExecuting() {
		return !theMaid.getNavigator().noPath();
	}

	@Override
	public void startExecuting() {
		
		
		int ox = MathHelper.floor_double(theMaid.posX);
		int oy = MathHelper.floor_double(theMaid.posY);
		int oz = MathHelper.floor_double(theMaid.posZ);
		int vt = MathHelper.floor_float(((theMaid.rotationYawHead * 4F) / 360F) + 2.5F) & 3;
		int xx = ox;
		int yy = oy;
		int zz = oz;
		double lrange = Double.MAX_VALUE;
		
		// TODO:Dummy
		EntityDummy.clearDummyEntity(theMaid);
		boolean flagdammy = false;
		
		
		for (int d = 0; d < 4; d++) {
			for (int a = 2; a < 14; a += 2) {
				int del = a / 2;
				if (vt == 0) {
					xx = ox - del;
					zz = oz - del;
				}
				else if (vt == 1) { 
					xx = ox + del;
					zz = oz - del;
				}
				else if (vt == 2) { 
					xx = ox + del;
					zz = oz + del;
				}
				else if (vt == 3) { 
					xx = ox - del;
					zz = oz + del;
				}
				// TODO:Dummay
				if (!flagdammy) {
					EntityDummy.setDummyEntity(theMaid, 0x00ff4f4f, xx, oy, zz);
					flagdammy = true;
				}
				int b = 0;
				do {
					for (int c = 0; c < 3; c++) {
						yy = oy + (c == 2 ? -1 : c);
						if (checkBlock(xx, yy, zz)) {
							
							double lr = theMaid.getDistanceSq(xx, yy, zz);
							if (lr < lrange) {
								if (doFindBlock(xx, yy, zz)) {
									lrange = lr;
									tileX = xx;
									tileY = yy;
									tileZ = zz;
//									theMaid.func_110171_b(xx, yy, zz, 16);
									theMaid.setHomeArea(xx, yy, zz, 16);
									// TODO:Dummay
									EntityDummy.setDummyEntity(theMaid, 0x004f4fff, xx, yy, zz);
									flagdammy = true;
									return;
								}
							}
							// TODO:Dummay
							EntityDummy.setDummyEntity(theMaid, 0x004fff4f, xx, yy, zz);
							flagdammy = true;
						}
					}
					// TODO:Dummay
					if (!flagdammy) {
						EntityDummy.setDummyEntity(theMaid, 0x00ffffcf, xx, oy, zz);
						flagdammy = true;
					}
					// TODO:dammy
					flagdammy = false;
					
					if (vt == 0) {
						xx++;
					}
					else if (vt == 1) { 
						zz++;
					}
					else if (vt == 2) { 
						xx--;
					}
					else if (vt == 3) { 
						zz--;
					}
					
				} while(++b < a);
			}
			vt = (vt + 1) & 3;
		}
	}

	
	protected boolean checkBlock(int px, int py, int pz) {
		return world.getBlockPowerInput(px, py, pz) > 0 && (world.getBlock(px, py + 1, pz).getMaterial() == Material.air);
	}

	
	protected boolean doFindBlock(int px, int py, int pz) {
		return theMaid.getNavigator().tryMoveToXYZ(px, py, pz, 1.0F);
//		return theMaid.getNavigator().tryMoveToXYZ(px, py, pz, theMaid.getAIMoveSpeed());
	}

}
