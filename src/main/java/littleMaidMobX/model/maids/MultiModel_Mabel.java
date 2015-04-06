package littleMaidMobX.model.maids;
	public ModelRenderer innerBody;
	public ModelRenderer innerRightLeg;
	public ModelRenderer innerLeftLeg;
	public ModelRenderer innerSkirt;
	public ModelRenderer bipedHeadwearB;
	public ModelRenderer innerSkirtTop;
	public ModelRenderer innerSkirtFront;
	public ModelRenderer innerSkirtRight;
	public ModelRenderer innerSkirtLeft;
	public ModelRenderer innerSkirtBack;
		this(0.0F);
	}
		this(f, 0.0F);
	}
		this(f, f1, 64, 32);
	}
		super(f, f1, i < 0 ? 64 : i, j < 0 ? 32 : j);
	}
	public void initModel(float f, float f1, boolean isAfterInit) {
		f1 += 8F;
		bipedHead = new ModelRenderer(this, 0, 0);
		bipedHead.addBox(-2F, -6F, -2F, 4, 4, 4, f + 2.0F);
		bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		aboveHeadwear = new ModelRenderer(this, 0, 8);
		aboveHeadwear.addBox(-2F, -7F, -2F, 4, 4, 4, f + 2.2F);
		aboveHeadwear.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedHeadwearB = new ModelRenderer(this, 0, 16);
		bipedHeadwearB.addBox(-2F, 2.0F, -2F, 4, 4, 4, f + 2.0F);
		bipedHeadwearB.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedBody = new ModelRenderer(this, 16, 0);
		bipedBody.addBox(-3F, 0.0F, -2F, 6, 7, 4, f);
		bipedBody.setRotationPoint(0.0F, 0.0F, 0.0F);
		innerBody = new ModelRenderer(this, 16, 11);
		innerBody.addBox(-3F, 0.0F, -2F, 6, 7, 4, f - 0.3F);
		innerBody.setRotationPoint(0.0F, 0.0F, -0.2F);
		bipedRightArm = new ModelRenderer(this, 28, 22);
		bipedRightArm.addBox(-2F, -1F, -1F, 2, 8, 2, f);
		bipedRightArm.setRotationPoint(-3F, 1.5F, 0.0F);
		bipedLeftArm = new ModelRenderer(this, 36, 22);
		bipedLeftArm.setMirror(true);
		bipedLeftArm.addBox(0.0F, -1F, -1F, 2, 8, 2, f);
		bipedLeftArm.setRotationPoint(3F, 1.5F, 0.0F);
		bipedRightLeg = new ModelRenderer(this, 36, 0);
		bipedRightLeg.addBox(-2F, 0.0F, -2F, 3, 9, 4, f);
		bipedRightLeg.setRotationPoint(-1F, 7F, 0.0F);
		bipedLeftLeg = new ModelRenderer(this, 36, 0);
		bipedLeftLeg.setMirror(true);
		bipedLeftLeg.addBox(-1F, 0.0F, -2F, 3, 9, 4, f);
		bipedLeftLeg.setRotationPoint(1.0F, 7F, 0.0F);
		innerRightLeg = new ModelRenderer(this, 50, 0);
		innerRightLeg.addBox(-2F, 0.0F, -2F, 3, 9, 4, f - 0.3F);
		innerRightLeg.setRotationPoint(0.0F, 0.0F, -0.2F);
		innerLeftLeg = new ModelRenderer(this, 50, 0);
		innerLeftLeg.setMirror(true);
		innerLeftLeg.addBox(-1F, 0.0F, -2F, 3, 9, 4, f - 0.3F);
		innerLeftLeg.setRotationPoint(0.0F, 0.0F, -0.2F);
		Skirt = new ModelRenderer(this, 0, 24);
		Skirt.addBox(-2F, 0.0F, -2F, 4, 4, 4, f + 2.0F);
		Skirt.setRotationPoint(0.0F, 7F, 0.0F);
		innerSkirt = new ModelRenderer(this, 16, 26);
		innerSkirt.addBox(-1.5F, 0.0F, -1.5F, 3, 3, 3, f + 1.6F);
		innerSkirt.setRotationPoint(0.0F, 0.0F, 0.0F);
		ChignonB = new ModelRenderer(this, 32, 0);
		ChignonB.addBox(-1F, -6.2F, 3F, 2, 2, 2, f + 1.0F);
		ChignonB.setRotationPoint(0.0F, 0.0F, 0.0F);
		ChignonR = new ModelRenderer(this, 12, 0);
		ChignonR.addBox(-5F, -6F, 0.2F, 2, 2, 2, f + 1.0F);
		ChignonR.setRotationPoint(0.0F, 0.0F, 0.0F);
		ChignonL = new ModelRenderer(this, 12, 0);
		ChignonL.addBox(3F, -6F, 0.2F, 2, 2, 2, f + 1.0F);
		ChignonL.setRotationPoint(0.0F, 0.0F, 0.0F);
		Tail = new ModelRenderer(this, 44, 13);
		Tail.addBox(-1.5F, -6.8F, 4F, 3, 16, 3, f);
		Tail.setRotationPoint(0.0F, 0.0F, 0.0F);
		SideTailR = new ModelRenderer(this, 56, 13);
		SideTailR.addBox(-2F, -0.5F, 0.25F, 2, 17, 2, f);
		SideTailR.setRotationPoint(0.0F, 0.0F, 0.0F);
		SideTailL = new ModelRenderer(this, 56, 13);
		SideTailL.setMirror(true);
		SideTailL.addBox(0.0F, -0.5F, 0.25F, 2, 17, 2, f);
		SideTailL.setRotationPoint(0.0F, 0.0F, 0.0F);
		mainFrame = new ModelRenderer(this, 0, 0);
		mainFrame.setRotationPoint(0F, 0F + f1, 0F);
		if (isAfterInit) afterInit(f, f1);
	}
	public void actionPartsInit(float f, float f1) {
		rightArm = new ModelRenderer(this, 28, 22);
		rightArm.addBox(-1.0F, 0.0F, -1.0F, 2, 4, 2, f);
		rightArm.setRotationPoint(-3.0F, 9.5F, 0.0F);
		//rightArmPlus.setTextureOffset(52, 0).addPlate(-1.0F, -1.0F, -3.01F, 2, 2, 4, f);
		rightArmPlus.rotateAngleX = 1.570796313F;
		rightArm2.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2, f);
		rightArm2.setRotationPoint(0.0F, 2.0F, 0.0F);
		rightArmPlus2.setTextureOffset(32, 22).addPlate(-1.0F, -1.0F, 0.001F, 2, 2, 4, f);
		rightArmPlus2.setTextureOffset(32, 22).addPlate(-1.0F, -1.0F, -2.001F, 2, 2, 0, f);
		rightArmPlus2.rotateAngleX = 1.570796313F;
		rightHand.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 2, f);
		rightHand.setRotationPoint(0.0F, 3.0F, 0.0F);
		leftArm.addBox(-1.0F, 0.0F, -1.0F, 2, 4, 2, f);
		leftArm.setRotationPoint(3.0F, 9.5F, 0.0F);
		//leftArmPlus.setTextureOffset(40, 22).addPlate(-1.0F, -1.0F, -3.01F, 2, 2, 4, f);
		leftArmPlus.rotateAngleX = 1.570796313F;
		leftArm2.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2, f);
		leftArm2.setRotationPoint(0.0F, 2.0F, 0.0F);
		leftArmPlus2.setTextureOffset(40, 22).addPlate(-1.0F, -1.0F, 0.001F, 2, 2, 4, f);
		leftArmPlus2.setTextureOffset(40, 22).addPlate(-1.0F, -1.0F, -2.001F, 2, 2, 0, f);
		leftArmPlus2.rotateAngleX = 1.570796313F;
		leftHand.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 2, f);
		leftHand.setRotationPoint(0.0F, 3.0F, 0.0F);
		rightLeg.addBox(-1.5F, 0.0F, -2.0F, 3, 4, 4, f);
		rightLeg.setRotationPoint(0.0F, 8.0F, 0.0F);
		rightLegPlus.setTextureOffset(36, 6).addPlate(-1.5F, -2.0F, -4.01F, 3, 4, 4, f);
		rightLegPlus.rotateAngleX = 1.570796313F;
		rightLeg2.addBox(-1.5F, 0.0F, -2.0F, 3, 5, 4, f);
		rightLeg2.setRotationPoint(0.0F, 8.0F, 0.0F);
		rightLegPlus2.setTextureOffset(36, 6).addPlate(-1.5F, -2.0F, 0.01F, 3, 4, 4, f);
		rightLegPlus2.setTextureOffset(39, 6).addPlate(-1.5F, -2.0F, -5.01F, 3, 4, 4, f);
		rightLegPlus2.rotateAngleX = 1.570796313F;
		leftLeg.mirror = true;
		leftLeg.addBox(-1.5F, 0.0F, -2.0F, 3, 4, 4, f);
		leftLeg.setRotationPoint(0.0F, 8.0F, 0.0F);
		leftLegPlus.mirror = true;
		leftLegPlus.setTextureOffset(36, 6).addPlate(-1.5F, -2.0F, -4.01F, 3, 4, 4, f);
		leftLegPlus.rotateAngleX = 1.570796313F;
		leftLeg2.mirror = true;
		leftLeg2.addBox(-1.5F, 0.0F, -2.0F, 3, 5, 4, f);
		leftLeg2.setRotationPoint(0.0F, 8.0F, 0.0F);
		leftLegPlus2.mirror = true;
		leftLegPlus2.setTextureOffset(36, 6).addPlate(-1.5F, -2.0F, 0.01F, 3, 4, 4, f);
		leftLegPlus2.setTextureOffset(39, 6).addPlate(-1.5F, -2.0F, -5.01F, 3, 4, 4, f);
		leftLegPlus2.rotateAngleX = 1.570796313F;
				leftArm.showModel = rightArmPlus.showModel = rightArmPlus2.showModel =
				leftArmPlus.showModel = leftArmPlus2.showModel = rightLegPlus.showModel =
				rightLegPlus2.showModel = leftLegPlus.showModel = leftLegPlus2.showModel =
				rightArm2.showModel = leftArm2.showModel = rightLeg.showModel =
				rightLeg2.showModel = leftLeg.showModel = leftLeg2.showModel = false;
	}
	public void skirtFloatsInit(float f, float f1) {
		if (ModelCapsHelper.getCapsValueInt(this, null, caps_skirtFloats) < 2) return;
		//スカート上
		SkirtTop = new ModelRenderer(this, 4, 24);
		SkirtTop.addPlate(0.0F, 0.0F, 0.0F, 4, 4, ModelBoxPlate.planeXZTop, f + 2.0F);
		SkirtTop.setRotationPoint(-2.0F, 0.0F, -2.0F);
		SkirtFront = new ModelRenderer(this, 4, 28);
		SkirtFront.addPlate(0.0F, 0.0F, 0.0F, 4, 4, ModelBoxPlate.planeXYFront, f + 2.0F);
		SkirtFront.setRotationPoint(0.0F, 0.0F, 0.0F);
		SkirtRight = new ModelRenderer(this, 0, 28);
		SkirtRight.addPlate(0.0F, 0.0F, 0.0F, 4, 4, ModelBoxPlate.planeZYRight, f + 2.0F);
		SkirtRight.setRotationPoint(0.0F, 0.0F, 0.0F);
		SkirtLeft = new ModelRenderer(this, 8, 28);
		SkirtLeft.addPlate(0.0F, 0.0F, 0.0F, 4, 4, ModelBoxPlate.planeZYLeft, f + 2.0F);
		SkirtLeft.setRotationPoint(4.0F, 0.0F, 0.0F);
		SkirtBack = new ModelRenderer(this, 12, 28);
		SkirtBack.addPlate(0.0F, 0.0F, 0.0F, 4, 4, ModelBoxPlate.planeXYBack, f + 2.0F);
		SkirtBack.setRotationPoint(0.0F, 0.0F, 4.0F);
		innerSkirtTop = new ModelRenderer(this, 4, 24);
		innerSkirtTop.addPlate(0.0F, 0.0F, 0.0F, 3, 3, ModelBoxPlate.planeXZTop, f + 1.6F);
		innerSkirtTop.setRotationPoint(-1.5F, 0.0F, -1.5F);
		innerSkirtFront = new ModelRenderer(this, 19, 29);
		innerSkirtFront.addPlate(0.0F, 0.0F, 0.0F, 3, 3, ModelBoxPlate.planeXYFront, f + 1.6F);
		innerSkirtFront.setRotationPoint(0.0F, 0.0F, 0.0F);
		innerSkirtRight = new ModelRenderer(this, 16, 29);
		innerSkirtRight.addPlate(0.0F, 0.0F, 0.0F, 3, 3, ModelBoxPlate.planeZYRight, f + 1.6F);
		innerSkirtRight.setRotationPoint(0.0F, 0.0F, 0.0F);
		innerSkirtLeft = new ModelRenderer(this, 22, 29);
		innerSkirtLeft.addPlate(0.0F, 0.0F, 0.0F, 3, 3, ModelBoxPlate.planeZYLeft, f + 1.6F);
		innerSkirtLeft.setRotationPoint(3.0F, 0.0F, 0.0F);
		innerSkirtBack = new ModelRenderer(this, 25, 29);
		innerSkirtBack.addPlate(0.0F, 0.0F, 0.0F, 3, 3, ModelBoxPlate.planeXYBack, f + 1.6F);
		innerSkirtBack.setRotationPoint(0.0F, 0.0F, 3.0F);
		setCapsValue(null, caps_visible, Skirt, false);
		setCapsValue(null, caps_visible, innerSkirt, false);
	}
	public void defaultAddChildSetting() {
		super.defaultAddChildSetting();
		bipedHead.addChild(aboveHeadwear);
		bipedHead.addChild(bipedHeadwearB);
		bipedBody.addChild(innerBody);
		bipedRightLeg.addChild(innerRightLeg);
		bipedLeftLeg.addChild(innerLeftLeg);
		Skirt.addChild(innerSkirt);
	}
	public void defaultSkirtFloatsAddChild() {
		if (ModelCapsHelper.getCapsValueInt(this, null, caps_skirtFloats) < 2) return;
		super.defaultSkirtFloatsAddChild();
		innerSkirt.addChild(innerSkirtTop);
		innerSkirtTop.addChild(innerSkirtFront);
		innerSkirtTop.addChild(innerSkirtRight);
		innerSkirtTop.addChild(innerSkirtLeft);
		innerSkirtTop.addChild(innerSkirtBack);
	}
	public void setRotationAnglesLM(float f, float f1, float f2, float f3, float f4, float f5, IModelCaps entityCaps) {
		super.setRotationAnglesLM(f, f1, f2, f3, f4, f5, entityCaps);
		Arms[0].setRotationPoint(-0.5F, 4.5F, 0F);
		Arms[1].setRotationPoint(0.5F, 4.5F, 0F);
		bipedHead.rotationPointY = 0.0F;
		bipedBody.rotationPointY -= 3.5F;
		bipedRightArm.rotationPointY += 5.0F;
		bipedLeftArm.rotationPointY += 5.0F;
		bipedRightLeg.rotationPointX = -1.0F;
		bipedLeftLeg.rotationPointX = -bipedRightLeg.rotationPointX;
		bipedRightLeg.rotationPointY =
		bipedLeftLeg.rotationPointY = 7.0F;
		SideTailR.rotationPointX = -5F;
		SideTailR.rotationPointY = -6F;
		SideTailL.rotationPointX = 5F;
		SideTailL.rotationPointY = -6F;
		Skirt.rotationPointY += 1.5F;
		float f6 = mh_sin(f2 * 0.09F) * 0.05F + 0.05F;
		bipedHeadwearB.rotateAngleX = f6;
		SideTailR.rotateAngleZ = f6;
		SideTailL.rotateAngleZ = -f6;
		Tail.rotateAngleX = f6;
		SideTailL.rotateAngleX = SideTailR.rotateAngleX = -bipedHead.rotateAngleX / 2.0F;
		skirtFloats(f, f1, f2, f3, f4, f5, entityCaps);
	}
	public void skirtFloats(float f, float f1, float f2, float f3, float f4, float f5, IModelCaps entityCaps) {
		super.skirtFloats(f, f1, f2, f3, f4, f5, entityCaps);
		if (ModelCapsHelper.getCapsValueInt(this, entityCaps, caps_skirtFloats) < 2) return;
		float motionY = (float) ModelCapsHelper.getCapsValueDouble(this, entityCaps, caps_skirtFloatsMotionY);;
				innerSkirtFront.rotationPointX = innerSkirtBack.rotationPointX =
				innerSkirtLeft.rotationPointY = innerSkirtRight.rotationPointY = motionY * 2.0F;
		SkirtRight.rotationPointZ = SkirtLeft.rotationPointZ =
				innerSkirtRight.rotationPointZ = innerSkirtRight.rotationPointZ = -motionY * 2.0F;
				innerSkirtFront.rotateAngleX = innerSkirtLeft.rotateAngleZ = motionY;
		SkirtBack.rotateAngleX = SkirtRight.rotateAngleZ =
				innerSkirtBack.rotateAngleX = innerSkirtRight.rotateAngleZ = -motionY;
		innerSkirtFront.scaleX = innerSkirtBack.scaleX =
				innerSkirtRight.scaleZ = innerSkirtLeft.scaleZ = 1.0F - (motionY * 1.0F);
	}
	public float getHeight(IModelCaps entityCaps) {
		return 1.35F;
	}
	public float getWidth(IModelCaps entityCaps) {
		return 0.6F;
	}
	public String getUsingTexture() {
		return null;
	}
}