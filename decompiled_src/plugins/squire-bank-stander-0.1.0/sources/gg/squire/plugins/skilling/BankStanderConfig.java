package gg.squire.plugins.skilling;

import k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.EnumC0001b;
import k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.EnumC0002c;
import k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.EnumC0003d;
import k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.EnumC0004e;
import k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.EnumC0005f;
import k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.EnumC0006g;
import k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.EnumC0007h;
import k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.EnumC0008i;
import k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.EnumC0009j;
import k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.EnumC0010k;
import k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.EnumC0011l;
import k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.EnumC0012m;
import k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.EnumC0013n;
import k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.EnumC0014o;
import k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.EnumC0015p;
import k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.EnumC0016q;
import k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.r;
import k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.s;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
@ConfigGroup("squirebankstander")
/* loaded from: squire-bank-stander-0.1.0.jar:gg/squire/plugins/skilling/BankStanderConfig.class */
public interface BankStanderConfig extends Config {
    @ConfigSection(name = "Select an activity", description = "Select activity to do", position = 1)
    public static final /* synthetic */ String activitySection = "Activity";
    @ConfigSection(name = "Select a product to make", description = "Select a product to make", position = 2)
    public static final /* synthetic */ String productSection = "productSection";

    @ConfigItem(keyName = "arrowProduct", name = "Product", description = "What do you want to make", section = "productSection", hidden = true, unhide = "activity.method", unhideValue = "Arrows", position = 110)
    default EnumC0003d arrowProduct() {
        return EnumC0003d.BROAD;
    }

    @ConfigItem(keyName = "bowProduct", name = "Bow to string", description = "What bow do you want to string", section = "productSection", hidden = true, unhide = "activity.method", unhideValue = "String bows", position = 32)
    default EnumC0007h stringableBow() {
        return EnumC0007h.MAPLE_LONGBOW;
    }

    @ConfigItem(keyName = "smithingBar", name = "Bar to use", description = "What bar should we be smithing?", section = "productSection", hidden = true, unhide = "activity.method", unhideValue = "Smithing", position = 70)
    default EnumC0004e smithingBar() {
        return EnumC0004e.BRONZE;
    }

    @ConfigItem(keyName = "bolt", name = "Product", description = "What do you want to make", section = "productSection", hidden = true, unhide = "activity.method", unhideValue = "Bolts", position = 90)
    default EnumC0006g bolt() {
        return EnumC0006g.BROAD;
    }

    @ConfigItem(keyName = "armour", name = "Armour", description = "What do you want to make", section = "productSection", hidden = true, unhide = "activity.method", unhideValue = "Armour", position = 110)
    default EnumC0002c armourProduct() {
        return EnumC0002c.BLUE_DHIDE_BODY;
    }

    @ConfigItem(keyName = "smithingProduct", name = "Product", description = "What do you want to make", section = "productSection", hidden = true, unhide = "activity.method", unhideValue = "Smithing", position = 71)
    default r smithingProduct() {
        return r.PLATEBODY;
    }

    @ConfigItem(keyName = "oreToSmelt", name = "Ore To Smelt", description = "What do you want to make", section = "productSection", hidden = true, unhide = "activity.method", unhideValue = "Smelting", position = 110)
    default EnumC0004e smeltingProduct() {
        return EnumC0004e.RUNITE;
    }

    @ConfigItem(keyName = "oneTick", name = "One tick cook?", description = "Do you want to cook one tick?", section = "productSection", hidden = true, unhide = "cookingProduct", unhideValue = "KARAMBWAN", position = 41)
    default boolean oneTick() {
        return (true ^ true) & ((true ^ true) ^ true);
    }

    @ConfigItem(position = 11, name = "Activity", section = "Activity", keyName = "activity.method", description = "The training method to use")
    default EnumC0001b activity() {
        return EnumC0001b.GLASS_MAKE;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int, boolean] */
    @ConfigItem(keyName = "glassMakeRunePouch", name = "Use rune pouch", description = "Should we use the rune pouch?", section = "productSection", hidden = true, unhide = "activity.method", unhideValue = "Glass make")
    default boolean glassMakeRunePouch() {
        return " ".length();
    }

