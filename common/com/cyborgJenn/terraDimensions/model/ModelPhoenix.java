package com.cyborgJenn.terraDimensions.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPhoenix extends ModelBase
{
  //fields
    ModelRenderer crest7;
    ModelRenderer crest8;
    ModelRenderer crest9;
    ModelRenderer crest10;
    ModelRenderer crest11;
    ModelRenderer crest12;
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer toe1;
    ModelRenderer leg1;
    ModelRenderer leg2;
    ModelRenderer leg4;
    ModelRenderer leg3;
    ModelRenderer toe2;
    ModelRenderer toe3;
    ModelRenderer toe4;
    ModelRenderer toe5;
    ModelRenderer toe6;
    ModelRenderer toe7;
    ModelRenderer toe8;
    ModelRenderer body2;
    ModelRenderer tail1;
    ModelRenderer tail2;
    ModelRenderer tail3;
    ModelRenderer tail4;
    ModelRenderer neck1;
    ModelRenderer neck2;
    ModelRenderer neck3;
    ModelRenderer beak1;
    ModelRenderer beak2;
    ModelRenderer wing1;
    ModelRenderer wing2;
    ModelRenderer wing3;
    ModelRenderer wing4;
    ModelRenderer wing5;
    ModelRenderer wing6;
    ModelRenderer wing7;
    ModelRenderer wing8;
    ModelRenderer wing9;
    ModelRenderer wing10;
    ModelRenderer wing11;
    ModelRenderer wing12;
    ModelRenderer wing13;
    ModelRenderer wing14;
    ModelRenderer wing15;
    ModelRenderer crest1;
    ModelRenderer crest2;
    ModelRenderer crest3;
    ModelRenderer crest4;
    ModelRenderer crest5;
    ModelRenderer crest6;
  
  public ModelPhoenix()
  {
    textureWidth = 128;
    textureHeight = 128;
    
      crest7 = new ModelRenderer(this, 0, 88);
      crest7.addBox(-2F, -1F, 0F, 4, 2, 8);
      crest7.setRotationPoint(0F, -11F, -7F);
      crest7.setTextureSize(64, 32);
      crest7.mirror = true;
      setRotation(crest7, -0.4461433F, 0F, 0F);
      crest8 = new ModelRenderer(this, 0, 77);
      crest8.addBox(-2F, 0F, 0F, 4, 2, 8);
      crest8.setRotationPoint(0F, -10F, -6F);
      crest8.setTextureSize(64, 32);
      crest8.mirror = true;
      setRotation(crest8, -0.4461433F, 0F, 0F);
      crest9 = new ModelRenderer(this, -1, 109);
      crest9.addBox(-2F, 0F, 0F, 4, 2, 8);
      crest9.setRotationPoint(0F, -7F, -5F);
      crest9.setTextureSize(64, 32);
      crest9.mirror = true;
      setRotation(crest9, -0.4461433F, 0F, 0F);
      crest10 = new ModelRenderer(this, 0, 99);
      crest10.addBox(-2F, 0F, 0F, 4, 1, 8);
      crest10.setRotationPoint(0F, -8F, -6F);
      crest10.setTextureSize(64, 32);
      crest10.mirror = true;
      setRotation(crest10, -0.4461433F, 0F, 0F);
      crest11 = new ModelRenderer(this, 0, 65);
      crest11.addBox(-2F, 0F, 0F, 4, 2, 10);
      crest11.setRotationPoint(0F, -17F, -9F);
      crest11.setTextureSize(64, 32);
      crest11.mirror = true;
      setRotation(crest11, -0.4461433F, 0F, 0F);
      crest12 = new ModelRenderer(this, 7, 8);
      crest12.addBox(-2F, 0F, 0F, 4, 2, 10);
      crest12.setRotationPoint(0F, -17F, -9F);
      crest12.setTextureSize(64, 32);
      crest12.mirror = true;
      setRotation(crest12, -0.4461433F, 0F, 0F);
      head = new ModelRenderer(this, 101, 74);
      head.addBox(-3F, -8F, -4F, 6, 8, 8);
      head.setRotationPoint(0F, -11F, -7F);
      head.setTextureSize(64, 32);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      body = new ModelRenderer(this, 34, 23);
      body.addBox(-4F, 0F, -2F, 8, 10, 8);
      body.setRotationPoint(0F, 1F, -6F);
      body.setTextureSize(64, 32);
      body.mirror = true;
      setRotation(body, 0.9294653F, 0F, 0F);
      toe1 = new ModelRenderer(this, 0, 35);
      toe1.addBox(0F, 0F, -8F, 1, 1, 7);
      toe1.setRotationPoint(-3F, 22F, 1F);
      toe1.setTextureSize(64, 32);
      toe1.mirror = true;
      setRotation(toe1, 0.1115358F, 0F, 0F);
      leg1 = new ModelRenderer(this, 38, 1);
      leg1.addBox(-2F, 0F, -2F, 4, 9, 4);
      leg1.setRotationPoint(-3F, 5F, 1F);
      leg1.setTextureSize(64, 32);
      leg1.mirror = true;
      setRotation(leg1, 0.5576792F, 0F, 0F);
      leg2 = new ModelRenderer(this, 38, 1);
      leg2.addBox(-2F, 0F, -2F, 4, 9, 4);
      leg2.setRotationPoint(3F, 5F, 1F);
      leg2.setTextureSize(64, 32);
      leg2.mirror = true;
      setRotation(leg2, 0.5576792F, 0F, 0F);
      leg4 = new ModelRenderer(this, 0, 16);
      leg4.addBox(-1F, 0F, -1F, 1, 11, 2);
      leg4.setRotationPoint(-2F, 13F, 4F);
      leg4.setTextureSize(64, 32);
      leg4.mirror = true;
      setRotation(leg4, -0.4089647F, 0F, 0F);
      leg3 = new ModelRenderer(this, 0, 16);
      leg3.addBox(-1F, 0F, -1F, 1, 12, 2);
      leg3.setRotationPoint(3F, 12F, 4F);
      leg3.setTextureSize(64, 32);
      leg3.mirror = true;
      setRotation(leg3, -0.4089647F, 0F, 0F);
      toe2 = new ModelRenderer(this, 0, 35);
      toe2.addBox(0F, 0F, -6F, 1, 1, 7);
      toe2.setRotationPoint(-3F, 23F, 0F);
      toe2.setTextureSize(64, 32);
      toe2.mirror = true;
      setRotation(toe2, 0F, 0.5205006F, 0F);
      toe3 = new ModelRenderer(this, 0, 35);
      toe3.addBox(0F, 0F, -7F, 1, 1, 7);
      toe3.setRotationPoint(-3.05F, 23F, 1F);
      toe3.setTextureSize(64, 32);
      toe3.mirror = true;
      setRotation(toe3, 0F, -0.3346114F, 0F);
      toe4 = new ModelRenderer(this, 67, 33);
      toe4.addBox(0F, 0F, 0F, 1, 1, 4);
      toe4.setRotationPoint(-3F, 23F, 0F);
      toe4.setTextureSize(64, 32);
      toe4.mirror = true;
      setRotation(toe4, 0F, 0F, 0F);
      toe5 = new ModelRenderer(this, 0, 35);
      toe5.addBox(-1F, 0F, -8F, 1, 1, 7);
      toe5.setRotationPoint(3F, 22F, 1F);
      toe5.setTextureSize(64, 32);
      toe5.mirror = true;
      setRotation(toe5, 0.1115358F, 0F, 0F);
      toe6 = new ModelRenderer(this, 0, 35);
      toe6.addBox(0F, 0F, -7F, 1, 1, 7);
      toe6.setRotationPoint(2F, 23F, 1F);
      toe6.setTextureSize(64, 32);
      toe6.mirror = true;
      setRotation(toe6, 0F, 0.2974289F, 0F);
      toe7 = new ModelRenderer(this, 0, 35);
      toe7.addBox(0F, 0F, -8F, 1, 1, 7);
      toe7.setRotationPoint(2F, 23F, 1F);
      toe7.setTextureSize(64, 32);
      toe7.mirror = true;
      setRotation(toe7, 0F, -0.4089686F, 0F);
      toe8 = new ModelRenderer(this, 67, 33);
      toe8.addBox(0F, 0F, 0F, 1, 1, 4);
      toe8.setRotationPoint(2F, 23F, 0F);
      toe8.setTextureSize(64, 32);
      toe8.mirror = true;
      setRotation(toe8, 0F, 0F, 0F);
      body2 = new ModelRenderer(this, 41, 56);
      body2.addBox(0F, 0F, 0F, 8, 10, 7);
      body2.setRotationPoint(-4F, 8F, 0F);
      body2.setTextureSize(64, 32);
      body2.mirror = true;
      setRotation(body2, 1.33843F, 0F, 0F);
      tail1 = new ModelRenderer(this, 56, 1);
      tail1.addBox(-3F, 0F, -3F, 6, 8, 6);
      tail1.setRotationPoint(0F, 6F, 9F);
      tail1.setTextureSize(64, 32);
      tail1.mirror = true;
      setRotation(tail1, 1.003822F, 0F, 0F);
      tail2 = new ModelRenderer(this, 67, 16);
      tail2.addBox(-3F, -2F, 0F, 4, 4, 12);
      tail2.setRotationPoint(1F, 7F, 11F);
      tail2.setTextureSize(64, 32);
      tail2.mirror = true;
      setRotation(tail2, -0.669215F, 0F, 0F);
      tail3 = new ModelRenderer(this, 100, 16);
      tail3.addBox(-1F, -1F, 0F, 2, 3, 10);
      tail3.setRotationPoint(0F, 11F, 18F);
      tail3.setTextureSize(64, 32);
      tail3.mirror = true;
      setRotation(tail3, -0.9666439F, 0F, 0F);
      tail4 = new ModelRenderer(this, 76, 78);
      tail4.addBox(-1F, 0F, 0F, 2, 1, 10);
      tail4.setRotationPoint(0F, 15F, 21F);
      tail4.setTextureSize(64, 32);
      tail4.mirror = true;
      setRotation(tail4, -0.9666439F, 0F, 0F);
      neck1 = new ModelRenderer(this, 25, 89);
      neck1.addBox(-3F, -3F, -2F, 6, 7, 2);
      neck1.setRotationPoint(0F, -1F, -3F);
      neck1.setTextureSize(64, 32);
      neck1.mirror = true;
      setRotation(neck1, -1.003822F, 0F, 0F);
      neck2 = new ModelRenderer(this, 26, 78);
      neck2.addBox(-3F, -3F, -2F, 4, 6, 4);
      neck2.setRotationPoint(1F, -2F, -4F);
      neck2.setTextureSize(64, 32);
      neck2.mirror = true;
      setRotation(neck2, -1.33843F, 0F, 0F);
      neck3 = new ModelRenderer(this, 29, 42);
      neck3.addBox(-2F, -2F, -9F, 4, 4, 9);
      neck3.setRotationPoint(0F, -4F, -4F);
      neck3.setTextureSize(64, 32);
      neck3.mirror = true;
      setRotation(neck3, -1.33843F, 0F, 0F);
      beak1 = new ModelRenderer(this, 20, 56);
      beak1.addBox(-1F, 0F, -7F, 4, 2, 6);
      beak1.setRotationPoint(-1F, -15F, -9F);
      beak1.setTextureSize(64, 32);
      beak1.mirror = true;
      setRotation(beak1, 0F, 0F, 0F);
      beak2 = new ModelRenderer(this, 17, 35);
      beak2.addBox(-1F, -1F, -6F, 2, 1, 6);
      beak2.setRotationPoint(0F, -12F, -9F);
      beak2.setTextureSize(64, 32);
      beak2.mirror = true;
      setRotation(beak2, 0F, 0F, 0F);
      wing1 = new ModelRenderer(this, 81, 0);
      wing1.addBox(0F, -1F, -1F, 15, 2, 3);
      wing1.setRotationPoint(3F, 0F, -1F);
      wing1.setTextureSize(64, 32);
      wing1.mirror = true;
      setRotation(wing1, -0.669215F, 0.4833219F, -0.3346075F);
      wing2 = new ModelRenderer(this, 0, 0);
      wing2.addBox(0F, -1F, -1F, 15, 2, 3);
      wing2.setRotationPoint(15F, -5F, -7F);
      wing2.setTextureSize(64, 32);
      wing2.mirror = true;
      setRotation(wing2, -0.7435722F, 0.3346075F, 0.2974289F);
      wing3 = new ModelRenderer(this, 0, 0);
      wing3.addBox(0F, -1F, -1F, 11, 1, 3);
      wing3.setRotationPoint(27F, 0F, -12F);
      wing3.setTextureSize(64, 32);
      wing3.mirror = true;
      setRotation(wing3, -0.5576792F, 0.2230717F, 0.8922867F);
      wing4 = new ModelRenderer(this, 92, 92);
      wing4.addBox(0F, 0F, 0F, 6, 14, 1);
      wing4.setRotationPoint(4F, -1F, -4F);
      wing4.setTextureSize(64, 32);
      wing4.mirror = true;
      setRotation(wing4, 0.9294653F, -0.1115358F, -0.1115358F);
      wing5 = new ModelRenderer(this, 79, 37);
      wing5.addBox(0F, 0F, 0F, 14, 17, 1);
      wing5.setRotationPoint(17F, -5F, -9F);
      wing5.setTextureSize(64, 32);
      wing5.mirror = true;
      setRotation(wing5, 0.8179294F, 0.0743572F, 0.5205006F);
      wing6 = new ModelRenderer(this, 110, 36);
      wing6.addBox(0F, 0F, 0F, 6, 15, 1);
      wing6.setRotationPoint(10F, -3F, -5F);
      wing6.setTextureSize(64, 32);
      wing6.mirror = true;
      setRotation(wing6, 0.9294653F, -0.1487144F, 0.1115358F);
      wing7 = new ModelRenderer(this, 7, 29);
      wing7.addBox(0F, 0F, 0F, 4, 4, 1);
      wing7.setRotationPoint(13F, -4F, -8F);
      wing7.setTextureSize(64, 32);
      wing7.mirror = true;
      setRotation(wing7, 0.9294653F, -0.1487144F, 0.1115358F);
      wing8 = new ModelRenderer(this, 26, 100);
      wing8.addBox(0F, 0F, 0F, 20, 15, 1);
      wing8.setRotationPoint(28F, 2F, -11F);
      wing8.setTextureSize(64, 32);
      wing8.mirror = true;
      setRotation(wing8, 0.676754F, 0.414335F, 0.8458134F);
      wing9 = new ModelRenderer(this, 0, 1);
      wing9.addBox(-15F, 0F, 0F, 15, 2, 3);
      wing9.setRotationPoint(-2F, -1F, -1F);
      wing9.setTextureSize(64, 32);
      wing9.mirror = true;
      setRotation(wing9, -0.6692116F, -0.4833166F, 0.3346145F);
      wing10 = new ModelRenderer(this, 0, 0);
      wing10.addBox(-15F, 0F, 0F, 15, 2, 3);
      wing10.setRotationPoint(-15F, -6F, -7F);
      wing10.setTextureSize(64, 32);
      wing10.mirror = true;
      setRotation(wing10, -0.7435801F, -0.3346145F, -0.2974216F);
      wing11 = new ModelRenderer(this, 0, 0);
      wing11.addBox(-11F, 0F, -2F, 11, 1, 3);
      wing11.setRotationPoint(-27F, 0F, -10F);
      wing11.setTextureSize(64, 32);
      wing11.mirror = true;
      setRotation(wing11, -0.5576792F, -0.2230705F, -0.8922821F);
      wing12 = new ModelRenderer(this, 70, 112);
      wing12.addBox(-6F, 0F, 0F, 6, 14, 1);
      wing12.setRotationPoint(-3F, -1F, -3F);
      wing12.setTextureSize(64, 32);
      wing12.mirror = true;
      setRotation(wing12, 0.9294576F, -0.105732F, -0.0242775F);
      wing13 = new ModelRenderer(this, 76, 92);
      wing13.addBox(-4F, 0F, 0F, 6, 15, 1);
      wing13.setRotationPoint(-12F, -3F, -5F);
      wing13.setTextureSize(64, 32);
      wing13.mirror = true;
      setRotation(wing13, 0.9294576F, 0.1487195F, -0.1289973F);
      wing14 = new ModelRenderer(this, 44, 75);
      wing14.addBox(0F, 0F, 0F, 14, 17, 1);
      wing14.setRotationPoint(-27F, 2F, -9F);
      wing14.setTextureSize(64, 32);
      wing14.mirror = true;
      setRotation(wing14, 0.8179294F, -0.074351F, -0.5204921F);
      wing15 = new ModelRenderer(this, 74, 56);
      wing15.addBox(-20F, 0F, 0F, 20, 15, 1);
      wing15.setRotationPoint(-25F, 0F, -9F);
      wing15.setTextureSize(64, 32);
      wing15.mirror = true;
      setRotation(wing15, 0.676754F, -0.4143412F, -0.8458215F);
      crest1 = new ModelRenderer(this, 0, 66);
      crest1.addBox(-2F, -2F, 0F, 4, 2, 9);
      crest1.setRotationPoint(0F, -17F, -9F);
      crest1.setTextureSize(64, 32);
      crest1.mirror = true;
      setRotation(crest1, 0.7435722F, 0F, 0F);
      crest2 = new ModelRenderer(this, 0, 43);
      crest2.addBox(-2F, 0F, 0F, 4, 2, 10);
      crest2.setRotationPoint(0F, -16F, -11F);
      crest2.setTextureSize(64, 32);
      crest2.mirror = true;
      setRotation(crest2, 0.5948578F, 0F, 0F);
      crest3 = new ModelRenderer(this, 0, 65);
      crest3.addBox(-2F, 0F, 0F, 4, 2, 10);
      crest3.setRotationPoint(0F, -15F, -9F);
      crest3.setTextureSize(64, 32);
      crest3.mirror = true;
      setRotation(crest3, -0.4461433F, 0F, 0F);
      crest4 = new ModelRenderer(this, 7, 8);
      crest4.addBox(-2F, 0F, 0F, 4, 2, 10);
      crest4.setRotationPoint(0F, -17F, -9F);
      crest4.setTextureSize(64, 32);
      crest4.mirror = true;
      setRotation(crest4, -0.4461433F, 0F, 0F);
      crest5 = new ModelRenderer(this, 0, 57);
      crest5.addBox(-2F, 0F, 0F, 4, 2, 5);
      crest5.setRotationPoint(0F, -20F, -5F);
      crest5.setTextureSize(64, 32);
      crest5.mirror = true;
      setRotation(crest5, -0.4461433F, 0F, 0F);
      crest6 = new ModelRenderer(this, 0, 78);
      crest6.addBox(-2F, 0F, 0F, 4, 2, 7);
      crest6.setRotationPoint(0F, -18F, -6F);
      crest6.setTextureSize(64, 32);
      crest6.mirror = true;
      setRotation(crest6, -0.4461433F, 0F, 0F);
  }
  
  public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7)
  {
    super.render(par1Entity, par2, par3, par4, par5, par6, par7);
    setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
    crest7.render(par7);
    crest8.render(par7);
    crest9.render(par7);
    crest10.render(par7);
    crest11.render(par7);
    crest12.render(par7);
    head.render(par7);
    body.render(par7);
    toe1.render(par7);
    leg1.render(par7);
    leg2.render(par7);
    leg4.render(par7);
    leg3.render(par7);
    toe2.render(par7);
    toe3.render(par7);
    toe4.render(par7);
    toe5.render(par7);
    toe6.render(par7);
    toe7.render(par7);
    toe8.render(par7);
    body2.render(par7);
    tail1.render(par7);
    tail2.render(par7);
    tail3.render(par7);
    tail4.render(par7);
    neck1.render(par7);
    neck2.render(par7);
    neck3.render(par7);
    beak1.render(par7);
    beak2.render(par7);
    wing1.render(par7);
    wing2.render(par7);
    wing3.render(par7);
    wing4.render(par7);
    wing5.render(par7);
    wing6.render(par7);
    wing7.render(par7);
    wing8.render(par7);
    wing9.render(par7);
    wing10.render(par7);
    wing11.render(par7);
    wing12.render(par7);
    wing13.render(par7);
    wing14.render(par7);
    wing15.render(par7);
    crest1.render(par7);
    crest2.render(par7);
    crest3.render(par7);
    crest4.render(par7);
    crest5.render(par7);
    crest6.render(par7);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity)
  {
    super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
  }

}
