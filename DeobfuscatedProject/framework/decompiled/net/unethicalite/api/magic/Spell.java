/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.TileItem
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.Interactable
 */
package net.unethicalite.api.magic;

import gg.squire.api.combat.AttackStyle;
import java.util.Collections;
import java.util.Set;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.Interactable;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.MagicAttribute;
import net.unethicalite.api.widgets.Widgets;

public interface Spell {
    public static final int AUTO_CAST_SPELL_ID_VARBIT = 276;

    public int getLevel();

    default public int getBaseMaxHit() {
        return 0;
    }

    default public int getAutoCastId() {
        return 0;
    }

    default public Set<MagicAttribute> getAttributes() {
        return Collections.emptySet();
    }

    public WidgetInfo getWidget();

    public boolean canCast();

    default public boolean canAutoCast() {
        return this.getAutoCastId() != -1 && this.canCast() && AttackStyle.MAGIC.isAvailable();
    }

    default public boolean isAutoCasting() {
        return Vars.getBit(276) == this.getAutoCastId();
    }

    default public boolean isCoolingDown() {
        return false;
    }

    default public boolean isSelected() {
        Widget widget = Widgets.get(this.getWidget());
        return widget != null && widget.getBorderType() == 2;
    }

    default public void cast() {
        Magic.cast(this);
    }

    default public void castOn(Interactable interactable) {
        if (interactable instanceof Item) {
            Magic.cast(this, (Item)interactable);
            return;
        }
        if (interactable instanceof NPC) {
            Magic.cast(this, (NPC)interactable);
            return;
        }
        if (interactable instanceof Player) {
            Magic.cast(this, (Player)interactable);
            return;
        }
        if (interactable instanceof TileItem) {
            Magic.cast(this, (TileItem)interactable);
            return;
        }
        if (interactable instanceof TileObject) {
            Magic.cast(this, (TileObject)interactable);
        }
    }

    default public boolean autoCast() {
        return Magic.autoCast(this);
    }
}
