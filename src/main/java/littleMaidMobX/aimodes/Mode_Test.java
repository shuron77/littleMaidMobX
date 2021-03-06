package littleMaidMobX.aimodes;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import littleMaidMobX.Statics;
import littleMaidMobX.entity.EntityLittleMaid;
import littleMaidMobX.registry.ModelManager;
import littleMaidMobX.render.RenderLittleMaid;
import littleMaidMobX.textures.TextureBox;
import littleMaidMobX.textures.TextureBoxServer;
import littleMaidMobX.wrapper.MinecraftWrapper;
import net.minecraft.command.CommandTime;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.WrongUsageException;
import net.minecraft.entity.ai.EntityAITasks;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;

public class Mode_Test extends ModeBase implements ICommand {

	public static boolean isEnable = false;
	
	public Mode_Test(EntityLittleMaid pEntity) {
		super(pEntity);
	}
	
	@Override
	public void init() {
//		ModLoader.addCommand(this);
	}

	@Override
	public int priority() {
		return 9900;
	}

	@Override
	public void addEntityMode(EntityAITasks pDefaultMove, EntityAITasks pDefaultTargeting) {

	}

	@Override
	public void showSpecial(RenderLittleMaid prenderlittlemaid, double px, double py, double pz) {
		if (!isEnable) return;
		
		
		List<String> llist = new ArrayList<String>();
		double ld;
		
		if (owner.maidDominantArm == 0) {
			llist.add(String.format("[R]:%d, L:%d, I:%d", owner.mstatSwingStatus[0].index, owner.mstatSwingStatus[1].index, owner.maidInventory.currentItem));
			llist.add(String.format("swing[R]:%b:%f", owner.getSwingStatusDominant().isSwingInProgress, owner.getSwingStatusDominant().swingProgress));
		} else {
			llist.add(String.format("R:%d, [L]:%d, I:%d", owner.mstatSwingStatus[0].index, owner.mstatSwingStatus[1].index, owner.maidInventory.currentItem));
			llist.add(String.format("swing[L]:%b:%f", owner.getSwingStatusDominant().isSwingInProgress, owner.getSwingStatusDominant().swingProgress));
		}
		llist.add(String.format("health:%f, death:%d, Exp:%d", owner.getHealth(), owner.deathTime, owner.getExperiencePoints(null)));
//		llist.add("stat:" + owner.statusMessage);
		llist.add(String.format("working:%b, sneak:%b, sugar:%b", owner.isWorking(), owner.isSneaking(), owner.isLookSuger()));
		llist.add(String.format("%s[%s]", owner.getMaidModeString(), owner.maidActiveModeClass == null ? "" : owner.maidActiveModeClass.getClass().getSimpleName()));
		llist.add(String.format("Limit: %b[%b]", owner.isContract(), owner.isContractEX()));
		int li = owner.getDataWatcher().getWatchableObjectInt(Statics.dataWatch_Texture);
		llist.add(String.format("Texture=%s(%x/ %x), %s(%x / %x)",
				owner.textureData.getTextureName(0), owner.textureData.textureIndex[0], li & 0xffff,
				owner.textureData.getTextureName(1), owner.textureData.textureIndex[1], (li >>> 16)
				));
		
		ld = (double)llist.size() * 0.25D - 0.5D;
		for (String ls : llist) {
			prenderlittlemaid.renderLivingLabel(owner, ls, px, py + ld, pz, 64);
			ld -= 0.25D;
		}
/*		
		GL11.glPushMatrix();
		GL11.glTranslatef(1.5F * MathHelper.cos(MMM_Helper.mc.thePlayer.rotationYaw), 0F, 1.5F * MathHelper.sin(MMM_Helper.mc.thePlayer.rotationYaw));
//		GL11.glRotatef(owner.rotationYaw, 0F, 1F, 0F);
		llist.clear();
		llist.add(String.format("motX:%+10.2f", owner.motionX));
		llist.add(String.format("motY:%+10.2f", owner.motionY));
		llist.add(String.format("motZ:%+10.2f", owner.motionZ));

		ld = (double)llist.size() * 0.25D - 1.5D;
		for (String ls : llist) {
			prenderlittlemaid.renderLivingLabel(owner, ls, px, py + ld, pz, 64);
			ld -= 0.25D;
		}
		GL11.glPopMatrix();
*/
	}

	
	
	
	@Override
	public int compareTo(Object arg0) {
		return 0;
	}

	@Override
	public String getCommandName() {
		return "LMMtest";
	}

	@Override
	public String getCommandUsage(ICommandSender var1) {
//		return "";
		return "/" + this.getCommandName() + " <0-4>";
	}

	@Override
	public List getCommandAliases() {
		return null;
	}

	@Override
	public void processCommand(ICommandSender var1, String[] var2) {
		if (var2.length > 0) {
			switch (Integer.valueOf(var2[0])) {
			case 0:
				isEnable = false;
				
				MinecraftWrapper.notifyAdmins(var1, new CommandTime(), 0, "LMM TestMessage Disable", new Object[] {});
				break;
			case 1:
				isEnable = true;
				
				MinecraftWrapper.notifyAdmins(var1, new CommandTime(), 0, "LMM TestMessage Enable", new Object[] {});
				break;
			case 2:
				// textureIndex
				
				var1.addChatMessage(new ChatComponentText("textureServer:"));
				for (int li = 0; li < ModelManager.instance.textureServer.size(); li++) {
					TextureBoxServer lb = ModelManager.instance.getTextureBoxServer(li);
					var1.addChatMessage(new ChatComponentText(String.format("%4d : %04x : %s", li, lb.wildColor, lb.textureName)));
				}
				break;
			case 3:
				// textures
				var1.addChatMessage(new ChatComponentText("textures:"));
				for (TextureBox ltb : ModelManager.getTextureList()) {
					var1.addChatMessage(new ChatComponentText(ltb.textureName));
				}
				break;
			case 4:
				// textures
				var1.addChatMessage(new ChatComponentText("textureServerIndex:"));
				for (Entry<TextureBox, Integer> ltb : ModelManager.instance.textureServerIndex.entrySet()) {
					var1.addChatMessage(new ChatComponentText(String.format("%04x, %s", ltb.getValue(), ltb.getKey().textureName)));
				}
				break;
			}
			
//			isEnable = var2[0].equalsIgnoreCase("0") ? false : true;
//			CommandBase.notifyAdmins(var1, 0, "LMM TestMessage" + (isEnable ? "Enable" : "Disable"), new Object[] {});
		} else {
			throw new WrongUsageException(getCommandUsage(var1), new Object[0]);
		}
	}

	@Override
	public boolean canCommandSenderUseCommand(ICommandSender var1) {
		return true;
	}

	@Override
	public List addTabCompletionOptions(ICommandSender var1, String[] var2) {
		
		return null;
	}

	@Override
	public boolean isUsernameIndex(String[] var1, int var2) {
		return false;
	}

	@Override
	public boolean interact(EntityPlayer pentityplayer, ItemStack pitemstack) {
		if (isEnable && pitemstack.getItem() == Items.slime_ball) {
//		if (pitemstack.itemID == Item.slimeBall.itemID && owner.maidContractLimit > 0) {
			owner.maidContractLimit -= 24000;
			return true;
		}
		return false;
	}

}
