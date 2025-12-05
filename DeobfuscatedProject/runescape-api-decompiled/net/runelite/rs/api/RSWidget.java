/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.widgets.Widget
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.widgets.Widget;
import net.runelite.mapping.Import;
import net.runelite.rs.api.RSFillMode;
import net.runelite.rs.api.RSFont;
import net.runelite.rs.api.RSSpriteMask;
import net.runelite.rs.api.RSSpritePixels;
import net.runelite.rs.api.RSUrlRequester;
import net.runelite.rs.api.RSWidgetDefinition;

public interface RSWidget
extends Widget {
    @Import(value="children")
    public RSWidget[] getChildren();

    @Import(value="getSpriteMask")
    public RSSpriteMask getSpriteMask(RSWidgetDefinition var1, boolean var2);

    @Import(value="children")
    public void setChildren(Widget[] var1);

    @Import(value="id")
    public int getId();

    public void setRenderParentId(int var1);

    public void setRenderX(int var1);

    public void setRenderY(int var1);

    @Import(value="id")
    public void setId(int var1);

    @Import(value="parentId")
    public int getRSParentId();

    @Import(value="childId")
    public int getRSChildId();

    @Import(value="parentId")
    public void setParentId(int var1);

    @Import(value="flags")
    public int getClickMask();

    @Import(value="flags")
    public RSWidget setClickMask(int var1);

    @Import(value="modelId")
    public int getModelId();

    @Import(value="modelId")
    public RSWidget setModelId(int var1);

    @Import(value="itemIds")
    public int[] getItemIds();

    @Import(value="itemIds")
    public void setItemIds(int[] var1);

    @Import(value="modelType")
    public int getModelType();

    @Import(value="modelType")
    public RSWidget setModelType(int var1);

    @Import(value="sequenceId")
    public int getAnimationId();

    @Import(value="sequenceId")
    public RSWidget setAnimationId(int var1);

    @Import(value="buttonText")
    public String getRSButtonText();

    @Import(value="text")
    public String getRSText();

    @Import(value="dataText")
    public String getRSName();

    @Import(value="dataText")
    public void setRSName(String var1);

    @Import(value="text")
    public RSWidget setText(String var1);

    @Import(value="color")
    public int getTextColor();

    @Import(value="color")
    public RSWidget setTextColor(int var1);

    @Import(value="transparencyTop")
    public int getOpacity();

    @Import(value="transparencyTop")
    public RSWidget setOpacity(int var1);

    @Import(value="x")
    public int getRelativeX();

    @Import(value="x")
    public void setRelativeX(int var1);

    @Import(value="y")
    public int getRelativeY();

    @Import(value="y")
    public void setRelativeY(int var1);

    @Import(value="width")
    public int getWidth();

    @Import(value="width")
    public void setWidth(int var1);

    @Import(value="height")
    public int getHeight();

    @Import(value="height")
    public void setHeight(int var1);

    @Import(value="isHidden")
    public boolean isSelfHidden();

    @Import(value="isHidden")
    public RSWidget setHidden(boolean var1);

    @Import(value="childIndex")
    public int getIndex();

    @Import(value="childIndex")
    public void setIndex(int var1);

    @Import(value="modelAngleX")
    public int getRotationX();

    @Import(value="modelAngleX")
    public RSWidget setRotationX(int var1);

    @Import(value="modelAngleZ")
    public int getRotationY();

    @Import(value="modelAngleZ")
    public RSWidget setRotationY(int var1);

    @Import(value="modelAngleY")
    public int getRotationZ();

    @Import(value="modelAngleY")
    public RSWidget setRotationZ(int var1);

    @Import(value="modelZoom")
    public int getModelZoom();

    @Import(value="modelZoom")
    public RSWidget setModelZoom(int var1);

    @Import(value="contentType")
    public int getContentType();

    @Import(value="contentType")
    public RSWidget setContentType(int var1);

    @Import(value="type")
    public int getType();

    @Import(value="type")
    public void setType(int var1);

    @Import(value="buttonType")
    public int getButtonType();

    @Import(value="scrollX")
    public int getScrollX();

    @Import(value="scrollX")
    public RSWidget setScrollX(int var1);

    @Import(value="scrollY")
    public int getScrollY();

    @Import(value="scrollY")
    public RSWidget setScrollY(int var1);

    @Import(value="scrollWidth")
    public int getScrollWidth();

    @Import(value="scrollWidth")
    public RSWidget setScrollWidth(int var1);

    @Import(value="scrollHeight")
    public int getScrollHeight();

    @Import(value="scrollHeight")
    public RSWidget setScrollHeight(int var1);

    @Import(value="spriteId2")
    public int getSpriteId();

    @Import(value="spriteId2")
    public RSWidget setSpriteId(int var1);

    @Import(value="spriteTiling")
    public boolean getSpriteTiling();

    @Import(value="spriteTiling")
    public RSWidget setSpriteTiling(boolean var1);

    @Import(value="outline")
    public int getBorderType();

    @Import(value="outline")
    public void setBorderType(int var1);

    @Import(value="itemId")
    public int getItemId();

    @Import(value="itemId")
    public RSWidget setItemId(int var1);

    @Import(value="itemQuantity")
    public int getItemQuantity();

    @Import(value="itemQuantity")
    public RSWidget setItemQuantity(int var1);

    @Import(value="rawX")
    public int getOriginalX();

    @Import(value="rawX")
    public RSWidget setOriginalX(int var1);

    @Import(value="rawY")
    public int getOriginalY();

    @Import(value="rawY")
    public RSWidget setOriginalY(int var1);

    @Import(value="rawHeight")
    public int getOriginalHeight();

    @Import(value="rawHeight")
    public RSWidget setOriginalHeight(int var1);

    @Import(value="rawWidth")
    public int getOriginalWidth();

    @Import(value="rawWidth")
    public RSWidget setOriginalWidth(int var1);

    @Import(value="onOp")
    public void setOnOpListener(Object ... var1);

    @Import(value="setAction")
    public void setAction(int var1, String var2);

    @Import(value="isIf3")
    public boolean isIf3();

    @Import(value="isIf3")
    public void setIsIf3(boolean var1);

    @Import(value="hasListener")
    public boolean hasListener();

    @Import(value="hasListener")
    public RSWidget setHasListener(boolean var1);

    @Import(value="onKey")
    public Object[] getOnKeyListener();

    @Import(value="onLoad")
    public Object[] getOnLoadListener();

    @Import(value="onOp")
    public Object[] getOnOpListener();

    @Import(value="onDialogAbort")
    public void setOnDialogAbortListener(Object ... var1);

    @Import(value="onKey")
    public void setOnKeyListener(Object ... var1);

    @Import(value="onMouseOver")
    public void setOnMouseOverListener(Object ... var1);

    @Import(value="onMouseRepeat")
    public void setOnMouseRepeatListener(Object ... var1);

    @Import(value="onMouseLeave")
    public void setOnMouseLeaveListener(Object ... var1);

    @Import(value="onTimer")
    public void setOnTimerListener(Object ... var1);

    @Import(value="onTargetEnter")
    public void setOnTargetEnterListener(Object ... var1);

    @Import(value="onTargetLeave")
    public void setOnTargetLeaveListener(Object ... var1);

    @Import(value="fontId")
    public int getFontId();

    @Import(value="fontId")
    public RSWidget setFontId(int var1);

    @Import(value="textShadowed")
    public boolean getTextShadowed();

    @Import(value="textShadowed")
    public RSWidget setTextShadowed(boolean var1);

    @Import(value="dragZoneSize")
    public int getDragDeadZone();

    @Import(value="dragZoneSize")
    public void setDragDeadZone(int var1);

    @Import(value="dragThreshold")
    public int getDragDeadTime();

    @Import(value="dragThreshold")
    public void setDragDeadTime(int var1);

    @Import(value="itemQuantityMode")
    public int getItemQuantityMode();

    @Import(value="itemQuantityMode")
    public RSWidget setItemQuantityMode(int var1);

    @Import(value="xAlignment")
    public int getXPositionMode();

    @Import(value="xAlignment")
    public RSWidget setXPositionMode(int var1);

    @Import(value="yAlignment")
    public int getYPositionMode();

    @Import(value="yAlignment")
    public RSWidget setYPositionMode(int var1);

    @Import(value="textXAlignment")
    public int getXTextAlignment();

    @Import(value="textXAlignment")
    public RSWidget setXTextAlignment(int var1);

    @Import(value="textYAlignment")
    public int getYTextAlignment();

    @Import(value="textYAlignment")
    public RSWidget setYTextAlignment(int var1);

    @Import(value="widthAlignment")
    public int getWidthMode();

    @Import(value="widthAlignment")
    public RSWidget setWidthMode(int var1);

    @Import(value="heightAlignment")
    public int getHeightMode();

    @Import(value="heightAlignment")
    public RSWidget setHeightMode(int var1);

    @Import(value="getFont")
    public RSFont getRSFont(RSWidgetDefinition var1);

    @Import(value="fill")
    public boolean isFilled();

    @Import(value="fill")
    public RSWidget setFilled(boolean var1);

    @Import(value="spellActionName")
    public String getTargetVerb();

    @Import(value="spellActionName")
    public void setTargetVerb(String var1);

    @Import(value="noClickThrough")
    public boolean getNoClickThrough();

    @Import(value="noClickThrough")
    public void setNoClickThrough(boolean var1);

    @Import(value="noScrollThrough")
    public boolean getNoScrollThrough();

    @Import(value="noScrollThrough")
    public void setNoScrollThrough(boolean var1);

    @Import(value="modelFrame")
    public int getModelFrame();

    @Import(value="modelFrameCycle")
    public int getModelFrameCycle();

    @Import(value="onInvTransmit")
    public Object[] getOnInvTransmitListener();

    @Import(value="getSprite")
    public RSSpritePixels getSprite(RSWidgetDefinition var1, boolean var2, RSUrlRequester var3);

    @Import(value="onRelease")
    public void setOnReleaseListener(Object[] var1);

    @Import(value="varTransmitTriggers")
    public void setVarTransmitTrigger(int[] var1);

    @Import(value="onHold")
    public void setOnHoldListener(Object[] var1);

    @Import(value="onClick")
    public void setOnClickListener(Object[] var1);

    @Import(value="onDragComplete")
    public void setOnDragCompleteListener(Object[] var1);

    @Import(value="onDragComplete")
    public Object[] getOnDragCompleteListener();

    @Import(value="onDrag")
    public void setOnDragListener(Object[] var1);

    @Import(value="onScroll")
    public void setOnScrollWheelListener(Object[] var1);

    @Import(value="parent")
    public RSWidget getDragParent();

    @Import(value="parent")
    public RSWidget setDragParent(Widget var1);

    @Import(value="onVarTransmit")
    public Object[] getOnVarTransmitListener();

    @Import(value="onVarTransmit")
    public void setOnVarTransmitListener(Object[] var1);

    @Import(value="fillMode")
    public RSFillMode getFillMode();

    @Import(value="textLineHeight")
    public int getLineHeight();

    @Import(value="textLineHeight")
    public RSWidget setLineHeight(int var1);

    public void broadcastHidden(boolean var1);

    @Import(value="actions")
    public String[] getRawActions();
}

