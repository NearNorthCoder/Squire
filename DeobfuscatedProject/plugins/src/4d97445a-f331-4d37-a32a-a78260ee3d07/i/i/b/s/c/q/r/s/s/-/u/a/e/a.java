/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ComparisonChain
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  net.runelite.api.Actor
 *  net.runelite.api.Client
 *  net.runelite.api.InventoryID
 *  net.runelite.api.Item
 *  net.runelite.api.ItemContainer
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.Projectile
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.AnimationChanged
 *  net.runelite.api.events.GameTick
 *  net.runelite.api.events.NpcDespawned
 *  net.runelite.api.events.NpcSpawned
 *  net.runelite.api.events.ProjectileSpawned
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.game.ItemManager
 *  net.runelite.http.api.item.ItemEquipmentStats
 *  net.runelite.http.api.item.ItemStats
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Reachable
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import com.google.common.collect.ComparisonChain;
import gg.squire.client.util.Log;
import i.i.b.s.c.q.r.s.s.-.u.a.e.b;
import i.i.b.s.c.q.r.s.s.-.u.a.e.d;
import i.i.b.s.c.q.r.s.s.-.u.a.e.e;
import i.i.b.s.c.q.r.s.s.-.u.a.e.f;
import i.i.b.s.c.q.r.s.s.-.u.a.e.g;
import i.i.b.s.c.q.r.s.s.-.u.a.e.i;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.runelite.api.ItemContainer;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Projectile;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.NpcDespawned;
import net.runelite.api.events.NpcSpawned;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.game.ItemManager;
import net.runelite.http.api.item.ItemEquipmentStats;
import net.runelite.http.api.item.ItemStats;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Reachable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
public class a {
    private static final /* synthetic */ int k;
    private static final /* synthetic */ int i;
    private static final /* synthetic */ int p;
    private static final /* synthetic */ int c;
    private static final /* synthetic */ int e;
    private static final /* synthetic */ int o;
    private /* synthetic */ int C;
    private final /* synthetic */ List<f> t;
    private static final /* synthetic */ int f;
    private static final /* synthetic */ int m;
    private /* synthetic */ i A;
    @Inject
    private /* synthetic */ ItemManager w;
    private /* synthetic */ int B;
    private static final /* synthetic */ int h;
    @Inject
    private /* synthetic */ Client v;
    private static final /* synthetic */ int j;
    private final /* synthetic */ List<Long> u;
    private static final /* synthetic */ int l;
    public static final /* synthetic */ int b;
    private final /* synthetic */ List<NPC> s;
    private /* synthetic */ int D;
    private static final /* synthetic */ int g;
    private static final /* synthetic */ int d;
    private /* synthetic */ boolean z;
    private static /* synthetic */ int[] llIIIII;
    private static final /* synthetic */ Set<Integer> r;
    private /* synthetic */ Prayer x;
    private static final /* synthetic */ int q;
    private static /* synthetic */ String[] lIlllll;
    private /* synthetic */ d y;
    private static final /* synthetic */ Logger a;
    private static final /* synthetic */ int n;

