package modchu.lib.characteristic;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Modchu_TextureBoxBaseBase {

	public String textureName;
	public int contractColor;
	public int wildColor;
	public float modelHeight;
	public float modelWidth;
	public float modelYOffset;
	public float modelMountedYOffset;
	public boolean isUpdateSize;


	public void setModelSize(float pHeight, float pWidth, float pYOffset, float pMountedYOffset) {
		modelHeight = pHeight;
		modelWidth = pWidth;
		modelYOffset = pYOffset;
		modelMountedYOffset = pMountedYOffset;
	}

	protected int getRandomColor(int pColor, Random pRand) {
		List<Integer> llist = new ArrayList<Integer>();
		for (int li = 0; li < 16; li++) {
			if ((pColor & 0x01) > 0) {
				llist.add(li);
			}
			pColor = pColor >>> 1;
		}

		if (llist.size() > 0) {
			return llist.get(pRand.nextInt(llist.size()));
		} else {
			return -1;
		}
	}

	/**
	 * 契約色の有無をビット配列にして返す
	 */
	public int getContractColorBits() {
		return contractColor;
	}

	/**
	 * 野生色の有無をビット配列にして返す
	 */
	public int getWildColorBits() {
		return wildColor;
	}

//	public boolean hasColor(int pIndex, boolean pContract) {
//		return (((pContract ? contractColor : wildColor) >>> pIndex) & 0x01) != 0;
//	}

	/**
	 * 野生のメイドの色をランダムで返す
	 */
	public int getRandomWildColor(Random pRand) {
		return getRandomColor(getWildColorBits(), pRand);
	}

	/**
	 * 契約のメイドの色をランダムで返す
	 */
	public int getRandomContractColor(Random pRand) {
		return getRandomColor(getContractColorBits(), pRand);
	}

	public float getHeight(Modchu_IEntityCapsBase entityCaps) {
		return modelHeight;
	}

	public float getWidth(Modchu_IEntityCapsBase entityCaps) {
		return modelWidth;
	}

	public float getYOffset(Modchu_IEntityCapsBase entityCaps) {
		return modelYOffset;
	}

	public float getMountedYOffset(Modchu_IEntityCapsBase entityCaps) {
		return modelMountedYOffset;
	}

}