/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api;

import net.runelite.api.widgets.WidgetInfo;

public enum EquipmentInventorySlot {
    HEAD(0, WidgetInfo.EQUIPMENT_HELMET),
    CAPE(1, WidgetInfo.EQUIPMENT_CAPE),
    AMULET(2, WidgetInfo.EQUIPMENT_AMULET),
    WEAPON(3, WidgetInfo.EQUIPMENT_WEAPON),
    BODY(4, WidgetInfo.EQUIPMENT_BODY),
    SHIELD(5, WidgetInfo.EQUIPMENT_SHIELD),
    LEGS(7, WidgetInfo.EQUIPMENT_LEGS),
    GLOVES(9, WidgetInfo.EQUIPMENT_GLOVES),
    BOOTS(10, WidgetInfo.EQUIPMENT_BOOTS),
    RING(12, WidgetInfo.EQUIPMENT_RING),
    AMMO(13, WidgetInfo.EQUIPMENT_AMMO);

    private final int slotIdx;
    private final WidgetInfo widgetInfo;

    private EquipmentInventorySlot(int slotIdx, WidgetInfo widgetInfo) {
        this.slotIdx = slotIdx;
        this.widgetInfo = widgetInfo;
    }

    public int getSlotIdx() {
        return this.slotIdx;
    }

    public WidgetInfo getWidgetInfo() {
        return this.widgetInfo;
    }
}

