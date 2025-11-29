package gg.squire.thieving;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.Range;
import s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e.EnumC0001b;
import s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e.EnumC0003d;
import s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e.EnumC0004e;
import s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e.EnumC0005f;
import s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e.EnumC0007h;
@ConfigGroup("squirethiever")
/* loaded from: squire-thieving-0.0.1.jar:gg/squire/thieving/SquireThievingConfig.class */
public interface SquireThievingConfig extends Config {
    @ConfigSection(name = "Training", description = "Settings for training", position = 0)
    public static final /* synthetic */ String TRAINING = "Training";
    @ConfigSection(name = "Extras", description = "Additional settings", position = 5)
    public static final /* synthetic */ String EXTRAS = "Extras";

    @ConfigItem(position = 11, name = "Training method", keyName = "training.method", description = "The training method to use", section = "Training")
    default EnumC0001b method() {
        return EnumC0001b.BLACK_JACK;
    }

    @ConfigItem(position = 22, name = "Drop useless fruit", keyName = "stall.dropfruit", description = "Drop useless fruit", hidden = true, unhide = "training.method", unhideValue = "Stalls", section = "Training")
    default boolean dropFruit() {
        return (true ^ true) & ((true ^ true) ^ true);
    }

    @ConfigItem(position = 20, name = "Redemption healing", description = "Whether to use redemption to heal (instead of food)", keyName = "redemptionHealing", hidden = true, unhide = "training.method", unhideValue = "Pickpocketing", section = "Extras")
    default boolean redemptionHeal() {
        return (true ^ true) & ((true ^ true) ^ true);
    }

    @ConfigItem(position = 30, name = "Shadow Veil", description = "Use Shadow Veil when Pickpocketing", keyName = "pickpocketing.shadowveil", hidden = true, unhide = "training.method", unhideValue = "Pickpocketing", section = "Extras")
    default boolean shadowVeil() {
        return (true ^ true) & ((true ^ true) ^ true);
    }

    @ConfigItem(position = 40, name = "Gem Bag", description = "Use Gem Bag when Pickpocketing", keyName = "pickpocketing.gembag", hidden = true, unhide = "npc.type", unhideValue = "VYRE", section = "Extras")
    default boolean gemBag() {
        return (true ^ true) & ((true ^ true) ^ true);
    }

    @ConfigItem(position = 42, name = "Wander range", description = "What range to pickpocket within", keyName = "npc.range", hidden = true, unhide = "training.method", unhideValue = "Pickpocketing", section = "Training")
    @Range(min = 1, max = 18)
    default int wanderRange() {
        return "   ".length();
    }

    @ConfigItem(position = 45, name = "Eat at HP", description = "HP to eat at", keyName = "thieving.eathp", section = "Training")
    @Range(min = 1, max = 99)
    default int eatHP() {
        return 120 ^ 68;
    }

    @ConfigItem(position = 10, name = "Seed Vault", description = "Deposit seeds in seed vault", keyName = "pickpocketing.seeds", hidden = true, unhide = "npc.type", unhideValue = "MASTER_FARMER", section = "Extras")
    default boolean depositSeedVault() {
        return (true ^ true) & ((true ^ true) ^ true);
    }

    @ConfigItem(position = 41, name = "Target NPC", description = "What NPC to pickpocket from", keyName = "npc.type", hidden = true, unhide = "training.method", unhideValue = "Pickpocketing", section = "Training")
    default EnumC0005f pickpocketTarget() {
        return EnumC0005f.ARDY_KNIGHT;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(position = 32, name = "Buy wines", description = "Should the plugin purchase wines when out of food?", keyName = "blackjack.buywines", hidden = true, unhide = "training.method", unhideValue = "Black jack", disabledBy = "blackjack.unnote", disabledByValue = "true", section = "Extras")
    default boolean buyWines() {
        return ((((105 + 195) - 221) + 125) ^ (((44 + 174) - 111) + 91)) & (((158 ^ 171) ^ (139 ^ 180)) ^ (-" ".length()));
    }

    @ConfigItem(position = 11, name = "Seed Box", description = "Use Seed Box when Pickpocketing", keyName = "pickpocketing.seedbox", hidden = true, unhide = "npc.type", unhideValue = "MASTER_FARMER", section = "Extras")
    default boolean useSeedBox() {
        return (true ^ true) & ((true ^ true) ^ true);
    }

    @ConfigItem(position = 44, name = "Quantity of Food/Drink", description = "Quantity of food/drink to withdraw from bank", keyName = "pickpocket.amount", hidden = true, unhide = "training.method", unhideValue = "Pickpocketing", section = "Training")
    default int pickpocketFoodAmount() {
        return (118 ^ 103) & ((110 ^ 127) ^ (-1));
    }

    @ConfigItem(position = 43, name = "Food (or drink) to use", description = "What food (or drink) to withdraw from bank and use", keyName = "pickpocket.food", hidden = true, unhide = "training.method", unhideValue = "Pickpocketing", section = "Training")
    default EnumC0004e pickpocketFood() {
        return EnumC0004e.NONE;
    }

    @ConfigItem(position = 81, name = "Dodgy Necklace Amount", description = "Number of Dodgy Necklaces to keep in inventory", keyName = "pickpocketing.dodgyNecklaceAmount", hidden = true, unhide = "training.method", unhideValue = "Pickpocketing", section = "Extras")
    default int dodgyNecklaceAmount() {
        return "   ".length();
    }

    @ConfigItem(position = 80, name = "Dodgy Necklace", description = "Equip Dodgy Necklace when Pickpocketing", keyName = "pickpocketing.dodgyNecklace", hidden = true, unhide = "training.method", unhideValue = "Pickpocketing", section = "Extras")
    default boolean dodgyNecklace() {
        return (true ^ true) & ((true ^ true) ^ true);
    }

    @ConfigItem(position = 31, name = "NPC", description = "What NPC to blackjack", keyName = "blackjack.npc", hidden = true, unhide = "training.method", unhideValue = "Black jack", section = "Training")
    default EnumC0003d blackJackTarget() {
        return EnumC0003d.HIGHEST_LEVEL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(position = 61, name = "Drink stamina", description = "Drink stamina potions before going in", keyName = "den.stamina", hidden = true, unhide = "training.method", unhideValue = "Rogues den", section = "Extras")
    default boolean useStaminaPotion() {
        return ((108 ^ 33) ^ (159 ^ 136)) & (((((185 + 122) - 213) + 130) ^ (((79 + 137) - 53) + 23)) ^ (-" ".length()));
    }

    @ConfigItem(position = 21, name = "Stall", description = "What stall to steal from", keyName = "stall.type", hidden = true, unhide = "training.method", unhideValue = "Stalls", section = "Training")
    default EnumC0007h stallTarget() {
        return EnumC0007h.CAKE_ARDOUGNE;
    }

    @ConfigItem(position = 33, name = "Unnote food", description = "Should the plugin unnote items when out of food?", keyName = "blackjack.unnote", hidden = true, unhide = "training.method", unhideValue = "Black jack", disabledBy = "blackjack.buywines", disabledByValue = "true", section = "Extras")
    default boolean unNoteFood() {
        return (true ^ true) & ((true ^ true) ^ true);
    }
}
