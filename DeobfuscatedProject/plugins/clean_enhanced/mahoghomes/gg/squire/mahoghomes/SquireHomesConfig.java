/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 *  net.runelite.client.config.ConfigSection
 */
package gg.squire.mahoghomes;

import gg.squire.mahoghomes.model.BankMethod;
import gg.squire.mahoghomes.model.Contract;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;

@ConfigGroup(value="squirehomes")
public interface SquireHomesConfig
extends Config {
    @ConfigSection(name="Construction Settings", description="Select which contract you would like to do", position=10)
    public static final String CONSTRUCTION_SETTINGS = "Construction Settings";
    @ConfigSection(name="Bank Settings", description="Select which contract you would like to do", position=20)
    public static final String BANK_SETTINGS = "Bank Settings";

    @ConfigItem(position=1, keyName="Contract", name="Contract", description="Select which contract we should do", section="Construction Settings")
    default public Contract contract() {
        return Contract.ADEPT;
    }

    @ConfigItem(position=2, keyName="npccontact", name="NPC Contact", description="Use NPC contact instead of walking to the NPC", section="Construction Settings")
    default public boolean contact() {
        return false;
    }

    @ConfigItem(position=3, keyName="sack", name="Plank sack", description="Make use of the plank sack", section="Construction Settings")
    default public boolean sack() {
        return false;
    }

    @ConfigItem(position=1, keyName="barAmount", name="Bar amount", description="Amount of steel bars to bring", section="Bank Settings")
    default public int barAmount() {
        return 2;
    }

    @ConfigItem(position=3, keyName="bankMethod", name="Bank method", description="How to select which bank to use?", section="Bank Settings")
    default public BankMethod bankMethod() {
        return BankMethod.FALADOR;
    }
}

