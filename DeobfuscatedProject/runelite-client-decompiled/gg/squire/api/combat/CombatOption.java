/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 *  net.runelite.api.widgets.Widget
 */
package gg.squire.api.combat;

import gg.squire.api.combat.AttackStyle;
import gg.squire.api.combat.AttackType;
import gg.squire.api.combat.CombatOptions;
import gg.squire.api.combat.CombatStyle;
import gg.squire.client.util.Log;
import java.util.Objects;
import net.runelite.api.Skill;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.query.results.WidgetQueryResults;
import net.unethicalite.api.widgets.Tab;
import net.unethicalite.api.widgets.Tabs;
import net.unethicalite.api.widgets.Widgets;

public class CombatOption {
    private final CombatStyle combatStyle;
    private final AttackType attackType;
    private final AttackStyle attackStyle;
    private final Skill[] combatXP;

    CombatOption(CombatStyle combatStyle, AttackType attackType, AttackStyle attackStyle, Skill experience1, Skill experience2) {
        this(combatStyle, attackType, attackStyle, experience1, experience2, null);
    }

    CombatOption(CombatStyle combatStyle, AttackType attackType, AttackStyle attackStyle, Skill ... experience) {
        this.combatStyle = combatStyle;
        this.attackType = attackType;
        this.attackStyle = attackStyle;
        this.combatXP = experience;
    }

    public CombatStyle getCombatStyle() {
        return this.combatStyle;
    }

    public AttackType getAttackType() {
        return this.attackType;
    }

    public AttackStyle getAttackStyle() {
        return this.attackStyle;
    }

    public Skill[] getCombatXP() {
        return this.combatXP;
    }

    public boolean isAvailable() {
        return CombatOptions.getAvailable().contains(this);
    }

    public boolean isSelected() {
        return Objects.equals(CombatOptions.getCurrent(), this);
    }

    public boolean select() {
        CombatOption current = CombatOptions.getCurrent();
        if (current == this) {
            return true;
        }
        if (CombatOptions.getAvailable().contains(this)) {
            System.out.println("[CombatOption] Changing the current combat option from $current to $this");
            if (!Tabs.isOpen(Tab.COMBAT)) {
                Tabs.open(Tab.COMBAT);
            }
            if (Tabs.isOpen(Tab.COMBAT)) {
                Widget box;
                String action = this.combatStyle.getAction();
                if (action == null) {
                    action = this.combatStyle.name();
                    action = action.substring(0, action.indexOf(95)).toLowerCase();
                }
                if ((box = (Widget)((WidgetQueryResults)Widgets.query(593).types(0).actions(action).results()).first()) != null) {
                    box.interact(action);
                    return Time.sleepUntil(this::isSelected, Rand.nextInt(600, 1200));
                }
            }
        } else {
            Log.debug("[CombatOption] " + String.valueOf(this) + " is not available on " + String.valueOf((Object)CombatOptions.getCurrentWeaponCategory()));
        }
        return false;
    }
}

