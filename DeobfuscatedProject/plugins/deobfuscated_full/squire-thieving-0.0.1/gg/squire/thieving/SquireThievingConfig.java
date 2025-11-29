/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 *  net.runelite.client.config.ConfigSection
 *  net.runelite.client.config.Range
 */
package gg.squire.thieving;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.Range;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.b;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.d;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.e;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.f;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.h;

@ConfigGroup(value="squirethiever")
public interface SquireThievingConfig
extends Config {
    @ConfigSection(name="Extras", description="Additional settings", position=5)
    public static final /* synthetic */ String EXTRAS;
    @ConfigSection(name="Training", description="Settings for training", position=0)
    public static final /* synthetic */ String TRAINING;

    @ConfigItem(position=11, name="Training method", keyName="training.method", description="The training method to use", section="Training")
    default public b method() {
        return b.BLACK_JACK;
    }

    @ConfigItem(position=22, name="Drop useless fruit", keyName="stall.dropfruit", description="Drop useless fruit", hidden=true, unhide="training.method", unhideValue="Stalls", section="Training")
    default public boolean dropFruit() {
        return false;
    }

    @ConfigItem(position=20, name="Redemption healing", description="Whether to use redemption to heal (instead of food)", keyName="redemptionHealing", hidden=true, unhide="training.method", unhideValue="Pickpocketing", section="Extras")
    default public boolean redemptionHeal() {
        return false;
    }

    @ConfigItem(position=30, name="Shadow Veil", description="Use Shadow Veil when Pickpocketing", keyName="pickpocketing.shadowveil", hidden=true, unhide="training.method", unhideValue="Pickpocketing", section="Extras")
    default public boolean shadowVeil() {
        return false;
    }

    @ConfigItem(position=40, name="Gem Bag", description="Use Gem Bag when Pickpocketing", keyName="pickpocketing.gembag", hidden=true, unhide="npc.type", unhideValue="VYRE", section="Extras")
    default public boolean gemBag() {
        return false;
    }

    @Range(min=1, max=18)
    @ConfigItem(position=42, name="Wander range", description="What range to pickpocket within", keyName="npc.range", hidden=true, unhide="training.method", unhideValue="Pickpocketing", section="Training")
    default public int wanderRange() {
        return 3;
    }

    @ConfigItem(position=45, name="Eat at HP", description="HP to eat at", keyName="thieving.eathp", section="Training")
    @Range(min=1, max=99)
    default public int eatHP() {
        return 0x78 ^ 0x44;
    }

    @ConfigItem(position=10, name="Seed Vault", description="Deposit seeds in seed vault", keyName="pickpocketing.seeds", hidden=true, unhide="npc.type", unhideValue="MASTER_FARMER", section="Extras")
    default public boolean depositSeedVault() {
        return false;
    }

    @ConfigItem(position=41, name="Target NPC", description="What NPC to pickpocket from", keyName="npc.type", hidden=true, unhide="training.method", unhideValue="Pickpocketing", section="Training")
    default public f pickpocketTarget() {
        return f.ARDY_KNIGHT;
    }

    @ConfigItem(position=32, name="Buy wines", description="Should the plugin purchase wines when out of food?", keyName="blackjack.buywines", hidden=true, unhide="training.method", unhideValue="Black jack", disabledBy="blackjack.unnote", disabledByValue="true", section="Extras")
    default public boolean buyWines() {
        return ((105 + 195 - 221 + 125 ^ 44 + 174 - 111 + 91) & (0x9E ^ 0xAB ^ (0x8B ^ 0xB4) ^ -1)) != 0;
    }

    @ConfigItem(position=11, name="Seed Box", description="Use Seed Box when Pickpocketing", keyName="pickpocketing.seedbox", hidden=true, unhide="npc.type", unhideValue="MASTER_FARMER", section="Extras")
    default public boolean useSeedBox() {
        return false;
    }

    @ConfigItem(position=44, name="Quantity of Food/Drink", description="Quantity of food/drink to withdraw from bank", keyName="pickpocket.amount", hidden=true, unhide="training.method", unhideValue="Pickpocketing", section="Training")
    default public int pickpocketFoodAmount() {
        return (0x76 ^ 0x67) & ~(0x6E ^ 0x7F);
    }

    @ConfigItem(position=43, name="Food (or drink) to use", description="What food (or drink) to withdraw from bank and use", keyName="pickpocket.food", hidden=true, unhide="training.method", unhideValue="Pickpocketing", section="Training")
    default public e pickpocketFood() {
        return e.NONE;
    }

    static {
        TRAINING = "Training";
        EXTRAS = "Extras";
    }

    @ConfigItem(position=81, name="Dodgy Necklace Amount", description="Number of Dodgy Necklaces to keep in inventory", keyName="pickpocketing.dodgyNecklaceAmount", hidden=true, unhide="training.method", unhideValue="Pickpocketing", section="Extras")
    default public int dodgyNecklaceAmount() {
        return 3;
    }

    @ConfigItem(position=80, name="Dodgy Necklace", description="Equip Dodgy Necklace when Pickpocketing", keyName="pickpocketing.dodgyNecklace", hidden=true, unhide="training.method", unhideValue="Pickpocketing", section="Extras")
    default public boolean dodgyNecklace() {
        return false;
    }

    @ConfigItem(position=31, name="NPC", description="What NPC to blackjack", keyName="blackjack.npc", hidden=true, unhide="training.method", unhideValue="Black jack", section="Training")
    default public d blackJackTarget() {
        return d.HIGHEST_LEVEL;
    }

    @ConfigItem(position=61, name="Drink stamina", description="Drink stamina potions before going in", keyName="den.stamina", hidden=true, unhide="training.method", unhideValue="Rogues den", section="Extras")
    default public boolean useStaminaPotion() {
        return ((0x6C ^ 0x21 ^ (0x9F ^ 0x88)) & (185 + 122 - 213 + 130 ^ 79 + 137 - 53 + 23 ^ -1)) != 0;
    }

    @ConfigItem(position=21, name="Stall", description="What stall to steal from", keyName="stall.type", hidden=true, unhide="training.method", unhideValue="Stalls", section="Training")
    default public h stallTarget() {
        return h.CAKE_ARDOUGNE;
    }

    @ConfigItem(position=33, name="Unnote food", description="Should the plugin unnote items when out of food?", keyName="blackjack.unnote", hidden=true, unhide="training.method", unhideValue="Black jack", disabledBy="blackjack.buywines", disabledByValue="true", section="Extras")
    default public boolean unNoteFood() {
        return false;
    }
}

