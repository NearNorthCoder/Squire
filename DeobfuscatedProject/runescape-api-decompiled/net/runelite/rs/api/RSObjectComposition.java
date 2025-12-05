/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.IterableHashTable
 *  net.runelite.api.ObjectComposition
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.IterableHashTable;
import net.runelite.api.ObjectComposition;
import net.runelite.mapping.Import;
import net.runelite.rs.api.RSBuffer;
import net.runelite.rs.api.RSIterableNodeHashTable;

public interface RSObjectComposition
extends ObjectComposition {
    @Import(value="id")
    public int getId();

    @Import(value="name")
    public String getName();

    @Import(value="name")
    public void setName(String var1);

    @Import(value="actions")
    public String[] getActions();

    @Import(value="mapSceneId")
    public int getMapSceneId();

    @Import(value="mapIconId")
    public int getMapIconId();

    @Import(value="transforms")
    public int[] getImpostorIds();

    @Import(value="transform")
    public RSObjectComposition getImpostor();

    @Import(value="params")
    public RSIterableNodeHashTable getParams();

    @Import(value="params")
    public void setParams(IterableHashTable var1);

    @Import(value="params")
    public void setParams(RSIterableNodeHashTable var1);

    @Import(value="decodeNext")
    public void decodeNext(RSBuffer var1, int var2);

    @Import(value="modelIds")
    public int[] getModelIds();

    @Import(value="modelIds")
    public void setModelIds(int[] var1);

    @Import(value="models")
    public int[] getModels();

    @Import(value="models")
    public void setModels(int[] var1);

    @Import(value="ObjectDefinition_isLowDetail")
    public boolean getObjectDefinitionIsLowDetail();

    @Import(value="sizeX")
    public int getSizeX();

    @Import(value="sizeX")
    public void setSizeX(int var1);

    @Import(value="sizeY")
    public int getSizeY();

    @Import(value="sizeY")
    public void setSizeY(int var1);

    @Import(value="interactType")
    public int getInteractType();

    @Import(value="interactType")
    public void setInteractType(int var1);

    @Import(value="boolean1")
    public boolean getBoolean1();

    @Import(value="boolean1")
    public void setBoolean1(boolean var1);

    @Import(value="int1")
    public int getInt1();

    @Import(value="int1")
    public void setInt1(int var1);

    @Import(value="int2")
    public int getInt2();

    @Import(value="int2")
    public void setInt2(int var1);

    @Import(value="clipType")
    public int getClipType();

    @Import(value="clipType")
    public void setClipType(int var1);

    @Import(value="nonFlatShading")
    public boolean getNonFlatShading();

    @Import(value="nonFlatShading")
    public void setNonFlatShading(boolean var1);

    @Import(value="modelClipped")
    public void setModelClipped(boolean var1);

    @Import(value="modelClipped")
    public boolean getModelClipped();

    @Import(value="animationId")
    public int getAnimationId();

    @Import(value="animationId")
    public void setAnimationId(int var1);

    @Import(value="ambient")
    public int getAmbient();

    @Import(value="ambient")
    public void setAmbient(int var1);

    @Import(value="contrast")
    public int getContrast();

    @Import(value="contrast")
    public void setContrast(int var1);

    @Import(value="recolorFrom")
    public short[] getRecolorFrom();

    @Import(value="recolorFrom")
    public void setRecolorFrom(short[] var1);

    @Import(value="recolorTo")
    public short[] getRecolorTo();

    @Import(value="recolorTo")
    public void setRecolorTo(short[] var1);

    @Import(value="retextureFrom")
    public short[] getRetextureFrom();

    @Import(value="retextureFrom")
    public void setRetextureFrom(short[] var1);

    @Import(value="retextureTo")
    public short[] getRetextureTo();

    @Import(value="retextureTo")
    public void setRetextureTo(short[] var1);

    @Import(value="isRotated")
    public void setIsRotated(boolean var1);

    @Import(value="isRotated")
    public boolean getIsRotated();

    @Import(value="clipped")
    public void setClipped(boolean var1);

    @Import(value="clipped")
    public boolean getClipped();

    @Import(value="mapSceneId")
    public void setMapSceneId(int var1);

    @Import(value="modelSizeX")
    public void setModelSizeX(int var1);

    @Import(value="modelSizeX")
    public int getModelSizeX();

    @Import(value="modelHeight")
    public void setModelHeight(int var1);

    @Import(value="modelSizeY")
    public void setModelSizeY(int var1);

    @Import(value="offsetX")
    public void setOffsetX(int var1);

    @Import(value="offsetHeight")
    public void setOffsetHeight(int var1);

    @Import(value="offsetY")
    public void setOffsetY(int var1);

    @Import(value="int3")
    public void setInt3(int var1);

    @Import(value="int5")
    public void setInt5(int var1);

    @Import(value="int6")
    public void setInt6(int var1);

    @Import(value="int7")
    public int getInt7();

    @Import(value="int7")
    public void setInt7(int var1);

    @Import(value="boolean2")
    public void setBoolean2(boolean var1);

    @Import(value="isSolid")
    public void setIsSolid(boolean var1);

    @Import(value="ambientSoundId")
    public void setAmbientSoundId(int var1);

    @Import(value="soundEffectIds")
    public void setSoundEffectIds(int[] var1);

    @Import(value="soundEffectIds")
    public int[] getSoundEffectIds();

    @Import(value="mapIconId")
    public void setMapIconId(int var1);

    @Import(value="boolean3")
    public void setBoolean3(boolean var1);

    @Import(value="transformVarbit")
    public void setTransformVarbit(int var1);

    @Import(value="transformVarbit")
    public int getTransformVarbit();

    @Import(value="transformVarbit")
    public int getVarbitId();

    @Import(value="transformVarp")
    public void setTransformVarp(int var1);

    @Import(value="transformVarp")
    public int getTransformVarp();

    @Import(value="transformVarp")
    public int getVarPlayerId();

    @Import(value="transforms")
    public void setTransforms(int[] var1);

    @Import(value="transforms")
    public int[] getTransforms();
}

