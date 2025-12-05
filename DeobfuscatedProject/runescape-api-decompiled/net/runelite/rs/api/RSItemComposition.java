/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.ItemComposition
 *  net.runelite.api.IterableHashTable
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.ItemComposition;
import net.runelite.api.IterableHashTable;
import net.runelite.mapping.Import;
import net.runelite.rs.api.RSIterableNodeHashTable;
import net.runelite.rs.api.RSModel;

public interface RSItemComposition
extends ItemComposition {
    @Import(value="name")
    public String getName();

    @Import(value="name")
    public void setName(String var1);

    @Import(value="id")
    public int getId();

    @Import(value="noteTemplate")
    public int getNote();

    @Import(value="note")
    public int getLinkedNoteId();

    @Import(value="placeholder")
    public int getPlaceholderId();

    @Import(value="placeholderTemplate")
    public int getPlaceholderTemplateId();

    @Import(value="price")
    public int getPrice();

    @Import(value="isMembersOnly")
    public boolean isMembers();

    @Import(value="isTradable")
    public boolean isTradeable();

    @Import(value="isTradable")
    public void setTradeable(boolean var1);

    @Import(value="isStackable")
    public int getIsStackable();

    @Import(value="maleModel")
    public int getMaleModel();

    @Import(value="inventoryActions")
    public String[] getInventoryActions();

    @Import(value="groundActions")
    public String[] getGroundActions();

    @Import(value="getShiftClickIndex")
    public int getShiftClickActionIndex();

    @Import(value="getModel")
    public RSModel getModel(int var1);

    @Import(value="unnotedId")
    public int getInventoryModel();

    @Import(value="recolorTo")
    public short[] getColorToReplaceWith();

    @Import(value="retextureTo")
    public short[] getTextureToReplaceWith();

    @Import(value="params")
    public RSIterableNodeHashTable getParams();

    @Import(value="params")
    public void setParams(IterableHashTable var1);

    @Import(value="params")
    public void setParams(RSIterableNodeHashTable var1);
}