    public TileObject b() {
        return TileObjects.getNearest(tileObject -> {
            int n2;
            String[] stringArray = new String[llIIIII[1]];
            stringArray[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[0]] = lIlllll[llIIIII[28]];
            if (i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIlIIl(tileObject.hasAction(stringArray) ? 1 : 0) && i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIlIIl(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                n2 = llIIIII[1];
                "".length();
                if (-"   ".length() > 0) {
                    return ((0x60 ^ 0x58) & ~(0x3F ^ 7)) != 0;
                }
            } else {
                n2 = llIIIII[0];
            }
            return n2 != 0;
        });
    }

    private void e() {
        ItemEquipmentStats lllIlIllIlllllI;
        ItemStats lllIlIllIllllll;
        int lllIlIlllIIIIIl;
        int lllIlIlllIIIIlI;
        a lllIlIlllIIlIIl;
        if (i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIIIII(this.y)) {
            return;
        }
        int lllIlIlllIIlIII = llIIIII[0];
        int lllIlIlllIIIlll = llIIIII[0];
        int lllIlIlllIIIllI = llIIIII[0];
        ItemContainer lllIlIlllIIIlIl = lllIlIlllIIlIIl.v.getItemContainer(InventoryID.EQUIPMENT);
        if (i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIlIII(lllIlIlllIIIlIl)) {
            Item[] lllIlIlllIIIlII;
            Item[] lllIlIlllIIIIll = lllIlIlllIIIlII = lllIlIlllIIIlIl.getItems();
            lllIlIlllIIIIlI = lllIlIlllIIIIll.length;
            lllIlIlllIIIIIl = llIIIII[0];
            while (i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIIIIl(lllIlIlllIIIIIl, lllIlIlllIIIIlI)) {
                Item lllIlIlllIIIIII = lllIlIlllIIIIll[lllIlIlllIIIIIl];
                if (i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIIIII(lllIlIlllIIIIII)) {
                    "".length();
                    if ("  ".length() > "   ".length()) {
                        return;
                    }
                } else {
                    lllIlIllIllllll = lllIlIlllIIlIIl.w.getItemStats(lllIlIlllIIIIII.getId(), llIIIII[0]);
                    if (i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIIIII(lllIlIllIllllll)) {
                        "".length();
                        if (null != null) {
                            return;
                        }
                    } else {
                        lllIlIllIlllllI = lllIlIllIllllll.getEquipment();
                        if (i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIIIII(lllIlIllIlllllI)) {
                            "".length();
                            if (((0x45 ^ 0x6D) & ~(0xAB ^ 0x83)) != ((0x48 ^ 5) & ~(0xE1 ^ 0xAC))) {
                                return;
                            }
                        } else {
                            lllIlIlllIIlIII += lllIlIllIlllllI.getDstab();
                            lllIlIlllIIIlll += lllIlIllIlllllI.getDmagic();
                            lllIlIlllIIIllI += lllIlIllIlllllI.getDrange();
                        }
                    }
                }
                ++lllIlIlllIIIIIl;
                "".length();
                if (null == null) continue;
                return;
            }
        }
        int lllIlIlllIIIlII = lllIlIlllIIlIIl.v.getBoostedSkillLevel(Skill.MAGIC);
        int lllIlIlllIIIIll = lllIlIlllIIlIIl.v.getBoostedSkillLevel(Skill.DEFENCE);
        lllIlIlllIIIIlI = (int)((double)lllIlIlllIIIlII * 0.7 + (double)lllIlIlllIIIIll * 0.3) + lllIlIlllIIIlll;
        lllIlIlllIIIIIl = lllIlIlllIIIIll + lllIlIlllIIIllI;
        int lllIlIlllIIIIII = lllIlIlllIIIIll + lllIlIlllIIlIII;
        lllIlIllIllllll = lllIlIlllIIlIIl.v.getLocalPlayer();
        if (i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIlIII(lllIlIllIllllll)) {
            lllIlIllIlllllI = lllIlIlllIIlIIl.v.getLocalPlayer().getWorldLocation();
            WorldPoint lllIlIllIllllIl = lllIlIlllIIlIIl.y.y().getWorldLocation();
            if (!i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIlIll(lllIlIllIlllllI.getX(), lllIlIllIllllIl.getX() - llIIIII[1]) || !i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIIIll(lllIlIllIlllllI.getX(), lllIlIllIllllIl.getX() + llIIIII[6]) || !i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIlIll(lllIlIllIlllllI.getY(), lllIlIllIllllIl.getY() - llIIIII[1]) || i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIIllI(lllIlIllIlllllI.getY(), lllIlIllIllllIl.getY() + llIIIII[6])) {
                lllIlIlllIIIIII = llIIIII[26];
            }
        }
        if (i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIIIll(lllIlIlllIIIIlI, lllIlIlllIIIIIl) && i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIIIll(lllIlIlllIIIIlI, lllIlIlllIIIIII)) {
            lllIlIlllIIlIIl.x = Prayer.PROTECT_FROM_MAGIC;
            "".length();
            if ((0x76 ^ 0x73) <= 0) {
                return;
            }
        } else if (i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIIIll(lllIlIlllIIIIIl, lllIlIlllIIIIII)) {
            lllIlIlllIIlIIl.x = Prayer.PROTECT_FROM_MISSILES;
            "".length();
            if ((0x4C ^ 0x48) > (0x3F ^ 0x3B)) {
                return;
            }
        } else {
            lllIlIlllIIlIIl.x = Prayer.PROTECT_FROM_MELEE;
        }
    }

    public a() {
        this.s = new ArrayList<NPC>();
        this.t = new ArrayList<f>();
        this.u = new ArrayList<Long>();
        this.x = Prayer.PROTECT_FROM_MAGIC;
        this.z = llIIIII[0];
        this.B = llIIIII[0];
    }

    private static boolean llIIIIIII(Object object) {
        return object == null;
    }

    private static String lIlllllII(String lllIlIllIlIIlll, String lllIlIllIlIIlII) {
        try {
            SecretKeySpec lllIlIllIlIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIlIllIlIIlII.getBytes(StandardCharsets.UTF_8)), llIIIII[11]), "DES");
            Cipher lllIlIllIlIlIIl = Cipher.getInstance("DES");
            lllIlIllIlIlIIl.init(llIIIII[2], lllIlIllIlIlIlI);
            return new String(lllIlIllIlIlIIl.doFinal(Base64.getDecoder().decode(lllIlIllIlIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIlIllIlIlIII) {
            lllIlIllIlIlIII.printStackTrace();
            return null;
        }
    }

    public Prayer j() {
        return this.x;
    }

    /*
     * WARNING - void declaration
     */
    public boolean c() {
        void lllIllIIIIllIll;
        TileObject tileObject = this.b();
        if (i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIIIII(tileObject)) {
            Log.info((String)lIlllll[llIIIII[0]]);
            return llIIIII[0];
        }
        WorldPoint lllIllIIIIllIlI = Players.getLocal().getWorldLocation();
        WorldPoint lllIllIIIIllIIl = lllIllIIIIllIll.getWorldLocation();
        if (i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIIIIl(lllIllIIIIllIlI.getY(), lllIllIIIIllIIl.getY())) {
            Log.info((String)lIlllll[llIIIII[1]]);
            lllIllIIIIllIll.interact(lIlllll[llIIIII[2]]);
            return llIIIII[1];
        }
        Log.info((String)lIlllll[llIIIII[3]]);
        return llIIIII[0];
    }

    private static String lIllllIll(String lllIlIllIIllIlI, String lllIlIllIIllIIl) {
        try {
            SecretKeySpec lllIlIllIIlllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIlIllIIllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllIlIllIIlllII = Cipher.getInstance("Blowfish");
            lllIlIllIIlllII.init(llIIIII[2], lllIlIllIIlllIl);
            return new String(lllIlIllIIlllII.doFinal(Base64.getDecoder().decode(lllIlIllIIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIlIllIIllIll) {
            lllIlIllIIllIll.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIllI(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    private void a(NpcDespawned npcDespawned) {
        a lllIlIllllIllII;
        void lllIlIllllIlIlI;
        NPC nPC = npcDespawned.getNpc();
        g g2 = i.i.b.s.c.q.r.s.s.-.u.a.e.g.b(nPC);
        if (i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIlIII((Object)g2)) {
            System.out.println("Despawned a " + g2);
            this.s.remove(nPC);
            "".length();
        }
        if (i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIlIII(lllIlIllllIlIlI.getName()) && i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIlIIl(lllIlIllllIlIlI.getName().toLowerCase().contains(lIlllll[llIIIII[25]]) ? 1 : 0)) {
            lllIlIllllIllII.a();
        }
        if (i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIIIII(lllIlIllllIllII.y) && i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIIlII(lllIlIllllIllII.s.isEmpty() ? 1 : 0)) {
            lllIlIllllIllII.s.clear();
        }
    }

    public void a(i i2) {
        this.A = i2;
    }

    private static int llIIIIIlI(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    private static boolean llIIIlIII(Object object) {
        return object != null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void d() {
        a lllIlIlllIlllll;
        this.t.clear();
        if (i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIIIII(this.y)) {
            return;
        }
        e lllIlIlllIllllI = lllIlIlllIlllll.y.C();
        if (i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIIIII((Object)lllIlIlllIllllI)) {
            return;
        }
        int lllIlIlllIlllIl = lllIlIlllIlllll.y.A();
        int lllIlIlllIlllII = lllIlIlllIlllll.y.w();
        i lllIlIlllIllIll = lllIlIlllIlllll.y.a(llIIIII[1], lllIlIlllIlllII);
        i lllIlIlllIllIlI = lllIlIlllIlllll.y.B();
        int lllIlIlllIllIIl = llIIIII[0];
        if (i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIlIII((Object)lllIlIlllIllIlI)) {
            lllIlIlllIllIIl = lllIlIlllIllIlI.S();
        }
        int lllIlIlllIllIII = lllIlIlllIlllll.C + llIIIII[1];
        do {
            block38: {
                block39: {
                    block41: {
                        block40: {
                            block37: {
                                g lllIlIlllIlIlll;
                                if (!i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIIIll(lllIlIlllIllIII, lllIlIlllIlllll.C + llIIIII[7])) {
                                    return;
                                }
                                if (!i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIIlIl(lllIlIlllIlllll.s.size(), llIIIII[3])) break block37;
                                if (i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIIlIl(lllIlIlllIlllll.y.D(), lllIlIlllIllIII - llIIIII[15])) {
                                    lllIlIlllIlIlll = i.i.b.s.c.q.r.s.s.-.u.a.e.g.b(lllIlIlllIlllll.s.get(llIIIII[0]));
                                    "".length();
                                    if (((1 + 161 - 5 + 39 ^ 146 + 154 - 195 + 52) & (0x4D ^ 0x27 ^ (0xA7 ^ 0x94) ^ -" ".length())) > "  ".length()) {
                                        return;
                                    }
                                } else if (i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIIlIl(lllIlIlllIlllll.y.D(), lllIlIlllIllIII - llIIIII[17])) {
                                    lllIlIlllIlIlll = i.i.b.s.c.q.r.s.s.-.u.a.e.g.b(lllIlIlllIlllll.s.get(lllIlIlllIlllll.s.size() - llIIIII[2]));
                                    "".length();
                                } else if (i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIIlIl(lllIlIlllIlllll.y.D(), lllIlIlllIllIII - llIIIII[19])) {
                                    lllIlIlllIlIlll = i.i.b.s.c.q.r.s.s.-.u.a.e.g.b(lllIlIlllIlllll.s.get(lllIlIlllIlllll.s.size() - llIIIII[1]));
                                    "".length();
                                    if ("   ".length() == 0) {
                                        return;
                                    }
                                } else {
                                    lllIlIlllIlIlll = null;
                                }
                                if (!i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIlIII((Object)lllIlIlllIlIlll)) break block37;
                                switch (i.i.b.s.c.q.r.s.s.-.u.a.e.b.E[lllIlIlllIlIlll.L().ordinal()]) {
                                    case 1: {
                                        lllIlIlllIlllll.t.add(new f(lllIlIlllIllIII, i.i.b.s.c.q.r.s.s.-.u.a.e.e.GHOST_MELEE));
                                        "".length();
                                        "".length();
                                        if ("  ".length() >= ((0x53 ^ 0x25 ^ (0x76 ^ 0xD)) & (0xCA ^ 0x8D ^ (0x11 ^ 0x5B) ^ -" ".length()))) break;
                                        return;
                                    }
                                    case 2: {
                                        lllIlIlllIlllll.t.add(new f(lllIlIlllIllIII, i.i.b.s.c.q.r.s.s.-.u.a.e.e.GHOST_RANGED));
                                        "".length();
                                        "".length();
                                        if (" ".length() > 0) break;
                                        return;
                                    }
                                    case 3: {
                                        lllIlIlllIlllll.t.add(new f(lllIlIlllIllIII, i.i.b.s.c.q.r.s.s.-.u.a.e.e.GHOST_MAGIC));
                                        "".length();
                                        break;
                                    }
                                }
                                "".length();
                                if (-"   ".length() > 0) {
                                    return;
                                }
                                break block38;
                            }
                            if (!i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIlIlI((Object)lllIlIlllIllIll, (Object)i.i.b.s.c.q.r.s.s.-.u.a.e.i.TRIPLE)) break block39;
                            if (!i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIlIlI((Object)lllIlIlllIlllll.y.F(), (Object)i.i.b.s.c.q.r.s.s.-.u.a.e.e.MAGIC)) break block40;
                            if (i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIIlIl(lllIlIlllIlllIl + llIIIII[8], lllIlIlllIllIII)) {
                                lllIlIlllIlllll.t.add(new f(lllIlIlllIllIII, i.i.b.s.c.q.r.s.s.-.u.a.e.e.RANGED));
                                "".length();
                                "".length();
                                if (" ".length() == "   ".length()) {
                                    return;
                                }
                                break block38;
                            } else if (i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIIlIl(lllIlIlllIlllIl + llIIIII[10], lllIlIlllIllIII)) {
                                lllIlIlllIlllll.t.add(new f(lllIlIlllIllIII, i.i.b.s.c.q.r.s.s.-.u.a.e.e.MELEE));
                                "".length();
                                "".length();
                                if (-" ".length() > 0) {
                                    return;
                                }
                            }
                            break block38;
                        }
                        if (!i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIlIlI((Object)lllIlIlllIlllll.y.F(), (Object)i.i.b.s.c.q.r.s.s.-.u.a.e.e.RANGED)) break block41;
                        if (i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIIlIl(lllIlIlllIlllIl + llIIIII[8], lllIlIlllIllIII)) {
                            lllIlIlllIlllll.t.add(new f(lllIlIlllIllIII, i.i.b.s.c.q.r.s.s.-.u.a.e.e.MELEE));
                            "".length();
                            "".length();
                            if (((113 + 60 - 136 + 121 ^ 162 + 49 - 193 + 167) & (0xC9 ^ 0xC3 ^ (0x7F ^ 0x52) ^ -" ".length())) != 0) {
                                return;
                            }
                        }
                        break block38;
                    }
                    if (!i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIIIII((Object)lllIlIlllIlllll.y.F())) break block38;
                    if (i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIIlIl(lllIlIlllIlllIl + lllIlIlllIllIIl + llIIIII[2], lllIlIlllIllIII)) {
                        lllIlIlllIlllll.t.add(new f(lllIlIlllIllIII, i.i.b.s.c.q.r.s.s.-.u.a.e.e.MAGIC));
                        "".length();
                        "".length();
                        if (-"  ".length() >= 0) {
                            return;
                        }
                        break block38;
                    } else if (i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIIlIl(lllIlIlllIlllIl + lllIlIlllIllIIl + llIIIII[6], lllIlIlllIllIII)) {
                        lllIlIlllIlllll.t.add(new f(lllIlIlllIllIII, i.i.b.s.c.q.r.s.s.-.u.a.e.e.RANGED));
                        "".length();
                        "".length();
                    }
                    break block38;
                }
                if (i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIlIlI((Object)lllIlIlllIllIll, (Object)i.i.b.s.c.q.r.s.s.-.u.a.e.i.AUTO) && i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIIlIl(lllIlIlllIlllIl + lllIlIlllIllIIl + llIIIII[1], lllIlIlllIllIII)) {
                    if (i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIlIlI(lllIlIlllIlllll.x, Prayer.PROTECT_FROM_MAGIC)) {
                        lllIlIlllIlllll.t.add(new f(lllIlIlllIllIII, i.i.b.s.c.q.r.s.s.-.u.a.e.e.MAGIC));
                        "".length();
                        "".length();
                    } else if (i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIlIlI(lllIlIlllIlllll.x, Prayer.PROTECT_FROM_MISSILES)) {
                        lllIlIlllIlllll.t.add(new f(lllIlIlllIllIII, i.i.b.s.c.q.r.s.s.-.u.a.e.e.RANGED));
                        "".length();
                        "".length();
                        if (" ".length() == 0) {
                            return;
                        }
                    } else if (i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIlIlI(lllIlIlllIlllll.x, Prayer.PROTECT_FROM_MELEE)) {
                        lllIlIlllIlllll.t.add(new f(lllIlIlllIllIII, i.i.b.s.c.q.r.s.s.-.u.a.e.e.MELEE));
                        "".length();
                    }
                }
            }
            ++lllIlIlllIllIII;
            "".length();
        } while ("  ".length() >= "  ".length());
    }

    private static boolean llIIIIIll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llIIIIlII(int n2) {
        return n2 == 0;
    }

    public d k() {
        return this.y;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    private void a(ProjectileSpawned projectileSpawned) {
        a lllIllIIIIIlIll;
        void lllIllIIIIIlIlI;
        if (i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIIIII(this.y)) {
            return;
        }
        Projectile lllIllIIIIIlIIl = lllIllIIIIIlIlI.getProjectile();
        int lllIllIIIIIlIII = lllIllIIIIIlIll.y.w();
        i lllIllIIIIIIlll = lllIllIIIIIlIll.y.a(llIIIII[1], lllIllIIIIIlIII);
        lllIllIIIIIlIll.a(lllIllIIIIIIlll);
        switch (lllIllIIIIIlIIl.getId()) {
            case 1242: {
                Object[] objectArray = new Object[llIIIII[6]];
                objectArray[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[0]] = lllIllIIIIIlIll.C;
                objectArray[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[1]] = lllIllIIIIIlIll.y.z() + llIIIII[1];
                objectArray[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[2]] = lllIllIIIIIlIII;
                objectArray[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[3]] = lllIllIIIIIIlll;
                objectArray[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[8]] = lIlllll[llIIIII[6]];
                Log.debug((String)lIlllll[llIIIII[8]], (Object[])objectArray);
                if (i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIIlll((Object)lllIllIIIIIIlll, (Object)i.i.b.s.c.q.r.s.s.-.u.a.e.i.TRIPLE)) {
                    lllIllIIIIIlIll.y.b(i.i.b.s.c.q.r.s.s.-.u.a.e.i.AUTO);
                    "".length();
                    if ((0x4E ^ 0x4B) <= 0) {
                        return;
                    }
                } else {
                    lllIllIIIIIlIll.y.a(i.i.b.s.c.q.r.s.s.-.u.a.e.e.MAGIC);
                }
                lllIllIIIIIlIll.y.a(lllIllIIIIIlIll.C, i.i.b.s.c.q.r.s.s.-.u.a.e.e.MAGIC);
                "".length();
                if (null == null) break;
                return;
            }
            case 1245: {
                Object[] objectArray = new Object[llIIIII[6]];
                objectArray[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[0]] = lllIllIIIIIlIll.C;
                objectArray[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[1]] = lllIllIIIIIlIll.y.z() + llIIIII[1];
                objectArray[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[2]] = lllIllIIIIIlIII;
                objectArray[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[3]] = lllIllIIIIIIlll;
                objectArray[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[8]] = lIlllll[llIIIII[10]];
                a.debug(lIlllll[llIIIII[9]], objectArray);
                if (i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIIlll((Object)lllIllIIIIIIlll, (Object)i.i.b.s.c.q.r.s.s.-.u.a.e.i.TRIPLE)) {
                    lllIllIIIIIlIll.y.b(i.i.b.s.c.q.r.s.s.-.u.a.e.i.AUTO);
                    "".length();
                    if ("  ".length() <= 0) {
                        return;
                    }
                } else {
                    lllIllIIIIIlIll.y.a(i.i.b.s.c.q.r.s.s.-.u.a.e.e.RANGED);
                }
                lllIllIIIIIlIll.y.a(lllIllIIIIIlIll.C, i.i.b.s.c.q.r.s.s.-.u.a.e.e.RANGED);
                "".length();
                if (((0xD ^ 0) & ~(0x5C ^ 0x51)) == 0) break;
                return;
            }
            case 34: {
                if (!i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIIlII(lllIllIIIIIlIll.s.isEmpty() ? 1 : 0)) break;
                Object[] objectArray = new Object[llIIIII[6]];
                objectArray[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[0]] = lllIllIIIIIlIll.C;
                objectArray[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[1]] = lllIllIIIIIlIll.y.z() + llIIIII[1];
                objectArray[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[2]] = lllIllIIIIIlIII;
                objectArray[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[3]] = lllIllIIIIIIlll;
                objectArray[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[8]] = lIlllll[llIIIII[12]];
                Log.debug((String)lIlllll[llIIIII[11]], (Object[])objectArray);
                "".length();
                if ("  ".length() == "  ".length()) break;
                return;
            }
            case 100: {
                if (!i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIIlII(lllIllIIIIIlIll.s.isEmpty() ? 1 : 0)) break;
                Object[] objectArray = new Object[llIIIII[6]];
                objectArray[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[0]] = lllIllIIIIIlIll.C;
                objectArray[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[1]] = lllIllIIIIIlIll.y.z() + llIIIII[1];
                objectArray[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[2]] = lllIllIIIIIlIII;
                objectArray[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[3]] = lllIllIIIIIIlll;
                objectArray[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[8]] = lIlllll[llIIIII[13]];
                Log.debug((String)lIlllll[llIIIII[7]], (Object[])objectArray);
                "".length();
                if (((0xAC ^ 0xBF ^ (0xB2 ^ 0xBA)) & (0x4C ^ 0x67 ^ (0xAB ^ 0x9B) ^ -" ".length())) >= 0) break;
                return;
            }
            case 1248: {
                if (!i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIIlII(lllIllIIIIIlIll.s.isEmpty() ? 1 : 0)) break;
                Object[] objectArray = new Object[llIIIII[6]];
                objectArray[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[0]] = lllIllIIIIIlIll.C;
                objectArray[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[1]] = lllIllIIIIIlIll.y.z() + llIIIII[1];
                objectArray[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[2]] = lllIllIIIIIlIII;
                objectArray[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[3]] = lllIllIIIIIIlll;
                objectArray[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[8]] = lIlllll[llIIIII[15]];
                Log.debug((String)lIlllll[llIIIII[14]], (Object[])objectArray);
                "".length();
                if (((0x32 ^ 0x26 ^ (0x15 ^ 0x35)) & (167 + 83 - 182 + 108 ^ 110 + 50 - 34 + 6 ^ -" ".length())) == 0) break;
                return;
            }
        }
    }

    public boolean g() {
        int n2;
        if (i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIlIII(this.y) && i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIlIII(this.y.y()) && i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIIlIl(this.y.y().getAnimation(), llIIIII[27])) {
            n2 = llIIIII[1];
            "".length();
            if (((0x56 ^ 0x5D ^ (0x3A ^ 0x18)) & (0x2E ^ 0x49 ^ (0x29 ^ 0x67) ^ -" ".length()) & ((0x54 ^ 0x44 ^ (0x26 ^ 0x7F)) & (25 + 214 - 66 + 42 ^ 34 + 131 - 12 + 5 ^ -" ".length()) ^ -" ".length())) > ((127 + 46 - 78 + 110 ^ 43 + 11 - 53 + 142) & (215 + 8 - 133 + 141 ^ 122 + 120 - 157 + 80 ^ -" ".length()))) {
                return ((187 + 12 - 17 + 39 ^ 139 + 4 - 90 + 135) & (0xA6 ^ 0xA1 ^ (0xE3 ^ 0x85) ^ -" ".length())) != 0;
            }
        } else {
            n2 = llIIIII[0];
        }
        return n2 != 0;
    }

    private static boolean llIIIIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlllllIl(String lllIlIllIIIlIlI, String lllIlIllIIIlIIl) {
        lllIlIllIIIlIlI = new String(Base64.getDecoder().decode(lllIlIllIIIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllIlIllIIIlIII = new StringBuilder();
        char[] lllIlIllIIIIlll = lllIlIllIIIlIIl.toCharArray();
        int lllIlIllIIIIllI = llIIIII[0];
        char[] lllIlIllIIIIIII = lllIlIllIIIlIlI.toCharArray();
        int lllIlIlIlllllll = lllIlIllIIIIIII.length;
        int lllIlIlIllllllI = llIIIII[0];
        while (i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIIIIl(lllIlIlIllllllI, lllIlIlIlllllll)) {
            char lllIlIllIIIlIll = lllIlIllIIIIIII[lllIlIlIllllllI];
            lllIlIllIIIlIII.append((char)(lllIlIllIIIlIll ^ lllIlIllIIIIlll[lllIlIllIIIIllI % lllIlIllIIIIlll.length]));
            "".length();
            ++lllIlIllIIIIllI;
            ++lllIlIlIllllllI;
            "".length();
            if (((0xAE ^ 0xBF) & ~(0x7C ^ 0x6D)) <= 0) continue;
            return null;
        }
        return String.valueOf(lllIlIllIIIlIII);
    }

    public boolean l() {
        return this.z;
    }

    private static boolean llIIIlIll(int n2, int n3) {
        return n2 >= n3;
    }

    public void a(int n2) {
        this.B = n2;
    }

    public int n() {
        return this.B;
    }

    @Subscribe
    private void onGameTick(GameTick gameTick) {
        NPC lllIllIIIIlIIll;
        a lllIllIIIIlIlII;
        NPC nPC3;
        if (i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIIIII(this.y)) {
            nPC3 = null;
            "".length();
            if (-(18 + 125 - 125 + 159 ^ 32 + 110 - 3 + 42) > 0) {
                return;
            }
        } else {
            nPC3 = lllIllIIIIlIlII.y.y();
        }
        if (i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIIIII(lllIllIIIIlIIll = nPC3)) {
            lllIllIIIIlIlII.s.clear();
        }
        if (i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIIIIl(lllIllIIIIlIlII.B + llIIIII[4], lllIllIIIIlIlII.C)) {
            lllIllIIIIlIlII.s.clear();
        }
        if (i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIIIll(lllIllIIIIlIlII.u.size(), lllIllIIIIlIlII.D)) {
            lllIllIIIIlIlII.u.add(System.currentTimeMillis());
            "".length();
            "".length();
            if (-" ".length() >= ((0x99 ^ 0xA5 ^ (0xAE ^ 0xA4)) & (171 + 124 - 161 + 42 ^ 107 + 90 - 140 + 77 ^ -" ".length()))) {
                return;
            }
        } else {
            lllIllIIIIlIlII.u.set(lllIllIIIIlIlII.D, System.currentTimeMillis());
            "".length();
        }
        long lllIllIIIIlIIlI = 0L;
        int lllIllIIIIlIIIl = llIIIII[0];
        while (i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIIIIl(lllIllIIIIlIIIl, lllIllIIIIlIlII.u.size())) {
            if (i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIIlII(i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIIIlI(lllIllIIIIlIIlI, 0L))) {
                lllIllIIIIlIIlI = lllIllIIIIlIlII.u.get(lllIllIIIIlIIIl) + (long)(llIIIII[5] * ((lllIllIIIIlIlII.D - lllIllIIIIlIIIl + llIIIII[6]) % llIIIII[6]));
                "".length();
                if ((0x8C ^ 0x89) == 0) {
                    return;
                }
            } else {
                lllIllIIIIlIIlI = Math.min(lllIllIIIIlIIlI, lllIllIIIIlIlII.u.get(lllIllIIIIlIIIl) + (long)(llIIIII[5] * ((lllIllIIIIlIlII.D - lllIllIIIIlIIIl + llIIIII[6]) % llIIIII[6])));
            }
            ++lllIllIIIIlIIIl;
            "".length();
            if (null == null) continue;
            return;
        }
        lllIllIIIIlIlII.D = (lllIllIIIIlIlII.D + llIIIII[1]) % llIIIII[6];
        lllIllIIIIlIlII.C += llIIIII[1];
        if (i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIIlIl(lllIllIIIIlIlII.C % llIIIII[7], llIIIII[3])) {
            lllIllIIIIlIlII.e();
        }
        lllIllIIIIlIlII.d();
        if (i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIIllI(lllIllIIIIlIlII.s.size(), llIIIII[1])) {
            lllIllIIIIlIlII.s.sort((nPC, nPC2) -> ComparisonChain.start().compare(nPC.getLocalLocation().getY(), nPC2.getLocalLocation().getY()).compare(nPC.getLocalLocation().getX(), nPC2.getLocalLocation().getX()).result());
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    private void a(AnimationChanged animationChanged) {
        a lllIlIlllllllll;
        void lllIlIllllllllI;
        if (i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIIIII(this.y)) {
            return;
        }
        Actor lllIlIlllllllIl = lllIlIllllllllI.getActor();
        NPC lllIlIlllllllII = lllIlIlllllllll.y.y();
        if (!i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIlIII(lllIlIlllllllII) || i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIIlll(lllIlIlllllllIl, lllIlIlllllllII)) {
            return;
        }
        int lllIlIllllllIll = lllIlIlllllllII.getAnimation();
        int lllIlIllllllIlI = lllIlIlllllllll.y.w();
        i lllIlIllllllIIl = lllIlIlllllllll.y.a(llIIIII[1], lllIlIllllllIlI);
        switch (lllIlIllllllIll) {
            case 4491: {
                Object[] objectArray = new Object[llIIIII[6]];
                objectArray[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[0]] = lllIlIlllllllll.C;
                objectArray[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[1]] = lllIlIlllllllll.y.z() + llIIIII[1];
                objectArray[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[2]] = lllIlIllllllIlI;
                objectArray[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[3]] = lllIlIllllllIIl;
                objectArray[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[8]] = lIlllll[llIIIII[17]];
                Log.debug((String)lIlllll[llIIIII[16]], (Object[])objectArray);
                lllIlIlllllllll.y.a(null);
                lllIlIlllllllll.y.b(lllIlIllllllIIl);
                lllIlIlllllllll.y.a(lllIlIlllllllll.C, i.i.b.s.c.q.r.s.s.-.u.a.e.e.MELEE);
                "".length();
                if (((0xFB ^ 0x86 ^ (0xDB ^ 0xBB)) & (0x1E ^ 0x12 ^ (0xD2 ^ 0xC3) ^ -" ".length())) <= 0) break;
                return;
            }
            case 4493: {
                Object[] objectArray = new Object[llIIIII[6]];
                objectArray[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[0]] = lllIlIlllllllll.C;
                objectArray[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[1]] = lllIlIlllllllll.y.z() + llIIIII[1];
                objectArray[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[2]] = lllIlIllllllIlI;
                objectArray[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[3]] = lllIlIllllllIIl;
                objectArray[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[8]] = lIlllll[llIIIII[19]];
                Log.debug((String)lIlllll[llIIIII[18]], (Object[])objectArray);
                lllIlIlllllllll.y.b(i.i.b.s.c.q.r.s.s.-.u.a.e.i.LAVA);
                lllIlIlllllllll.y.a(lllIlIlllllllll.C, i.i.b.s.c.q.r.s.s.-.u.a.e.e.LAVA);
                "".length();
                if ((61 + 143 - 113 + 65 ^ 66 + 68 - 79 + 98) > 0) break;
                return;
            }
            case 4494: {
                Object[] objectArray = new Object[llIIIII[6]];
                objectArray[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[0]] = lllIlIlllllllll.C;
                objectArray[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[1]] = lllIlIlllllllll.y.z() + llIIIII[1];
                objectArray[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[2]] = lllIlIllllllIlI;
                objectArray[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[3]] = lllIlIllllllIIl;
                objectArray[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[8]] = lIlllll[llIIIII[21]];
                Log.debug((String)lIlllll[llIIIII[20]], (Object[])objectArray);
                lllIlIlllllllll.y.b(i.i.b.s.c.q.r.s.s.-.u.a.e.i.GHOSTS);
                lllIlIlllllllll.y.d(lllIlIlllllllll.C);
                lllIlIlllllllll.y.a(System.currentTimeMillis());
                lllIlIlllllllll.y.a(lllIlIlllllllll.C, i.i.b.s.c.q.r.s.s.-.u.a.e.e.GHOSTS);
                "".length();
                if (null == null) break;
                return;
            }
            case 4486: 
            case 4487: {
                lllIlIlllllllll.y = new d(lllIlIlllllllll.y.y());
                lllIlIlllllllll.C = llIIIII[0];
                lllIlIlllllllll.t.clear();
                lllIlIlllllllll.u.clear();
                lllIlIlllllllll.D = llIIIII[0];
                lllIlIlllllllll.y.a(lllIlIlllllllll.C, i.i.b.s.c.q.r.s.s.-.u.a.e.e.SPAWN);
                "".length();
                if ((0xC ^ 8) != "   ".length()) break;
                return;
            }
            case -1: 
            case 4489: 
            case 4490: {
                "".length();
                if ((0x1C ^ 0x19) != 0) break;
                return;
            }
            case 4495: {
                lllIlIlllllllll.y = null;
                lllIlIlllllllll.s.clear();
                "".length();
                if ("  ".length() >= "  ".length()) break;
                return;
            }
            default: {
                Object[] objectArray = new Object[llIIIII[2]];
                objectArray[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[0]] = lllIlIlllllllll.C;
                objectArray[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[1]] = lllIlIllllllIll;
                Log.debug((String)lIlllll[llIIIII[22]], (Object[])objectArray);
            }
        }
    }

    private static boolean llIIIlIIl(int n2) {
        return n2 != 0;
    }

    public void a(NPC nPC) {
        this.y = new d(nPC);
    }

    /*
     * WARNING - void declaration
     */
    public boolean f() {
        void lllIlIllIllIlIl;
        int[] nArray = this.v.getMapRegions();
        int n2 = nArray.length;
        int lllIlIllIllIlII = llIIIII[0];
        while (i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIIIIl(lllIlIllIllIlII, (int)lllIlIllIllIlIl)) {
            void lllIlIllIllIllI;
            void lllIlIllIllIIll = lllIlIllIllIllI[lllIlIllIllIlII];
            if (i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIlIIl(r.contains((int)lllIlIllIllIIll) ? 1 : 0)) {
                return llIIIII[1];
            }
            ++lllIlIllIllIlII;
            "".length();
            if ("   ".length() >= "  ".length()) continue;
            return ((0x56 ^ 0x65) & ~(0x92 ^ 0xA1)) != 0;
        }
        return llIIIII[0];
    }

    private static void lIlllllll() {
        llIIIII = new int[47];
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[0] = "  ".length() & ("  ".length() ^ -" ".length());
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[1] = " ".length();
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[2] = "  ".length();
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[3] = "   ".length();
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[4] = 0x69 ^ 0x28;
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[5] = -(0xFFFFECE4 & 0x3FBF) & (0xFFFFEEFF & 0x3FFB);
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[6] = 0x5F ^ 0x5A;
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[7] = 0x47 ^ 0x4D;
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[8] = 0x49 ^ 0x78 ^ (0xB1 ^ 0x84);
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[9] = 0x40 ^ 0x46;
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[10] = 0x6B ^ 0x3B ^ (0x2A ^ 0x7D);
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[11] = 199 + 142 - 197 + 57 ^ 81 + 63 - -37 + 12;
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[12] = 0x23 ^ 0x2A;
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[13] = 0x26 ^ 0x2D;
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[14] = 88 + 20 - 38 + 83 ^ 148 + 41 - 59 + 19;
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[15] = 0x23 ^ 0x2E;
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[16] = 0xB6 ^ 0xB1 ^ (0xB8 ^ 0xB1);
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[17] = 0x5B ^ 0x54;
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[18] = 0x4F ^ 0x5F;
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[19] = 0x39 ^ 0x28;
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[20] = 0xD3 ^ 0xC1;
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[21] = 81 + 89 - 23 + 37 ^ 61 + 149 - 48 + 9;
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[22] = 0x23 ^ 0x63 ^ (0xE1 ^ 0xB5);
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[23] = 0x7A ^ 0x6F;
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[24] = 0x73 ^ 0x65;
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[25] = 0x42 ^ 0x6C ^ (0x6E ^ 0x57);
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[26] = -" ".length() & (0xFFFFFFFF & Integer.MAX_VALUE);
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[27] = 0xFFFFD7BD & 0x39CF;
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[28] = 0xBF ^ 0xA7;
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[29] = -(0xFFFFE49D & 0x7B6B) & (0xFFFFFFBE & 0x71CF);
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[30] = 0xFFFFEFDD & 0x14FF;
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[31] = 0xFFFFF1BF & 0x1FCF;
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[32] = -(0xFFFFEED9 & 0x5D67) & (0xFFFFDFE7 & 0x7DDF);
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[33] = -" ".length();
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[34] = -(0xFFFFE325 & 0x7CFF) & (0xFFFFFFFD & 0x71AF);
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[35] = -(0xFFFFDD9F & 0x6B75) & (0xFFFFFDF5 & 0x4FFE);
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[36] = 0xFFFF9FFB & 0x718F;
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[37] = 0x3F ^ 0x25 ^ (0x3C ^ 0x42);
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[38] = 0xFFFFFFDE & 0x11AB;
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[39] = 100 + 181 - 112 + 55 ^ 108 + 57 - 49 + 78;
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[40] = 0xFFFFFF9E & 0x11EF;
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[41] = 0xFFFF95DF & 0x6EFF;
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[42] = -(0xFFFFBAA6 & 0x575F) & (0xFFFFB7FF & 0x5EDF);
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[43] = -(0xFFFFBC8D & 0x6F7F) & (0xFFFFFF3F & 0x3FDF);
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[44] = 0xFFFFB756 & 0x5CBD;
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[45] = -(0xFFFFF857 & 0x67AD) & (0xFFFFF53F & 0x7FD7);
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[46] = 0xF ^ 0 ^ (0x58 ^ 0x4E);
    }

    public i m() {
        return this.A;
    }

    private static boolean llIIIlIlI(Object object, Object object2) {
        return object == object2;
    }

    public void a(Prayer prayer) {
        this.x = prayer;
    }

    static {
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.lIlllllll();
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.lIllllllI();
        d = llIIIII[29];
        m = llIIIII[30];
        k = llIIIII[31];
        e = llIIIII[32];
        c = llIIIII[33];
        q = llIIIII[17];
        f = llIIIII[34];
        p = llIIIII[35];
        h = llIIIII[36];
        o = llIIIII[37];
        g = llIIIII[38];
        n = llIIIII[39];
        j = llIIIII[40];
        b = llIIIII[41];
        l = llIIIII[42];
        i = llIIIII[27];
        a = LoggerFactory.getLogger(a.class);
        r = Set.of(Integer.valueOf(llIIIII[43]), Integer.valueOf(llIIIII[44]), Integer.valueOf(llIIIII[45]));
    }

    private static boolean llIIIIlll(Object object, Object object2) {
        return object != object2;
    }

    public List<f> i() {
        return this.t;
    }

    public List<NPC> h() {
        return this.s;
    }

    public void a() {
        this.x = Prayer.PROTECT_FROM_MAGIC;
        this.a((i)null);
        this.a(llIIIII[0]);
        this.y = null;
        this.C = llIIIII[0];
        this.D = llIIIII[0];
        this.s.clear();
        this.t.clear();
        this.u.clear();
    }

    private static void lIllllllI() {
        lIlllll = new String[llIIIII[46]];
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.lIlllll[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[0]] = i.i.b.s.c.q.r.s.s.-.u.a.e.a.lIllllIll("7i+eFVearu10a4GO5l4OwLFw+975Nz+P6rKxQKOxnGs=", "gtXxo");
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.lIlllll[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[1]] = i.i.b.s.c.q.r.s.s.-.u.a.e.a.lIllllIll("LO9naEgfYF/LmK0eNieiXJRgsbEufMvFcaJajqaNtyTV/8YwyhUfBQ==", "KJHgi");
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.lIlllll[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[2]] = i.i.b.s.c.q.r.s.s.-.u.a.e.a.lIllllIll("1oTj4PGHcLYTGbQ+Y4ptoQ==", "pgYmP");
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.lIlllll[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[3]] = i.i.b.s.c.q.r.s.s.-.u.a.e.a.lIlllllII("XpdpEGRoBSmTKbnbtAuLFduOnkGO8H+PpN6Uhu25oyFNgyPE7RDyn67KwtbcWTdM", "Yjdln");
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.lIlllll[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[8]] = i.i.b.s.c.q.r.s.s.-.u.a.e.a.lIllllIll("J0VpteAfXUltzVLIDGnJaKcHOk0LIMv0rSeqtfQBY8pvkjsh6BBYvKTjBIyWZhbq4+8R+E5Jj/0zfApdmuNiBZ4PZVjv/X1a", "kHRNl");
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.lIlllll[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[6]] = i.i.b.s.c.q.r.s.s.-.u.a.e.a.lIllllIll("jSp/Gde/FTc=", "MNGgD");
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.lIlllll[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[9]] = i.i.b.s.c.q.r.s.s.-.u.a.e.a.lIlllllIl("MCorHw0+KC1HIipnZhstIyolEWQsNmpaOjI5JDIpajA7VnkyMzYfOiMuIjstIyolEWQsNmpaOjI5JCorOCEjGS0+JyNHIio=", "WKFzY");
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.lIlllll[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[10]] = i.i.b.s.c.q.r.s.s.-.u.a.e.a.lIlllllII("br9OncRNhIU=", "BNDhJ");
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.lIlllll[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[11]] = i.i.b.s.c.q.r.s.s.-.u.a.e.a.lIlllllIl("FAYBCRcaBAdROA5LTA03BwYPB34IGkBMIBYVDiQzThwRQGMWHxwJIAcCCC03BwYPB34IGkBMJBsIHxgTAQgGCSAHDgAJfgga", "sgllC");
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.lIlllll[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[12]] = i.i.b.s.c.q.r.s.s.-.u.a.e.a.lIlllllIl("JQweAiYz", "wMPEc");
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.lIlllll[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[7]] = i.i.b.s.c.q.r.s.s.-.u.a.e.a.lIlllllII("Q/0H3wBOXrih71yggCjGhRjDtStYB69PaZB20yW/yEhjF/STeKukOGgCC2CqTKd4UmfNCXNigaiNDHSxZLPjmcfSnlDAjGDpDiaZx3ksASU=", "QajRL");
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.lIlllll[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[13]] = i.i.b.s.c.q.r.s.s.-.u.a.e.a.lIlllllIl("GhIrAwY=", "WSlJE");
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.lIlllll[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[14]] = i.i.b.s.c.q.r.s.s.-.u.a.e.a.lIllllIll("sG5Rnvl+VFLb/PurRt7onfYTsYuDkPPrKfbFN87Xdw5rcGfPn4Gh063NU5CUdQ3q4A+pvxxhB5/IEp1LOm6QwSW2vsUvjX2Uk6hvEd5bKYE=", "UaudK");
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.lIlllll[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[15]] = i.i.b.s.c.q.r.s.s.-.u.a.e.a.lIlllllII("oQa25mthpKw=", "FyEjs");
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.lIlllll[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[16]] = i.i.b.s.c.q.r.s.s.-.u.a.e.a.lIlllllII("dasUdeg4gyxzkqcbv2tHPZ8gPWwUHnlelST5n8P7nUPN89U3MfPVLaAFeSjkhs+W8MpgFqCm/GuL1O6lujzd19tkb6FqoWEI", "PhaRF");
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.lIlllll[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[17]] = i.i.b.s.c.q.r.s.s.-.u.a.e.a.lIlllllIl("HjUnFxw=", "SpkRY");
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.lIlllll[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[18]] = i.i.b.s.c.q.r.s.s.-.u.a.e.a.lIlllllII("P5n6r8HGj3vDzCvKGseUztCHqqDxr9YdYhMkZ/jKZfG8aqKXL2wKM2CeumLnf3QnRIphpNVpSMp0coVku8XvPDN1EU0jX6DZ", "zEDVV");
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.lIlllll[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[19]] = i.i.b.s.c.q.r.s.s.-.u.a.e.a.lIlllllIl("BDEjEg==", "HpuSX");
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.lIlllll[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[20]] = i.i.b.s.c.q.r.s.s.-.u.a.e.a.lIlllllII("VIHabj6ud2Drg1iRwD0Ah9UxUiflfy4YRU4rbAsPscffxszgHGo8IgEXr85ASrqMnV13Lk27CaxUQTXLRPy9W5H8SQYNhuhr", "FckUw");
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.lIlllll[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[21]] = i.i.b.s.c.q.r.s.s.-.u.a.e.a.lIllllIll("jYgBv5jHpe0=", "WjAWB");
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.lIlllll[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[22]] = i.i.b.s.c.q.r.s.s.-.u.a.e.a.lIlllllIl("NRs6FyQ7GTxPCy9WdxMeOxc2Bhk9FB4WTSkHd1olHDEZPSccUw==", "RzWrp");
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.lIlllll[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[23]] = i.i.b.s.c.q.r.s.s.-.u.a.e.a.lIlllllII("o5twYzbL5DMkMO0z6+l0Lw==", "RjyKS");
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.lIlllll[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[24]] = i.i.b.s.c.q.r.s.s.-.u.a.e.a.lIlllllII("PZT+4quvjqjbVCT34jtbAjndBXahDiWDG640pDz+ZEk=", "FkYJV");
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.lIlllll[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[25]] = i.i.b.s.c.q.r.s.s.-.u.a.e.a.lIlllllII("gEL47XsukJGwORQp3l6hiQ==", "qpory");
        i.i.b.s.c.q.r.s.s.-.u.a.e.a.lIlllll[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[28]] = i.i.b.s.c.q.r.s.s.-.u.a.e.a.lIllllIll("BZgF/FBP2oTTN6Ce7TZ39g==", "dHimo");
    }

    public void a(boolean bl2) {
        this.z = bl2;
    }

    public int o() {
        return this.C;
    }

    private static boolean llIIIIlIl(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    private void a(NpcSpawned npcSpawned) {
        void lllIlIlllllIIlI;
        NPC nPC = npcSpawned.getNpc();
        if (i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIIIII(this.y) && i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIlIII(nPC) && i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIlIII(nPC.getName()) && i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIlIIl(nPC.getName().toLowerCase().contains(lIlllll[llIIIII[23]]) ? 1 : 0)) {
            Object[] objectArray = new Object[llIIIII[2]];
            objectArray[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[0]] = nPC.getName();
            objectArray[i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIII[1]] = nPC.getId();
            Log.debug((String)lIlllll[llIIIII[24]], (Object[])objectArray);
            this.y = new d(nPC);
            this.C = llIIIII[0];
            this.D = llIIIII[0];
            this.t.clear();
            this.u.clear();
        }
        if (i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIIIII(lllIlIlllllIIlI)) {
            return;
        }
        g lllIlIlllllIIIl = i.i.b.s.c.q.r.s.s.-.u.a.e.g.b((NPC)lllIlIlllllIIlI);
        if (i.i.b.s.c.q.r.s.s.-.u.a.e.a.llIIIlIII((Object)lllIlIlllllIIIl)) {
            a lllIlIlllllIlII;
            System.out.println("Spawned a " + lllIlIlllllIIIl);
            lllIlIlllllIlII.s.add((NPC)lllIlIlllllIIlI);
            "".length();
            lllIlIlllllIlII.a(lllIlIlllllIlII.C);
        }
    }
}