    @ConfigItem(keyName = "seaweedToUse", name = "Seaweed to use", description = "What seaweed should we be glassing?", section = "productSection", hidden = true, unhide = "activity.method", unhideValue = "Glass make")
    default EnumC0016q seaweed() {
        return EnumC0016q.GIANT_SEAWEED;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int, boolean] */
    @ConfigItem(keyName = "glassMakePickGlass", name = "Pick up molten glass", description = "Should we pick up molten glass from the floor?", section = "productSection", hidden = true, unhide = "activity.method", unhideValue = "Glass make", position = 30)
    default boolean glassMakePickGlass() {
        return " ".length();
    }

    @ConfigItem(keyName = "alchItem", name = "Item ids/names", description = "Items to alch specified by their id/name, separated by commas", section = "productSection", hidden = true, unhide = "activity.method", unhideValue = "Alching", position = 1)
    default String alchItems() {
        return "1315,Rune platebody";
    }

    @ConfigItem(keyName = "glassProduct", name = "Product", description = "What glass product do you want to make", section = "productSection", hidden = true, unhide = "activity.method", unhideValue = "Glass blowing", position = 20)
    default EnumC0013n glassProduct() {
        return EnumC0013n.LANTERN_LENS;
    }

    @ConfigItem(keyName = "dart", name = "Product", description = "What do you want to make", section = "productSection", hidden = true, unhide = "activity.method", unhideValue = "Darts", position = 90)
    default EnumC0009j dart() {
        return EnumC0009j.ADAMANT;
    }

    @ConfigItem(keyName = "zeroTickProduct", name = "Product", description = "What do you want to make", section = "productSection", hidden = true, unhide = "activity.method", unhideValue = "Zero tick", position = 110)
    default s zeroTickProduct() {
        return s.COMPOST;
    }

    @ConfigItem(keyName = "enchantingProduct", name = "Product", description = "What do you want to make", section = "productSection", hidden = true, unhide = "activity.method", unhideValue = "Enchanting", position = 100)
    default EnumC0010k enchantingProduct() {
        return EnumC0010k.EMERALD_AMULET;
    }

    @ConfigItem(keyName = "gemProduct", name = "Gem To Cut", description = "What do you want to cut", section = "productSection", hidden = true, unhide = "activity.method", unhideValue = "Gem cutting", position = 50)
    default EnumC0012m cuttingProduct() {
        return EnumC0012m.EMERALD;
    }

    @ConfigItem(keyName = "arrowShaftLogs", name = "Logs used", description = "What logs should be used for arrow shafts?", section = "productSection", hidden = true, unhide = "fletchProduct", unhideValue = "ARROW_SHAFT", position = 31)
    default EnumC0015p arrowShaftLogs() {
        return EnumC0015p.MAPLE;
    }

    @ConfigItem(keyName = "cookingProduct", name = "Product", description = "What do you want to cook", section = "productSection", hidden = true, unhide = "activity.method", unhideValue = "Cooking", position = 40)
    default EnumC0008i cookingProduct() {
        return EnumC0008i.KARAMBWAN;
    }

    @ConfigItem(keyName = "jewerlyProduct", name = "Product", description = "What do you want to make", section = "productSection", hidden = true, unhide = "activity.method", unhideValue = "Jewelry", position = 60)
    default EnumC0014o jewelryProduct() {
        return EnumC0014o.ZENYTE_AMULET;
    }

    @ConfigItem(keyName = "battlestaff", name = "Product", description = "What do you want to make", section = "productSection", hidden = true, unhide = "activity.method", unhideValue = "Battlestaves", position = 80)
    default EnumC0005f battlestaff() {
        return EnumC0005f.AIR;
    }

    @ConfigItem(keyName = "fletchProduct", name = "Product", description = "What fletch stuff do you want to cut", section = "productSection", hidden = true, unhide = "activity.method", unhideValue = "Fletch cutting", position = 30)
    default EnumC0011l fletchingProduct() {
        return EnumC0011l.SHORTBOW_U;
    }
}
