/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 *  net.runelite.client.config.ConfigSection
 */
package gg.squire.plugins.skilling;

import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.c;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.d;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.e;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.f;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.g;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.h;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.i;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.j;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.k;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.l;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.m;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.n;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.o;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.p;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.q;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.r;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.s;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;

@ConfigGroup(value="squirebankstander")
public interface BankStanderConfig
extends Config {
    @ConfigSection(name="Select a product to make", description="Select a product to make", position=2)
    public static final /* synthetic */ String productSection;
    @ConfigSection(name="Select an activity", description="Select activity to do", position=1)
    public static final /* synthetic */ String activitySection;

    @ConfigItem(keyName="arrowProduct", name="Product", description="What do you want to make", section="productSection", hidden=true, unhide="activity.method", unhideValue="Arrows", position=110)
    default public d arrowProduct() {
        return d.BROAD;
    }

    @ConfigItem(keyName="bowProduct", name="Bow to string", description="What bow do you want to string", section="productSection", hidden=true, unhide="activity.method", unhideValue="String bows", position=32)
    default public h stringableBow() {
        return h.MAPLE_LONGBOW;
    }

    @ConfigItem(keyName="smithingBar", name="Bar to use", description="What bar should we be smithing?", section="productSection", hidden=true, unhide="activity.method", unhideValue="Smithing", position=70)
    default public e smithingBar() {
        return e.BRONZE;
    }

    @ConfigItem(keyName="bolt", name="Product", description="What do you want to make", section="productSection", hidden=true, unhide="activity.method", unhideValue="Bolts", position=90)
    default public g bolt() {
        return g.BROAD;
    }

    @ConfigItem(keyName="armour", name="Armour", description="What do you want to make", section="productSection", hidden=true, unhide="activity.method", unhideValue="Armour", position=110)
    default public c armourProduct() {
        return c.BLUE_DHIDE_BODY;
    }

    @ConfigItem(keyName="smithingProduct", name="Product", description="What do you want to make", section="productSection", hidden=true, unhide="activity.method", unhideValue="Smithing", position=71)
    default public r smithingProduct() {
        return r.PLATEBODY;
    }

    @ConfigItem(keyName="oreToSmelt", name="Ore To Smelt", description="What do you want to make", section="productSection", hidden=true, unhide="activity.method", unhideValue="Smelting", position=110)
    default public e smeltingProduct() {
        return e.RUNITE;
    }

    @ConfigItem(keyName="oneTick", name="One tick cook?", description="Do you want to cook one tick?", section="productSection", hidden=true, unhide="cookingProduct", unhideValue="KARAMBWAN", position=41)
    default public boolean oneTick() {
        return ((0x6E ^ 0x6A) & ~(0xA1 ^ 0xA5)) != 0;
    }

    @ConfigItem(position=11, name="Activity", section="Activity", keyName="activity.method", description="The training method to use")
    default public b activity() {
        return b.GLASS_MAKE;
    }

    @ConfigItem(keyName="glassMakeRunePouch", name="Use rune pouch", description="Should we use the rune pouch?", section="productSection", hidden=true, unhide="activity.method", unhideValue="Glass make")
    default public boolean glassMakeRunePouch() {
        return " ".length() != 0;
    }

    @ConfigItem(keyName="seaweedToUse", name="Seaweed to use", description="What seaweed should we be glassing?", section="productSection", hidden=true, unhide="activity.method", unhideValue="Glass make")
    default public q seaweed() {
        return q.GIANT_SEAWEED;
    }

    @ConfigItem(keyName="glassMakePickGlass", name="Pick up molten glass", description="Should we pick up molten glass from the floor?", section="productSection", hidden=true, unhide="activity.method", unhideValue="Glass make", position=30)
    default public boolean glassMakePickGlass() {
        return " ".length() != 0;
    }

    @ConfigItem(keyName="alchItem", name="Item ids/names", description="Items to alch specified by their id/name, separated by commas", section="productSection", hidden=true, unhide="activity.method", unhideValue="Alching", position=1)
    default public String alchItems() {
        return "1315,Rune platebody";
    }

    @ConfigItem(keyName="glassProduct", name="Product", description="What glass product do you want to make", section="productSection", hidden=true, unhide="activity.method", unhideValue="Glass blowing", position=20)
    default public n glassProduct() {
        return n.LANTERN_LENS;
    }

    @ConfigItem(keyName="dart", name="Product", description="What do you want to make", section="productSection", hidden=true, unhide="activity.method", unhideValue="Darts", position=90)
    default public j dart() {
        return j.ADAMANT;
    }

    @ConfigItem(keyName="zeroTickProduct", name="Product", description="What do you want to make", section="productSection", hidden=true, unhide="activity.method", unhideValue="Zero tick", position=110)
    default public s zeroTickProduct() {
        return s.COMPOST;
    }

    @ConfigItem(keyName="enchantingProduct", name="Product", description="What do you want to make", section="productSection", hidden=true, unhide="activity.method", unhideValue="Enchanting", position=100)
    default public k enchantingProduct() {
        return k.EMERALD_AMULET;
    }

    @ConfigItem(keyName="gemProduct", name="Gem To Cut", description="What do you want to cut", section="productSection", hidden=true, unhide="activity.method", unhideValue="Gem cutting", position=50)
    default public m cuttingProduct() {
        return m.EMERALD;
    }

    @ConfigItem(keyName="arrowShaftLogs", name="Logs used", description="What logs should be used for arrow shafts?", section="productSection", hidden=true, unhide="fletchProduct", unhideValue="ARROW_SHAFT", position=31)
    default public p arrowShaftLogs() {
        return p.MAPLE;
    }

    @ConfigItem(keyName="cookingProduct", name="Product", description="What do you want to cook", section="productSection", hidden=true, unhide="activity.method", unhideValue="Cooking", position=40)
    default public i cookingProduct() {
        return i.KARAMBWAN;
    }

    @ConfigItem(keyName="jewerlyProduct", name="Product", description="What do you want to make", section="productSection", hidden=true, unhide="activity.method", unhideValue="Jewelry", position=60)
    default public o jewelryProduct() {
        return o.ZENYTE_AMULET;
    }

    static {
        activitySection = "Activity";
        productSection = "productSection";
    }

    @ConfigItem(keyName="battlestaff", name="Product", description="What do you want to make", section="productSection", hidden=true, unhide="activity.method", unhideValue="Battlestaves", position=80)
    default public f battlestaff() {
        return f.AIR;
    }

    @ConfigItem(keyName="fletchProduct", name="Product", description="What fletch stuff do you want to cut", section="productSection", hidden=true, unhide="activity.method", unhideValue="Fletch cutting", position=30)
    default public l fletchingProduct() {
        return l.SHORTBOW_U;
    }
}

