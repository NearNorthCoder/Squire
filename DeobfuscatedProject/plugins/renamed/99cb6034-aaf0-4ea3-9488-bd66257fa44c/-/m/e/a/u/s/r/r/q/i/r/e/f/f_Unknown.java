/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.WidgetNode
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.events.ConfigChanged
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Reachable
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.HerbType;
import -.m.e.a.u.s.r.r.q.i.r.e.f.BEnum;
import -.m.e.a.u.s.r.r.q.i.r.e.f.HEnum;
import -.m.e.a.u.s.r.r.q.i.r.e.f.KEnum;
import -.m.e.a.u.s.r.r.q.i.r.e.f.N_Unknown;
import -.m.e.a.u.s.r.r.q.i.r.e.f.HerbType;
import -.m.e.a.u.s.r.r.q.i.r.e.f.am_Unknown;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an_Unknown;
import -.m.e.a.u.s.r.r.q.i.r.e.f.APEnum;
import -.m.e.a.u.s.r.r.q.i.r.e.f.AREnum;
import -.m.e.a.u.s.r.r.q.i.r.e.f.HerbType;
import -.m.e.a.u.s.r.r.q.i.r.e.f.HerbType;
import -.m.e.a.u.s.r.r.q.i.r.e.f.HerbType;
import -.m.e.a.u.s.r.r.q.i.r.e.f.AXEnum;
import -.m.e.a.u.s.r.r.q.i.r.e.f.b_Unknown;
import -.m.e.a.u.s.r.r.q.i.r.e.f.g_Unknown;
import -.m.e.a.u.s.r.r.q.i.r.e.f.i_Unknown;
import -.m.e.a.u.s.r.r.q.i.r.e.f.MEnum;
import -.m.e.a.u.s.r.r.q.i.r.e.f.NEnum;
import -.m.e.a.u.s.r.r.q.i.r.e.f.HerbType;
import -.m.e.a.u.s.r.r.q.i.r.e.f.HerbType;
import -.m.e.a.u.s.r.r.q.i.r.e.f.q_Unknown;
import -.m.e.a.u.s.r.r.q.i.r.e.f.r_Unknown;
import -.m.e.a.u.s.r.r.q.i.r.e.f.x_Unknown;
import gg.squire.farmer.SquireFarmer;
import gg.squire.farmer.SquireFarmerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.WidgetNode;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
public class f_Unknown {
    private static final /* synthetic */ Pattern X;
    private static final /* synthetic */ Logger T;
    private /* synthetic */ N ai;
    private /* synthetic */ Collection<q> al;
    private static final /* synthetic */ Pattern W;
    private final /* synthetic */ r Z;
    private final /* synthetic */ Map<A, Long> ah;
    private final /* synthetic */ SquireFarmerConfig ab;
    private /* synthetic */ q aj;
    private final /* synthetic */ Client aa;
    private final /* synthetic */ b ae;
    private static final /* synthetic */ Pattern U;
    private /* synthetic */ boolean ak;
    private final /* synthetic */ i af;
    private static /* synthetic */ int[] llIIIlIlIllI;
    private final /* synthetic */ Map<A, B> ag;
    private final /* synthetic */ ConfigManager ac;
    private static final /* synthetic */ Pattern V;
    private static /* synthetic */ String[] llIIIlIIIlII;
    private final /* synthetic */ SquireFarmer ad;
    private final /* synthetic */ Map<p, x> Y;

    private static int llllIlIlIIlllI(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    /*
     * WARNING - void declaration
     */
    public WorldPoint u() {
        void var2_2;
        void var114;
        q q2 = this.x();
        if (f.llllIlIIlllllI(q2)) {
            return null;
        }
        p var13 = p.b(var114.X());
        if (f.llllIlIIlllllI((Object)var13)) {
            return null;
        }
        return var2_2.Y();
    }

    @Subscribe
    public void a(ConfigChanged configChanged) {
        if (f.llllIlIlIIIIll(configChanged.getGroup().equals(llIIIlIIIlII[llIIIlIlIllI[0]]) ? 1 : 0)) {
            return;
        }
        this.w();
    }

    /*
     * WARNING - void declaration
     */
    public q y() {
        long l2 = Instant.now().getEpochSecond();
        if (f.llllIlIIllllll(this.ai) && f.llllIlIlIIIIll(this.e(this.ai) ? 1 : 0) && f.llllIlIlIIIIII(this.ai.aM().a(this.aa) ? 1 : 0)) {
            return this.ai.aM();
        }
        p[] var77 = p.W();
        int var105 = var77.length;
        int var12 = llIIIlIlIllI[1];
        while (f.llllIlIlIIIIIl(var12, var105)) {
            f var155;
            p var97 = var77[var12];
            if (f.llllIlIlIIIIll(var155.b(var97) ? 1 : 0)) {
                0;
                if (-(0x91 ^ 0x94) >= 0) {
                    return null;
                }
            } else {
                x var58 = var155.a(var97);
                q var98 = var155.Z.af().get((Object)var97);
                N[] var104 = var98.ae();
                int var20 = var104.length;
                int var87 = llIIIlIlIllI[1];
                while (f.llllIlIlIIIIIl(var87, var20)) {
                    N var102 = var104[var87];
                    if (f.llllIlIlIIIIll(var155.i(var102) ? 1 : 0)) {
                        0;
                        if ((0xC3 ^ 0xC7) == 0) {
                            return null;
                        }
                    } else if (f.llllIlIlIIIIII(var102.aL().aT() ? 1 : 0)) {
                        if (f.llllIlIIlllllI((Object)var58.C(var102)) && f.llllIlIlIIIIII(var155.d(var102) ? 1 : 0)) {
                            0;
                            if (2 < 0) {
                                return null;
                            }
                        } else {
                            void var50;
                            am var53 = var155.j(var102);
                            if (!f.llllIlIIllllll(var53) || f.llllIlIlIIIlIl(f.llllIlIlIIIlII(var53.ba(), (long)var50))) {
                                return var98;
                            }
                        }
                    }
                    ++var87;
                    0;
                    if (2 <= (0x83 ^ 0x91 ^ (0x7D ^ 0x6B))) continue;
                    return null;
                }
            }
            ++var12;
            0;
            if ((0x24 ^ 0x21) > 0) continue;
            return null;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean b(WorldPoint worldPoint) {
        void var3_3;
        void var37;
        f var100;
        if (f.llllIlIIlllllI(this.aj)) {
            return llIIIlIlIllI[0];
        }
        p var71 = p.b(var100.aj.X());
        if (f.llllIlIIlllllI((Object)var71)) {
            return llIIIlIlIllI[1];
        }
        if (f.llllIlIlIIIIlI(var71.Y().distanceTo((WorldPoint)var37), var71.Z())) {
            return llIIIlIlIllI[1];
        }
        if (f.llllIlIIllllIl((Object)var71, (Object)p.GRAPE_VINE_KOUREND)) {
            return llIIIlIlIllI[0];
        }
        NPC var81 = NPCs.getNearest(nPC -> nPC.getName().toLowerCase().contains(llIIIlIIIlII[llIIIlIlIllI[39]]));
        if (f.llllIlIIlllllI(var81)) {
            return llIIIlIlIllI[1];
        }
        return Reachable.isInteractable((Locatable)var3_3);
    }

    /*
     * WARNING - void declaration
     */
    public long c(A a2) {
        long l2;
        Long l3 = this.ah.get((Object)a2);
        if (f.llllIlIIlllllI(l3)) {
            l2 = -1L;
            0;
            if (2 == 0) {
                return 0L;
            }
        } else {
            void var118;
            l2 = var118.longValue();
        }
        return l2;
    }

    private static boolean llllIlIlIIIllI(int n2) {
        return n2 > 0;
    }

    private static int llllIlIlIIllIl(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    private static boolean llllIlIlIIIIIl(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    private boolean i(N n2) {
        int n3;
        f var21;
        void var32;
        if (f.llllIlIIllllIl((Object)n2.aL(), (Object)P.GRAPES)) {
            return llIIIlIlIllI[0];
        }
        q var137 = var32.aM();
        x var7 = var21.b(var137);
        av var9 = var7.C((N)var32);
        if (f.llllIlIIlllllI((Object)var9)) {
            return llIIIlIlIllI[1];
        }
        if (f.llllIlIIllllIl((Object)var9, (Object)av.DEFAULT)) {
            var9 = var21.a(var32.aL());
        }
        if (f.llllIlIlIIIlll((Object)var9, (Object)av.DEFAULT) && f.llllIlIIllllll((Object)var9)) {
            n3 = llIIIlIlIllI[0];
            0;
            
            }
        } else {
            n3 = llIIIlIlIllI[1];
        }
        return n3 != 0;
    }

    private static int llllIlIlIIlIII(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    private static boolean llllIlIIllllIl(Object object, Object object2) {
        return object == object2;
    }

    public boolean t() {
        boolean bl;
        if (f.llllIlIIllllIl((Object)this.ad.a(), (Object)o.HERBS)) {
            bl = llIIIlIlIllI[0];
            0;
            if (3 <= 2) {
                return false;
            }
        } else {
            bl = llIIIlIlIllI[1];
        }
        return bl;
    }

    public long a(int n2, int n3) {
        return this.a(n2, n3, Instant.now().getEpochSecond(), this.ac.getRSProfileKey());
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(WorldPoint worldPoint, int n2) {
        void var158;
        int var84;
        f var40;
        Object var126;
        boolean bl = llIIIlIlIllI[1];
        Object var11 = this.aa.getComponentTable().iterator();
        while (f.llllIlIlIIIIII(var11.hasNext() ? 1 : 0)) {
            var126 = (WidgetNode)var11.next();
            if (f.llllIlIlIIlIIl(var126.getModalMode(), llIIIlIlIllI[0])) {
                return llIIIlIlIllI[1];
            }
            0;
            if (1 < 2) continue;
            return false;
        }
        var11 = Integer.toString(var40.aa.getVarbitValue(llIIIlIlIllI[3]));
        if (f.llllIlIlIIIIll(((String)var11).equals(var40.ac.getRSProfileConfiguration(llIIIlIIIlII[llIIIlIlIllI[4]], llIIIlIIIlII[llIIIlIlIllI[5]])) ? 1 : 0)) {
            var40.ac.setRSProfileConfiguration(llIIIlIIIlII[llIIIlIlIllI[6]], llIIIlIIIlII[llIIIlIlIllI[7]], var11);
            var84 = llIIIlIlIllI[0];
        }
        if (f.llllIlIlIIIIll((var11 = var40.Z.d((WorldPoint)var158)).equals(var40.al) ? 1 : 0)) {
            var40.ak = llIIIlIlIllI[0];
            T.debug(llIIIlIIIlII[llIIIlIlIllI[8]], var11, (Object)var40.aa.getTickCount());
        }
        var126 = var11.iterator();
        while (f.llllIlIlIIIIII(var126.hasNext() ? 1 : 0)) {
            q var45 = (q)var126.next();
            long var63 = Instant.now().getEpochSecond();
            N[] var69 = var45.ae();
            int var17 = var69.length;
            int var68 = llIIIlIlIllI[1];
            while (f.llllIlIlIIIIIl(var68, var17)) {
                block20: {
                    Object var123;
                    an var72;
                    String var62;
                    String var101;
                    N var4;
                    block21: {
                        void var91;
                        block25: {
                            an lllllllllllllllIlIlIIllIllIIllII2;
                            block26: {
                                block22: {
                                    block24: {
                                        String var33;
                                        block19: {
                                            var4 = var69[var68];
                                            int var131 = var4.aO();
                                            var101 = var4.aJ();
                                            var62 = Integer.toString(var40.aa.getVarbitValue(var131));
                                            var33 = var40.ac.getRSProfileConfiguration(llIIIlIIIlII[llIIIlIlIllI[9]], var101);
                                            var72 = var4.aL().f(var40.aa.getVarbitValue(var131));
                                            if (!f.llllIlIIlllllI(var72)) break block19;
                                            0;
                                            if (1 < 0) {
                                                return ((4 ^ 0x4F ^ (0x3F ^ 0x48)) & (0x7C ^ 0x15 ^ (0x57 ^ 2) ^ -1)) != 0;
                                            }
                                            break block20;
                                        }
                                        if (!f.llllIlIIllllll(var33) || !f.llllIlIlIIlIlI(((String[])(var123 = var33.split(llIIIlIIIlII[llIIIlIlIllI[10]]))).length, llIIIlIlIllI[4])) break block21;
                                        if (!f.llllIlIlIIIIII(var123[llIIIlIlIllI[1]].equals(var62) ? 1 : 0)) break block22;
                                        long lllllllllllllllIlIlIIllIllIIllII2 = 0L;
                                        try {
                                            lllllllllllllllIlIlIIllIllIIllII2 = Long.parseLong(var123[llIIIlIlIllI[0]]);
                                        }
                                        catch (NumberFormatException var92) {
                                            // empty catch block
                                        }
                                        0;
                                        if (2 != 2) {
                                            return false;
                                        }
                                        if (!f.llllIlIlIIIllI(f.llllIlIlIIlIII(lllllllllllllllIlIlIIllIllIIllII2 + 300L, var63)) || !f.llllIlIlIIIllI(f.llllIlIlIIlIII(var63 + 30L, lllllllllllllllIlIlIIllIllIIllII2))) break block24;
                                        0;
                                        
                                        }
                                        break block20;
                                    }
                                    0;
                                    if (1 < 0) {
                                        return ((86 + 28 - -35 + 14 ^ 145 + 147 - 268 + 169) & (0xB5 ^ 0xAE ^ (0xF4 ^ 0x8D) ^ -1)) != 0;
                                    }
                                    break block21;
                                }
                                if (!f.llllIlIlIIIIll(var40.ak ? 1 : 0) || !f.llllIlIlIIIIlI((int)var91, llIIIlIlIllI[0])) break block25;
                                lllllllllllllllIlIlIIllIllIIllII2 = var4.aL().f(Integer.parseInt(var123[llIIIlIlIllI[1]]));
                                if (!f.llllIlIIlllllI(lllllllllllllllIlIlIIllIllIIllII2)) break block26;
                                0;
                                if (((30 + 16 - -7 + 76 ^ 74 + 128 - 191 + 136) & (122 + 16 - 122 + 155 ^ 60 + 162 - 217 + 180 ^ -1)) != 0) {
                                    return ((0x8E ^ 0xAC ^ (0xAA ^ 0xB9)) & (159 + 84 - 83 + 20 ^ 55 + 113 - 155 + 120 ^ -1)) != 0;
                                }
                                break block20;
                            }
                            int var74 = lllllllllllllllIlIlIIllIllIIllII2.bd();
                            if (f.llllIlIlIIIIII(var40.a(lllllllllllllllIlIlIIllIllIIllII2, var72) ? 1 : 0)) {
                                Integer var92 = (Integer)var40.ac.getRSProfileConfiguration(llIIIlIIIlII[llIIIlIlIllI[11]], llIIIlIIIlII[llIIIlIlIllI[12]], Integer.TYPE);
                                Integer var90 = (Integer)var40.ac.getRSProfileConfiguration(llIIIlIIIlII[llIIIlIlIllI[13]], llIIIlIIIlII[llIIIlIlIllI[14]], Integer.TYPE);
                                int var2 = (int)Math.abs(Instant.now().getEpochSecond() / 60L % (long)var74 - (long)var74);
                                T.debug(llIIIlIIIlII[llIIIlIlIllI[15]], (Object)var2, (Object)var74);
                                if (f.llllIlIIllllll(var90) && f.llllIlIlIIIIII(var90) && f.llllIlIlIIlIIl(var2, var90 % var74)) {
                                    WorldPoint var14 = var40.aa.getLocalPlayer().getWorldLocation();
                                    Object[] objectArray = new Object[llIIIlIlIllI[6]];
                                    objectArray[f.llIIIlIlIllI[1]] = var2;
                                    objectArray[f.llIIIlIlIllI[0]] = var90;
                                    objectArray[f.llIIIlIlIllI[4]] = var90 % var74;
                                    objectArray[f.llIIIlIlIllI[5]] = var14;
                                    T.error(llIIIlIIIlII[llIIIlIlIllI[16]], objectArray);
                                }
                                if (!f.llllIlIIllllll(var92) || f.llllIlIlIIllII(var74, var92)) {
                                    T.debug(llIIIlIIIlII[llIIIlIlIllI[17]], (Object)var74);
                                    var40.ac.setRSProfileConfiguration(llIIIlIIIlII[llIIIlIlIllI[18]], llIIIlIIIlII[llIIIlIlIllI[19]], (Object)var74);
                                    var40.ac.setRSProfileConfiguration(llIIIlIIIlII[llIIIlIlIllI[20]], llIIIlIIIlII[llIIIlIlIllI[21]], (Object)var2);
                                }
                            }
                            0;
                            if (-1 >= 0) {
                                return ((14 + 155 - 167 + 213 ^ 33 + 49 - 77 + 192) & (0x1D ^ 0x14 ^ (1 ^ 0x1A) ^ -1)) != 0;
                            }
                            break block21;
                        }
                        T.debug(llIIIlIIIlII[llIIIlIlIllI[22]], (Object)var40.ak, (Object)((int)var91));
                    }
                    if (!f.llllIlIlIIIlll((Object)var72.aZ(), (Object)n.DEAD) || f.llllIlIIllllIl((Object)var72.aZ(), (Object)n.HARVESTABLE)) {
                        var40.ae.a(var4, null);
                        var40.af.a(var4, llIIIlIlIllI[1]);
                    }
                    var123 = var62 + ":" + var63;
                    var40.ac.setRSProfileConfiguration(llIIIlIIIlII[llIIIlIlIllI[23]], var101, var123);
                    var84 = llIIIlIlIllI[0];
                }
                ++var68;
                0;
                if (-3 < 0) continue;
                return false;
            }
            0;
            if (2 > 0) continue;
            return false;
        }
        var40.ak = llIIIlIlIllI[1];
        var40.al = var11;
        if (f.llllIlIlIIIIII(var84)) {
            var40.E();
        }
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    @Nullable
    public am a(N n2, String string) {
        void var14_13;
        void var13_12;
        void var16_15;
        void var12_10;
        void var95;
        void var82;
        void var156;
        void var64;
        long l2 = Instant.now().getEpochSecond();
        boolean bl = Integer.toString(m.ON.ordinal()).equals(this.ac.getConfiguration(llIIIlIIIlII[llIIIlIlIllI[27]], string, llIIIlIIIlII[llIIIlIlIllI[28]]));
        boolean bl2 = Boolean.TRUE.equals(this.ac.getConfiguration(llIIIlIIIlII[llIIIlIlIllI[29]], string, llIIIlIIIlII[llIIIlIlIllI[30]], Boolean.class));
        String string2 = n2.aJ();
        String string3 = this.ac.getConfiguration(llIIIlIIIlII[llIIIlIlIllI[31]], string, string2);
        if (f.llllIlIIlllllI(string3)) {
            return null;
        }
        long var29 = 0L;
        int var51 = llIIIlIlIllI[1];
        Object var115 = var64.split(llIIIlIIIlII[llIIIlIlIllI[32]]);
        if (f.llllIlIlIIlIlI(((String[])var115).length, llIIIlIlIllI[4])) {
            try {
                var51 = Integer.parseInt(var115[llIIIlIlIllI[1]]);
                var29 = Long.parseLong(var115[llIIIlIlIllI[0]]);
            }
            catch (NumberFormatException var83) {
                // empty catch block
            }
            0;
            if (3 < 0) {
                return null;
            }
        }
        if (f.llllIlIlIIIlIl(f.llllIlIlIIllIl(var29, 0L))) {
            return null;
        }
        var115 = var156.aL().f(var51);
        if (f.llllIlIIlllllI(var115)) {
            return null;
        }
        int var83 = ((an)var115).bb();
        int var148 = ((an)var115).bc();
        int var94 = ((an)var115).bd();
        if (f.llllIlIlIIIIII((int)var82) && f.llllIlIIllllIl((Object)((an)var115).aY(), (Object)au.WEEDS)) {
            var83 = llIIIlIlIllI[1];
            var148 = llIIIlIlIllI[0];
            var94 = llIIIlIlIllI[1];
        }
        if (f.llllIlIlIIIIII((int)var95)) {
            var94 /= llIIIlIlIllI[7];
        }
        long var34 = 0L;
        if (f.llllIlIlIIIllI(var94)) {
            void var106;
            void var133;
            f var88;
            long var142 = var88.a(var94, llIIIlIlIllI[1], (long)var133, (String)var106);
            long var160 = var88.a(var94, llIIIlIlIllI[1], var29, (String)var106);
            int var85 = (int)(var142 - var160) / (var94 * llIIIlIlIllI[33]);
            var34 = var88.a(var94, var148 - llIIIlIlIllI[0] - var83, var160, (String)var106);
            if (f.llllIlIlIIllII(var83 += var85, var148)) {
                var83 = var148 - llIIIlIlIllI[0];
            }
        }
        return new am(var12_10.aY(), var12_10.aZ(), (long)var16_15, (int)var13_12, (int)var14_13);
    }

    private static boolean llllIlIlIIIlll(Object object, Object object2) {
        return object != object2;
    }

    private static boolean llllIlIIlllllI(Object object) {
        return object == null;
    }

    public B a(A a2) {
        this.E();
        return this.b(a2);
    }

    private static String llllIIllllllll(String var159, String var134) {
        var159 = new String(Base64.getDecoder().decode(var159.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var128 = new StringBuilder();
        char[] var135 = var134.toCharArray();
        int var110 = llIIIlIlIllI[1];
        char[] var61 = var159.toCharArray();
        int var125 = var61.length;
        int var162 = llIIIlIlIllI[1];
        while (f.llllIlIlIIIIIl(var162, var125)) {
            char var6 = var61[var162];
            var128.append((char)(var6 ^ var135[var110 % var135.length]));
            0;
            ++var110;
            ++var162;
            0;
            if (-(0x52 ^ 0x57) < 0) continue;
            return null;
        }
        return String.valueOf(var128);
    }

    private static void llllIlIIllllII() {
        llIIIlIlIllI = new int[52];
        f.llIIIlIlIllI[0] = 1;
        f.llIIIlIlIllI[1] = (0x21 ^ 0x62) & ~(0x36 ^ 0x75);
        f.llIIIlIlIllI[2] = 0xFFFFB6ED & 0x7D7F;
        f.llIIIlIlIllI[3] = 0xFFFFB5B7 & 0x5FFD;
        f.llIIIlIlIllI[4] = 2;
        f.llIIIlIlIllI[5] = 3;
        f.llIIIlIlIllI[6] = 1 ^ 5;
        f.llIIIlIlIllI[7] = 0x1F ^ 0x1A;
        f.llIIIlIlIllI[8] = 0xB1 ^ 0xB7;
        f.llIIIlIlIllI[9] = 0x8E ^ 0x89;
        f.llIIIlIlIllI[10] = 25 + 11 - -94 + 1 ^ 129 + 57 - 102 + 55;
        f.llIIIlIlIllI[11] = 0x90 ^ 0x99;
        f.llIIIlIlIllI[12] = 3 ^ 9;
        f.llIIIlIlIllI[13] = 0x26 ^ 0x2D;
        f.llIIIlIlIllI[14] = 0xF8 ^ 0x94 ^ (0xE5 ^ 0x85);
        f.llIIIlIlIllI[15] = 121 + 112 - 109 + 17 ^ 105 + 101 - 126 + 48;
        f.llIIIlIlIllI[16] = 8 ^ 0x2A ^ (0xB7 ^ 0x9B);
        f.llIIIlIlIllI[17] = 0x3E ^ 0x1C ^ (0x2A ^ 7);
        f.llIIIlIlIllI[18] = 0x86 ^ 0x9D ^ (0x81 ^ 0x8A);
        f.llIIIlIlIllI[19] = 40 + 48 - 84 + 158 ^ 151 + 75 - 211 + 164;
        f.llIIIlIlIllI[20] = 0x4A ^ 0x69 ^ (0x7B ^ 0x4A);
        f.llIIIlIlIllI[21] = 0x61 ^ 0x72;
        f.llIIIlIlIllI[22] = 0x33 ^ 0x27;
        f.llIIIlIlIllI[23] = 0x68 ^ 0x7D;
        f.llIIIlIlIllI[24] = 0x55 ^ 0x3E ^ (0x18 ^ 0x65);
        f.llIIIlIlIllI[25] = 0x84 ^ 0xBF ^ (0xB ^ 0x27);
        f.llIIIlIlIllI[26] = 0xB ^ 0x13;
        f.llIIIlIlIllI[27] = 56 + 48 - 102 + 170 ^ 148 + 168 - 271 + 136;
        f.llIIIlIlIllI[28] = 36 + 54 - 83 + 172 ^ 95 + 102 - 88 + 60;
        f.llIIIlIlIllI[29] = 0x1A ^ 1;
        f.llIIIlIlIllI[30] = 0xD7 ^ 0xC1 ^ (6 ^ 0xC);
        f.llIIIlIlIllI[31] = 0x52 ^ 0x33 ^ (0xE6 ^ 0x9A);
        f.llIIIlIlIllI[32] = 0x28 ^ 0x36;
        f.llIIIlIlIllI[33] = 0xA9 ^ 0x96 ^ 3;
        f.llIIIlIlIllI[34] = 39 + 18 - -39 + 37 ^ 28 + 111 - 82 + 97;
        f.llIIIlIlIllI[35] = 0x69 ^ 0x12 ^ (0x10 ^ 0x4B);
        f.llIIIlIlIllI[36] = 0x6B ^ 0x4A;
        f.llIIIlIlIllI[37] = 0xBA ^ 0x8E ^ (0x2A ^ 0x3C);
        f.llIIIlIlIllI[38] = 0x3F ^ 0x17;
        f.llIIIlIlIllI[39] = 0x54 ^ 0x1C ^ (0x3B ^ 0x50);
        f.llIIIlIlIllI[40] = 0x16 ^ 0x32;
        f.llIIIlIlIllI[41] = 0xF8 ^ 0x85 ^ (0x7E ^ 0x26);
        f.llIIIlIlIllI[42] = 0x73 ^ 0x55;
        f.llIIIlIlIllI[43] = 0xE0 ^ 0xC7;
        f.llIIIlIlIllI[44] = 0xB1 ^ 0x98;
        f.llIIIlIlIllI[45] = 0x5E ^ 0x74;
        f.llIIIlIlIllI[46] = 54 + 108 - 102 + 77 ^ 7 + 102 - 68 + 121;
        f.llIIIlIlIllI[47] = 0x91 ^ 0xBD;
        f.llIIIlIlIllI[48] = 0x28 ^ 0x4A ^ (0xF2 ^ 0xBD);
        f.llIIIlIlIllI[49] = 0xD ^ 0x40 ^ (0x3E ^ 0x5D);
        f.llIIIlIlIllI[50] = 0x82 ^ 0xA3 ^ (0xB7 ^ 0xB9);
        f.llIIIlIlIllI[51] = 0x2F ^ 0x56 ^ (0x1F ^ 0x56);
    }

    private static boolean llllIlIlIIlIlI(int n2, int n3) {
        return n2 == n3;
    }

    private K C() {
        f var144;
        if (f.llllIlIlIIIIII(this.ab.bottomless() ? 1 : 0)) {
            return K.BOTTOMLESS_BUCKET;
        }
        switch (g.am[var144.ab.compostType().ordinal()]) {
            case 1: {
                return K.SUPER_COMPOST;
            }
            case 2: {
                return K.ULTRA_COMPOST;
            }
        }
        return K.COMPOST;
    }

    /*
     * WARNING - void declaration
     */
    public boolean c(q q2) {
        void var149;
        void var139;
        f var145;
        p p2 = p.b(q2.X());
        if (f.llllIlIIlllllI((Object)p2)) {
            return llIIIlIlIllI[0];
        }
        if (f.llllIlIlIIIIlI(var145.aa.getLocalPlayer().distanceTo(var139.Y()), var139.Z())) {
            return llIIIlIlIllI[1];
        }
        x var43 = var145.a((p)var139);
        N[] var112 = var149.ae();
        int var1 = var112.length;
        int var150 = llIIIlIlIllI[1];
        while (f.llllIlIlIIIIIl(var150, var1)) {
            N var108 = var112[var150];
            if (f.llllIlIlIIIIll(var145.i(var108) ? 1 : 0)) {
                0;
                if ((0x19 ^ 0x1D) < -1) {
                    return false;
                }
            } else if (f.llllIlIlIIIIII(var43.E(var108) ? 1 : 0) && f.llllIlIlIIIIll(var145.e(var108) ? 1 : 0)) {
                if (f.llllIlIIlllllI((Object)var43.C(var108)) && f.llllIlIlIIIIII(var145.d(var108) ? 1 : 0)) {
                    0;
                    if (((0x3F ^ 0x7D) & ~(0xE7 ^ 0xA5)) != 0) {
                        return false;
                    }
                } else {
                    return llIIIlIlIllI[1];
                }
            }
            ++var150;
            0;
            if (((58 + 86 - 74 + 60 ^ 136 + 29 - 116 + 118) & (24 + 72 - 11 + 96 ^ 45 + 101 - 101 + 99 ^ -1)) != (0x5A ^ 0x16 ^ (0x88 ^ 0xC0))) continue;
            return ((0xF5 ^ 0xAD ^ (0xF ^ 0x1C)) & (0x8E ^ 0xBF ^ (0xF5 ^ 0x8F) ^ -1)) != 0;
        }
        return llIIIlIlIllI[0];
    }

    private static String llllIIllllllIl(String var65, String var163) {
        try {
            SecretKeySpec var117 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var163.getBytes(StandardCharsets.UTF_8)), llIIIlIlIllI[10]), "DES");
            Cipher var89 = Cipher.getInstance("DES");
            var89.init(llIIIlIlIllI[4], var117);
            return new String(var89.doFinal(Base64.getDecoder().decode(var65.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var78) {
            var78.printStackTrace();
            return null;
        }
    }

    private static int llllIlIlIIIlII(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    private static boolean llllIlIlIIlIIl(int n2, int n3) {
        return n2 != n3;
    }

    public boolean f(N n2) {
        boolean bl;
        if (f.llllIlIIllllll((Object)this.ae.b(n2))) {
            bl = llIIIlIlIllI[0];
            0;
            if ((0x8A ^ 0x81 ^ (0xB2 ^ 0xBD)) <= 0) {
                return ((0xFD ^ 0xA4 ^ (0x3A ^ 0x3C)) & (171 + 24 - 41 + 38 ^ 125 + 0 - 118 + 152 ^ -1)) != 0;
            }
        } else {
            bl = llIIIlIlIllI[1];
        }
        return bl;
    }

    private static boolean llllIlIIllllll(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    private void w() {
        void var129;
        this.Y.clear();
        p[] pArray = p.values();
        int n2 = pArray.length;
        int var39 = llIIIlIlIllI[1];
        while (f.llllIlIlIIIIIl(var39, (int)var129)) {
            f var165;
            void var116;
            void var19 = var116[var39];
            x var42 = x.a(var165.ac, (p)var19);
            var165.Y.put((p)var19, var42);
            0;
            ++var39;
            0;
            if (-2 < 0) continue;
            return;
        }
    }

    static {
        f.llllIlIIllllII();
        f.llllIlIIlllIII();
        T = LoggerFactory.getLogger(f.class);
        U = Pattern.compile(llIIIlIIIlII[llIIIlIlIllI[47]]);
        V = Pattern.compile(llIIIlIIIlII[llIIIlIlIllI[48]]);
        W = Pattern.compile(llIIIlIIIlII[llIIIlIlIllI[49]]);
        X = Pattern.compile(llIIIlIIIlII[llIIIlIlIllI[50]]);
    }

    public void a(EventBus eventBus) {
        eventBus.register((Object)this.ae);
        eventBus.register((Object)this.af);
        this.ai = null;
        this.w();
    }

    public B b(A a2) {
        B b2;
        B b3 = this.ag.get((Object)a2);
        if (f.llllIlIIlllllI((Object)b3)) {
            b2 = B.UNKNOWN;
            0;
            if (((0x23 ^ 0x13) & ~(0xA4 ^ 0x94)) != 0) {
                return null;
            }
        } else {
            b2 = b3;
        }
        return b2;
    }

    private static boolean llllIlIlIIIIII(int n2) {
        return n2 != 0;
    }

    private static void llllIlIIlllIII() {
        llIIIlIIIlII = new String[llIIIlIlIllI[51]];
        f.llIIIlIIIlII[f.llIIIlIlIllI[1]] = f."compost";
        f.llIIIlIIIlII[f.llIIIlIlIllI[0]] = f."squirefarmer";
        f.llIIIlIIIlII[f.llIIIlIlIllI[4]] = f."timetracking";
        f.llIIIlIIIlII[f.llIIIlIlIllI[5]] = f."autoweed";
        f.llIIIlIIIlII[f.llIIIlIlIllI[6]] = f."timetracking";
        f.llIIIlIIIlII[f.llIIIlIlIllI[7]] = f."autoweed";
        f.llIIIlIIIlII[f.llIIIlIlIllI[8]] = f."New region loaded. {} at {} ticks";
        f.llIIIlIIIlII[f.llIIIlIlIllI[9]] = f."timetracking";
        f.llIIIlIIIlII[f.llIIIlIlIllI[10]] = f.":";
        f.llIIIlIIIlII[f.llIIIlIlIllI[11]] = f."timetracking";
        f.llIIIlIIIlII[f.llIIIlIlIllI[12]] = f."farmTickOffsetPrecision";
        f.llIIIlIIIlII[f.llIIIlIlIllI[13]] = f."timetracking";
        f.llIIIlIIIlII[f.llIIIlIlIllI[14]] = f."farmTickOffset";
        f.llIIIlIIIlII[f.llIIIlIlIllI[15]] = f."Observed an exact growth tick. Offset is: {} from a {} minute tick";
        f.llIIIlIIIlII[f.llIIIlIlIllI[16]] = f."Offset error! Observed new offset of {}, previous observed offset was {} ({}) Player Loc:{}";
        f.llIIIlIIIlII[f.llIIIlIlIllI[17]] = f."Found a longer growth tick {}, saving new offset";
        f.llIIIlIIIlII[f.llIIIlIlIllI[18]] = f."timetracking";
        f.llIIIlIIIlII[f.llIIIlIlIllI[19]] = f."farmTickOffsetPrecision";
        f.llIIIlIIIlII[f.llIIIlIlIllI[20]] = f."timetracking";
        f.llIIIlIIIlII[f.llIIIlIlIllI[21]] = f."farmTickOffset";
        f.llIIIlIIIlII[f.llIIIlIlIllI[22]] = f."ignoring growth tick for offset calculation; newRegionLoaded={} timeSinceModalClose={}";
        f.llIIIlIIIlII[f.llIIIlIlIllI[23]] = f."timetracking";
        f.llIIIlIIIlII[f.llIIIlIlIllI[24]] = f."Found GROWING -> GROWING or GROWING -> DISEASED";
        f.llIIIlIIIlII[f.llIIIlIlIllI[25]] = f."Found GROWING -> HARVESTABLE";
        f.llIIIlIIIlII[f.llIIIlIlIllI[26]] = f."Found DISEASED -> DEAD";
        f.llIIIlIIIlII[f.llIIIlIlIllI[27]] = f."timetracking";
        f.llIIIlIIIlII[f.llIIIlIlIllI[28]] = f."autoweed";
        f.llIIIlIIIlII[f.llIIIlIlIllI[29]] = f."timetracking";
        f.llIIIlIIIlII[f.llIIIlIlIllI[30]] = f."botanist";
        f.llIIIlIIIlII[f.llIIIlIlIllI[31]] = f."timetracking";
        f.llIIIlIIIlII[f.llIIIlIlIllI[32]] = f.":";
        f.llIIIlIIIlII[f.llIIIlIlIllI[34]] = f."timetracking";
        f.llIIIlIIIlII[f.llIIIlIlIllI[35]] = f."farmTickOffsetPrecision";
        f.llIIIlIIIlII[f.llIIIlIlIllI[36]] = f."timetracking";
        f.llIIIlIIIlII[f.llIIIlIlIllI[37]] = f."farmTickOffset";
        f.llIIIlIIIlII[f.llIIIlIlIllI[39]] = f."leprechaun";
        f.llIIIlIIIlII[f.llIIIlIlIllI[40]] = f."compost";
        f.llIIIlIIIlII[f.llIIIlIlIllI[41]] = f."potion";
        f.llIIIlIIIlII[f.llIIIlIlIllI[42]] = f."compost";
        f.llIIIlIIIlII[f.llIIIlIlIllI[43]] = f."potion";
        f.llIIIlIIIlII[f.llIIIlIlIllI[38]] = f."South";
        f.llIIIlIIIlII[f.llIIIlIlIllI[44]] = f."North";
        f.llIIIlIIIlII[f.llIIIlIlIllI[45]] = f."North";
        f.llIIIlIIIlII[f.llIIIlIlIllI[46]] = f."South";
        f.llIIIlIIIlII[f.llIIIlIlIllI[47]] = f."You treat the .+ with (?<compostType>ultra|super|)compost\\.";
        f.llIIIlIIIlII[f.llIIIlIlIllI[48]] = f."^The .+ has been treated with (?<compostType>ultra|super|)compost";
        f.llIIIlIIIlII[f.llIIIlIlIllI[49]] = f."This .+ has already been (treated|fertilised) with (?<compostType>ultra|super|)compost(?: - the spell can't make it any more fertile)?\\.";
        f.llIIIlIIIlII[f.llIIIlIlIllI[50]] = f."This is an? .+\\. The soil has been treated with (?<compostType>ultra|super|)compost\\..*";
    }

    public x b(q q2) {
        return this.Y.get((Object)p.b(q2.X()));
    }

    private static boolean llllIlIlIIIIll(int n2) {
        return n2 == 0;
    }

    public q x() {
        if (!f.llllIlIIllllll(this.aj) || f.llllIlIlIIIIII(this.c(this.aj) ? 1 : 0)) {
            f var31;
            var31.aj = var31.y();
        }
        return this.aj;
    }

    /*
     * WARNING - void declaration
     */
    public Map<K, Integer> A() {
        void var3_3;
        void var48;
        Object var30;
        Object var86;
        HashMap<K, Integer> hashMap = new HashMap<K, Integer>(this.B());
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Inventory.getAll());
        0;
        arrayList.addAll(Equipment.getAll());
        0;
        Object var96 = arrayList.iterator();
        while (f.llllIlIlIIIIII(var96.hasNext() ? 1 : 0)) {
            var86 = (Item)var96.next();
            if (f.llllIlIIlllllI(var86)) {
                0;
                if (-1 < 2) continue;
                return null;
            }
            var30 = K.d((Item)var86);
            if (f.llllIlIIlllllI(var30)) {
                0;
                if (-1 != 1) continue;
                return null;
            }
            if (f.llllIlIlIIIIII(var48.containsKey(var30) ? 1 : 0)) {
                var48.put(var30, (Integer)var48.get(var30) - var86.getQuantity());
                0;
            }
            0;
            
            return null;
        }
        var96 = new HashMap();
        var86 = var48.entrySet().iterator();
        while (f.llllIlIlIIIIII(var86.hasNext() ? 1 : 0)) {
            var30 = (Map.Entry)var86.next();
            if (f.llllIlIlIIIllI((Integer)var30.getValue())) {
                var96.put((K)((Object)var30.getKey()), (Integer)var30.getValue());
                0;
            }
            0;
            if (-1 < 1) continue;
            return null;
        }
        return var3_3;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var2_2;
        void var109;
        if (f.llllIlIlIIIlll(chatMessage.getType(), ChatMessageType.GAMEMESSAGE) && f.llllIlIlIIIlll(chatMessage.getType(), ChatMessageType.SPAM)) {
            return;
        }
        H var73 = b.a(var109.getMessage());
        if (f.llllIlIIlllllI((Object)var73)) {
            return;
        }
        this.ae.a(this.ai, (H)var2_2);
    }

    private static int llllIlIlIlIIII(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    public void D() {
        this.ag.clear();
        this.ah.clear();
        this.al = null;
        this.E();
    }

    private boolean d(N n2) {
        int n3;
        an an2 = n2.aI();
        if (f.llllIlIlIIIIll(n2.aL().aR() ? 1 : 0) && f.llllIlIIllllIl((Object)an2.aY(), (Object)au.WEEDS) && f.llllIlIlIIIIll(an2.bb())) {
            n3 = llIIIlIlIllI[0];
            0;
            if (((0x56 ^ 0x62 ^ (0x47 ^ 0x5B)) & (0x33 ^ 0x1F ^ (0x45 ^ 0x41) ^ -1)) >= 3) {
                return ((0x82 ^ 0xB5 ^ (0xEC ^ 0xBA)) & (0x28 ^ 0x45 ^ (0x14 ^ 0x18) ^ -1)) != 0;
            }
        } else {
            n3 = llIIIlIlIllI[1];
        }
        return n3 != 0;
    }

    private av a(P p2) {
        switch (g.an[p2.ordinal()]) {
            case 1: {
                f var38;
                return var38.ab.defaultAllotment().bf();
            }
            case 2: {
                f var38;
                return var38.ab.defaultHerb().bf();
            }
            case 3: {
                f var38;
                return var38.ab.defaultFlower().bf();
            }
            case 4: {
                f var38;
                return var38.ab.defaultBush().bf();
            }
        }
        return av.DEFAULT;
    }

    @Inject
    private f(r r2, Client client, SquireFarmerConfig squireFarmerConfig, ConfigManager configManager, SquireFarmer squireFarmer, b b2, i i2) {
        this.Y = new HashMap<p, x>();
        this.ag = new EnumMap<A, B>(A.class);
        this.ah = new EnumMap<A, Long>(A.class);
        this.Z = r2;
        this.aa = client;
        this.ab = squireFarmerConfig;
        this.ac = configManager;
        this.ad = squireFarmer;
        this.ae = b2;
        this.af = i2;
    }

    /*
     * WARNING - void declaration
     */
    public Map<Integer, Integer> F() {
        void var111;
        Iterator var52;
        void lllllllllllllllIlIlIIllIIlIIIIIl2;
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        long l2 = Instant.now().getEpochSecond();
        p[] pArray = p.W();
        int n2 = pArray.length;
        int var46 = llIIIlIlIllI[1];
        while (f.llllIlIlIIIIIl(var46, (int)lllllllllllllllIlIlIIllIIlIIIIIl2)) {
            f var36;
            void var80 = var52[var46];
            if (f.llllIlIlIIIIll(var36.b((p)var80) ? 1 : 0)) {
                0;
                if (-(35 + 139 - 160 + 131 ^ 18 + 139 - 71 + 63) > 0) {
                    return null;
                }
            } else {
                x var154 = var36.a((p)var80);
                q var103 = var36.Z.af().get(var80);
                N[] var47 = var103.ae();
                int var113 = var47.length;
                int var44 = llIIIlIlIllI[1];
                while (f.llllIlIlIIIIIl(var44, var113)) {
                    N var15 = var47[var44];
                    if (f.llllIlIlIIIIll(var36.i(var15) ? 1 : 0)) {
                        0;
                        if (((0x83 ^ 0xBC ^ (0x6E ^ 0x15)) & (97 + 63 - 77 + 142 ^ 10 + 43 - 16 + 128 ^ -1)) <= -1) {
                            return null;
                        }
                    } else {
                        void var54;
                        am var130 = var36.j(var15);
                        if (f.llllIlIIllllll(var130) && f.llllIlIlIIIllI(f.llllIlIlIlIIII(var130.ba(), (long)var54))) {
                            0;
                            if (2 < 0) {
                                return null;
                            }
                        } else {
                            av var25 = var154.C(var15);
                            if (f.llllIlIIlllllI((Object)var25)) {
                                0;
                                if (1 <= 0) {
                                    return null;
                                }
                            } else if (f.llllIlIIllllIl((Object)var25, (Object)av.DEFAULT) && f.llllIlIIlllllI((Object)(var25 = var36.a(var15.aL())))) {
                                0;
                                
                                }
                            } else {
                                var111.put(var25.aA(), var111.getOrDefault(var25.aA(), llIIIlIlIllI[1]) + var25.bl());
                                0;
                            }
                        }
                    }
                    ++var44;
                    0;
                    if (1 >= ((0x9E ^ 0xB5 ^ (0x10 ^ 0x7A)) & (0x31 ^ 0x34 ^ (0xC7 ^ 0x83) ^ -1))) continue;
                    return null;
                }
            }
            ++var46;
            0;
            if (-1 <= 1) continue;
            return null;
        }
        var52 = Inventory.getAll().iterator();
        while (f.llllIlIlIIIIII(var52.hasNext() ? 1 : 0)) {
            Item lllllllllllllllIlIlIIllIIlIIIIIl2 = (Item)var52.next();
            if (f.llllIlIlIIIIII(var111.containsKey(lllllllllllllllIlIlIIllIIlIIIIIl2.getId()) ? 1 : 0)) {
                var46 = (Integer)var111.get(lllllllllllllllIlIlIIllIIlIIIIIl2.getId()) - lllllllllllllllIlIlIIllIIlIIIIIl2.getQuantity();
                if (f.llllIlIlIIIlIl(var46)) {
                    var111.remove(lllllllllllllllIlIlIIllIIlIIIIIl2.getId());
                    0;
                    0;
                    if (((0x5A ^ 0xD) & ~(0xDC ^ 0x8B)) < 2) continue;
                    return null;
                }
                var111.put(lllllllllllllllIlIlIIllIIlIIIIIl2.getId(), var46);
                0;
            }
            0;
            if (((0x65 ^ 0x42) & ~(0x8E ^ 0xA9)) == 0) continue;
            return null;
        }
        return hashMap;
    }

    public am j(N n2) {
        return this.a(n2, this.ac.getRSProfileKey());
    }

    /*
     * WARNING - void declaration
     */
    private boolean e(N n2) {
        int n3;
        f var16;
        void var161;
        void var147;
        x x2 = this.b(n2.aM());
        if (f.llllIlIIlllllI(x2)) {
            return llIIIlIlIllI[0];
        }
        an var146 = var147.aI();
        if (!f.llllIlIlIIIIll(var147.aL().aR() ? 1 : 0) || !f.llllIlIlIIIIII(var161.E((N)var147) ? 1 : 0) || f.llllIlIlIIIIll(var161.F((N)var147) ? 1 : 0)) {
            return llIIIlIlIllI[0];
        }
        if (f.llllIlIIllllIl((Object)var147.aL(), (Object)P.BUSH) && f.llllIlIlIIIIll(var146.bb()) && f.llllIlIlIIIlll((Object)var146.aY(), (Object)au.WEEDS)) {
            return llIIIlIlIllI[0];
        }
        if (f.llllIlIIllllIl((Object)var146.aZ(), (Object)n.GROWING) && (!f.llllIlIlIIIlll((Object)var146.aY(), (Object)au.GRAPE) || f.llllIlIlIIIIII(var16.f((N)var147) ? 1 : 0)) && f.llllIlIlIIIlll((Object)var146.aY(), (Object)au.WEEDS)) {
            n3 = llIIIlIlIllI[0];
            0;
            if (1 <= ((0x25 ^ 0x1C ^ (0xD6 ^ 0xBC)) & (0x9C ^ 0xA6 ^ (1 ^ 0x68) ^ -1))) {
                return ((90 + 88 - 153 + 129 ^ 23 + 81 - 21 + 75) & (0xF1 ^ 0x97 ^ (0x6E ^ 0xC) ^ -1)) != 0;
            }
        } else {
            n3 = llIIIlIlIllI[1];
        }
        return n3 != 0;
    }

    private static boolean llllIlIlIIIlIl(int n2) {
        return n2 <= 0;
    }

    public void b(EventBus eventBus) {
        eventBus.unregister((Object)this.ae);
        eventBus.unregister((Object)this.af);
        this.ai = null;
        this.w();
    }

    private static boolean llllIlIlIIllll(int n2) {
        return n2 < 0;
    }

    public N v() {
        if (!f.llllIlIIllllll(this.ai) || !f.llllIlIlIIIIII(this.ai.aM().a(this.aa) ? 1 : 0) || f.llllIlIlIIIIII(this.e(this.ai) ? 1 : 0)) {
            f var24;
            var24.ai = var24.z();
        }
        return this.ai;
    }

    public boolean b(p p2) {
        return this.a(p2).aj();
    }

    private N z() {
        q q2 = this.x();
        if (f.llllIlIIlllllI(q2)) {
            return null;
        }
        return Arrays.stream(q2.ae()).filter(n2 -> {
            boolean bl;
            if (f.llllIlIlIIIIll(this.e((N)n2) ? 1 : 0)) {
                bl = llIIIlIlIllI[0];
                0;
                if ((0x9D ^ 0x99) <= 3) {
                    return (3 & ~3) != 0;
                }
            } else {
                bl = llIIIlIlIllI[1];
            }
            return bl;
        }).filter(this::i).filter(n2 -> {
            boolean bl;
            if (!f.llllIlIIlllllI(this.h((N)n2)) || f.llllIlIlIIIIll(this.d((N)n2) ? 1 : 0)) {
                bl = llIIIlIlIllI[0];
                0;
                if (((91 + 200 - 245 + 162 ^ 119 + 30 - 25 + 35) & (7 ^ 0x63 ^ (0xC ^ 0x27) ^ -1)) != 0) {
                    return ((0xBA ^ 0x86 ^ (0x6D ^ 0x60)) & (0xC7 ^ 0xAE ^ (0xDC ^ 0x84) ^ -1)) != 0;
                }
            } else {
                bl = llIIIlIlIllI[1];
            }
            return bl;
        }).findFirst().orElse(null);
    }

    /*
     * WARNING - void declaration
     */
    private Map<K, Integer> B() {
        H var66;
        f var122;
        void var76;
        void var136;
        HashMap<K, Integer> hashMap = new HashMap<K, Integer>();
        q q2 = this.x();
        if (f.llllIlIIlllllI(q2)) {
            return var136;
        }
        int var28 = Arrays.stream(var76.ae()).filter(n2 -> {
            boolean bl;
            if (f.llllIlIIllllll(this.h((N)n2))) {
                bl = llIIIlIlIllI[0];
                0;
                if (2 < 0) {
                    return ((0xF0 ^ 0x98 ^ (0xEC ^ 0xA3)) & ((0x70 ^ 0x20) & ~(0x76 ^ 0x26) ^ (0x44 ^ 0x63) ^ -1)) != 0;
                }
            } else {
                bl = llIIIlIlIllI[1];
            }
            return bl;
        }).anyMatch(n2 -> {
            int n3;
            if (f.llllIlIIllllIl((Object)n2.aI().aY(), (Object)au.WEEDS) && f.llllIlIlIIIllI(n2.aI().bb())) {
                n3 = llIIIlIlIllI[0];
                0;
                if (((0x29 ^ 0x1F) & ~(0x4F ^ 0x79)) != 0) {
                    return false;
                }
            } else {
                n3 = llIIIlIlIllI[1];
            }
            return n3 != 0;
        }) ? 1 : 0;
        if (f.llllIlIlIIIIII(var28)) {
            var136.put(K.RAKE, llIIIlIlIllI[0]);
            0;
        }
        var136.put(K.SEED_DIBBER, llIIIlIlIllI[0]);
        0;
        var136.put(K.SECATEURS, llIIIlIlIllI[0]);
        0;
        var136.put(K.SPADE, llIIIlIlIllI[0]);
        0;
        List var143 = Arrays.stream(var76.ae()).filter(n2 -> {
            boolean bl;
            if (f.llllIlIlIIIIll(n2.aL().aR() ? 1 : 0)) {
                bl = llIIIlIlIllI[0];
                0;
                if (-1 > 0) {
                    return false;
                }
            } else {
                bl = llIIIlIlIllI[1];
            }
            return bl;
        }).filter(n2 -> {
            boolean bl;
            if (f.llllIlIlIIIIll(this.f((N)n2) ? 1 : 0)) {
                bl = llIIIlIlIllI[0];
                0;
                
                }
            } else {
                bl = llIIIlIlIllI[1];
            }
            return bl;
        }).filter(var122::i).collect(Collectors.toList());
        int lllllllllllllllIlIlIIlllIIllIIII = (int)Arrays.stream(var76.ae()).filter(n2 -> {
            boolean bl;
            if (f.llllIlIlIIIIll(n2.aL().aR() ? 1 : 0)) {
                bl = llIIIlIlIllI[0];
                0;
                if (-2 > 0) {
                    return (3 & ~3) != 0;
                }
            } else {
                bl = llIIIlIlIllI[1];
            }
            return bl;
        }).count();
        int n3 = Arrays.stream(var76.ae()).anyMatch(n2 -> {
            boolean bl;
            if (f.llllIlIIllllIl((Object)n2.aI().aZ(), (Object)n.DISEASED)) {
                bl = llIIIlIlIllI[0];
                0;
                if (((0x1A ^ 0x48) & ~(6 ^ 0x54)) > (0x9E ^ 0x9A)) {
                    return false;
                }
            } else {
                bl = llIIIlIlIllI[1];
            }
            return bl;
        });
        if (f.llllIlIlIIIIII(n3)) {
            var136.put(K.PLANT_CURE, llIIIlIlIllI[0]);
            0;
        }
        x var164 = var122.b((q)var76);
        if (f.llllIlIIllllIl((Object)var122.ab.compostTypeFlowers(), (Object)H.LUNAR_SPELL)) {
            return var136;
        }
        if (f.llllIlIlIIIlll(var164.an(), ar.NOTHING) && f.llllIlIlIIIIII(var143.stream().anyMatch(n2 -> {
            int n3;
            if (f.llllIlIlIIIIII(this.i((N)n2) ? 1 : 0) && f.llllIlIIllllIl((Object)n2.aL(), (Object)P.FLOWER)) {
                n3 = llIIIlIlIllI[0];
                0;
                if (1 <= 0) {
                    return ((0xEA ^ 0xBA ^ (0x38 ^ 0x6E)) & (82 + 113 - 49 + 14 ^ 12 + 94 - 10 + 70 ^ -1)) != 0;
                }
            } else {
                n3 = llIIIlIlIllI[1];
            }
            return n3 != 0;
        }) ? 1 : 0)) {
            var136.compute(var122.ab.compostTypeFlowers().aC(), (k2, n2) -> {
                int n3;
                if (f.llllIlIIlllllI(n2)) {
                    n3 = llIIIlIlIllI[0];
                    0;
                    if (((0x1C ^ 0x59 ^ (0x2C ^ 0x73)) & (0x4F ^ 0x29 ^ (0x68 ^ 0x14) ^ -1)) != 0) {
                        return null;
                    }
                } else {
                    void var49;
                    n3 = var49.intValue() + llIIIlIlIllI[0];
                }
                return n3;
            });
            0;
        }
        if (f.llllIlIIllllIl((Object)(var66 = var122.ab.compostType()), (Object)H.LUNAR_SPELL)) {
            return var136;
        }
        if (f.llllIlIlIIIlll(var164.am(), ap.NOTHING) && f.llllIlIlIIIIII(var143.stream().anyMatch(n2 -> {
            int n3;
            if (f.llllIlIlIIIIII(this.i((N)n2) ? 1 : 0) && f.llllIlIIllllIl((Object)n2.aL(), (Object)P.ALLOTMENT) && f.llllIlIlIIIIII(n2.ac().contains(llIIIlIIIlII[llIIIlIlIllI[46]]) ? 1 : 0)) {
                n3 = llIIIlIlIllI[0];
                0;
                
                }
            } else {
                n3 = llIIIlIlIllI[1];
            }
            return n3 != 0;
        }) ? 1 : 0)) {
            var136.compute(var66.aC(), (k2, n2) -> {
                int n3;
                if (f.llllIlIIlllllI(n2)) {
                    n3 = llIIIlIlIllI[0];
                    0;
                    if ((63 + 43 - -12 + 39 ^ 152 + 33 - 127 + 95) < 3) {
                        return null;
                    }
                } else {
                    void var22;
                    n3 = var22.intValue() + llIIIlIlIllI[0];
                }
                return n3;
            });
            0;
        }
        if (f.llllIlIlIIIlll(var164.al(), ap.NOTHING) && f.llllIlIlIIIIII(var143.stream().anyMatch(n2 -> {
            int n3;
            if (f.llllIlIlIIIIII(this.i((N)n2) ? 1 : 0) && f.llllIlIIllllIl((Object)n2.aL(), (Object)P.ALLOTMENT) && f.llllIlIlIIIIII(n2.ac().contains(llIIIlIIIlII[llIIIlIlIllI[45]]) ? 1 : 0)) {
                n3 = llIIIlIlIllI[0];
                0;
                if (-1 == 3) {
                    return false;
                }
            } else {
                n3 = llIIIlIlIllI[1];
            }
            return n3 != 0;
        }) ? 1 : 0)) {
            var136.compute(var66.aC(), (k2, n2) -> {
                int n3;
                if (f.llllIlIIlllllI(n2)) {
                    n3 = llIIIlIlIllI[0];
                    0;
                    if (3 == (0x7E ^ 0x4D ^ (0x5D ^ 0x6A))) {
                        return null;
                    }
                } else {
                    void var27;
                    n3 = var27.intValue() + llIIIlIlIllI[0];
                }
                return n3;
            });
            0;
        }
        if (f.llllIlIlIIIlll(var164.ak(), at.NOTHING) && f.llllIlIlIIIIII(var143.stream().anyMatch(n2 -> {
            int n3;
            if (f.llllIlIlIIIIII(this.i((N)n2) ? 1 : 0) && f.llllIlIIllllIl((Object)n2.aL(), (Object)P.HERB)) {
                n3 = llIIIlIlIllI[0];
                0;
                if (((0x1F ^ 0x5C ^ (0x81 ^ 0x8C)) & (0xE2 ^ 0xA6 ^ (0x7C ^ 0x76) ^ -1)) != 0) {
                    return ((0x8D ^ 0x92 ^ (0x28 ^ 0x3F)) & (124 + 145 - 91 + 8 ^ 17 + 143 - 67 + 85 ^ -1)) != 0;
                }
            } else {
                n3 = llIIIlIlIllI[1];
            }
            return n3 != 0;
        }) ? 1 : 0)) {
            var136.compute(var66.aC(), (k2, n2) -> {
                int n3;
                if (f.llllIlIIlllllI(n2)) {
                    n3 = llIIIlIlIllI[0];
                    0;
                    
                    }
                } else {
                    void var79;
                    n3 = var79.intValue() + llIIIlIlIllI[0];
                }
                return n3;
            });
            0;
        }
        if (f.llllIlIlIIIlll(var164.aq(), ax.NOTHING) && f.llllIlIlIIIIII(var143.stream().anyMatch(n2 -> {
            int n3;
            if (f.llllIlIlIIIIII(this.i((N)n2) ? 1 : 0) && f.llllIlIIllllIl((Object)n2.aL(), (Object)P.SEAWEED) && f.llllIlIlIIIIII(n2.ac().contains(llIIIlIIIlII[llIIIlIlIllI[44]]) ? 1 : 0)) {
                n3 = llIIIlIlIllI[0];
                0;
                if ((0x2F ^ 0x74 ^ (0x9B ^ 0xC4)) <= 0) {
                    return ((35 + 127 - 93 + 84 ^ 155 + 96 - 150 + 83) & (0xD6 ^ 0x89 ^ (0x27 ^ 0x59) ^ -1)) != 0;
                }
            } else {
                n3 = llIIIlIlIllI[1];
            }
            return n3 != 0;
        }) ? 1 : 0)) {
            var136.compute(var66.aC(), (k2, n2) -> {
                int n3;
                if (f.llllIlIIlllllI(n2)) {
                    n3 = llIIIlIlIllI[0];
                    0;
                    if (-1 >= 3) {
                        return null;
                    }
                } else {
                    void var120;
                    n3 = var120.intValue() + llIIIlIlIllI[0];
                }
                return n3;
            });
            0;
        }
        if (f.llllIlIlIIIlll(var164.aq(), ax.NOTHING) && f.llllIlIlIIIIII(var143.stream().anyMatch(n2 -> {
            int n3;
            if (f.llllIlIlIIIIII(this.i((N)n2) ? 1 : 0) && f.llllIlIIllllIl((Object)n2.aL(), (Object)P.SEAWEED) && f.llllIlIlIIIIII(n2.ac().contains(llIIIlIIIlII[llIIIlIlIllI[38]]) ? 1 : 0)) {
                n3 = llIIIlIlIllI[0];
                0;
                
                }
            } else {
                n3 = llIIIlIlIllI[1];
            }
            return n3 != 0;
        }) ? 1 : 0)) {
            var136.compute(var66.aC(), (k2, n2) -> {
                int n3;
                if (f.llllIlIIlllllI(n2)) {
                    n3 = llIIIlIlIllI[0];
                    0;
                    if (1 > (0xB2 ^ 0xB6)) {
                        return null;
                    }
                } else {
                    void var140;
                    n3 = var140.intValue() + llIIIlIlIllI[0];
                }
                return n3;
            });
            0;
        }
        if (f.llllIlIlIIIIII(var122.ab.bottomless() ? 1 : 0)) {
            var136.put(K.BOTTOMLESS_BUCKET, llIIIlIlIllI[0]);
            0;
            var136.remove((Object)var66.aC());
            0;
        }
        return hashMap;
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(an an2, an an3) {
        void var107;
        void var8;
        int n2 = an2.bd();
        n n3 = an2.aZ();
        n n4 = an3.aZ();
        au au2 = an2.aY();
        if (!f.llllIlIlIIIlll((Object)au2, (Object)au.WEEDS) || !f.llllIlIlIIIlll((Object)an3.aY(), (Object)au.WEEDS) || !f.llllIlIIllllIl((Object)an3.aY(), (Object)au2) || f.llllIlIlIIIlIl(n2)) {
            return llIIIlIlIllI[1];
        }
        if (f.llllIlIIllllIl(var8, (Object)n.GROWING)) {
            void var56;
            void var23;
            void var60;
            if (f.llllIlIIllllIl(var107, (Object)n.GROWING) && !f.llllIlIlIIlIIl(var60.bb() - var23.bb(), llIIIlIlIllI[0]) || f.llllIlIIllllIl(var107, (Object)n.DISEASED)) {
                T.debug(llIIIlIIIlII[llIIIlIlIllI[24]]);
                return llIIIlIlIllI[0];
            }
            if (f.llllIlIIllllIl(var107, (Object)n.HARVESTABLE) && f.llllIlIlIIIIll(var56.bh().aX() ? 1 : 0)) {
                T.debug(llIIIlIIIlII[llIIIlIlIllI[25]]);
                return llIIIlIlIllI[0];
            }
        }
        if (f.llllIlIIllllIl(var8, (Object)n.DISEASED) && f.llllIlIIllllIl(var107, (Object)n.DEAD)) {
            T.debug(llIIIlIIIlII[llIIIlIlIllI[26]]);
            return llIIIlIlIllI[0];
        }
        return llIIIlIlIllI[1];
    }

    /*
     * WARNING - void declaration
     */
    public long a(int n2, int n3, long l2, String string) {
        Integer n4 = (Integer)this.ac.getConfiguration(llIIIlIIIlII[llIIIlIlIllI[34]], string, llIIIlIIIlII[llIIIlIlIllI[35]], Integer.TYPE);
        Integer n5 = (Integer)this.ac.getConfiguration(llIIIlIIIlII[llIIIlIlIllI[36]], string, llIIIlIIIlII[llIIIlIlIllI[37]], Integer.TYPE);
        long l3 = 0L;
        if (f.llllIlIIllllll(n4) && f.llllIlIIllllll(n5) && (!f.llllIlIlIIIIIl(n4, n2) || f.llllIlIlIIllII(n4, llIIIlIlIllI[38]))) {
            void var138;
            void var121;
            long lllllllllllllllIlIlIIllIlIIIIlII = (long)(var121.intValue() % var138) * 60L;
        }
        long l4 = l2 + l3;
        long l5 = l4 - l4 % ((long)n2 * 60L);
        long l6 = l5 + (long)n3 * (long)n2 * 60L;
        return l6 - l3;
    }

    /*
     * WARNING - void declaration
     */
    public Item h(N n2) {
        void var5_5;
        f var10;
        void var35;
        if (f.llllIlIIllllIl((Object)n2.aL(), (Object)P.GRAPES)) {
            int[] nArray = new int[llIIIlIlIllI[0]];
            nArray[f.llIIIlIlIllI[1]] = av.GRAPES.aA();
            return Inventory.getFirst((int[])nArray);
        }
        q var26 = var35.aM();
        x var67 = var10.b(var26);
        av var119 = var67.C((N)var35);
        if (f.llllIlIIlllllI((Object)var119)) {
            return null;
        }
        if (f.llllIlIIllllIl((Object)var119, (Object)av.DEFAULT)) {
            var119 = var10.a(var35.aL());
        }
        if (!f.llllIlIlIIIlll((Object)var119, (Object)av.DEFAULT) || f.llllIlIIlllllI((Object)var119)) {
            return null;
        }
        int[] nArray = new int[llIIIlIlIllI[0]];
        nArray[f.llIIIlIlIllI[1]] = var119.aA();
        Item var59 = Inventory.getFirst((int[])nArray);
        if (!f.llllIlIIllllll(var59) || f.llllIlIlIIIIIl(var59.getQuantity(), var119.bl())) {
            return null;
        }
        return var5_5;
    }

    private static boolean llllIlIlIIIIlI(int n2, int n3) {
        return n2 > n3;
    }

    public x a(p p2) {
        return this.Y.get((Object)p2);
    }

    private static boolean llllIlIlIIllII(int n2, int n3) {
        return n2 >= n3;
    }

    private void E() {
        Iterator<Map.Entry<A, Set<N>>> var157 = this.Z.ah().entrySet().iterator();
        while (f.llllIlIlIIIIII(var157.hasNext() ? 1 : 0)) {
            long lllllllllllllllIlIlIIllIIllIIlII2;
            f var93;
            Map.Entry<A, Set<N>> var151 = var157.next();
            long var18 = 0L;
            int var124 = llIIIlIlIllI[0];
            int var75 = llIIIlIlIllI[0];
            Object var99 = var151.getValue().iterator();
            while (f.llllIlIlIIIIII(var99.hasNext() ? 1 : 0)) {
                N lllllllllllllllIlIlIIllIIllIIlII2 = var99.next();
                am var5 = var93.j(lllllllllllllllIlIlIIllIIllIIlII2);
                if (!f.llllIlIIllllll(var5)) continue;
                if (f.llllIlIlIIllll(var5.aY().au())) {
                    0;
                    if (1 < 3) continue;
                    return;
                }
                var124 = llIIIlIlIllI[1];
                if (f.llllIlIlIIIlll((Object)var5.aY(), (Object)au.WEEDS) && f.llllIlIlIIIlll((Object)var5.aY(), (Object)au.SCARECROW)) {
                    var75 = llIIIlIlIllI[1];
                    var18 = Math.max(var18, var5.ba());
                }
                0;
                if (1 <= 1) continue;
                return;
            }
            if (f.llllIlIlIIIIII(var124)) {
                var99 = B.UNKNOWN;
                lllllllllllllllIlIlIIllIIllIIlII2 = -1L;
                0;
                if (((0xCF ^ 0xB4 ^ (0x3B ^ 0x6C)) & (113 + 131 - 102 + 47 ^ 94 + 67 - 142 + 126 ^ -1)) != ((0xB5 ^ 0xA3 ^ (0x83 ^ 0xB2)) & (1 ^ 0x29 ^ (0xC ^ 3) ^ -1))) {
                    return;
                }
            } else if (f.llllIlIlIIIIII(var75)) {
                var99 = B.EMPTY;
                lllllllllllllllIlIlIIllIIllIIlII2 = -1L;
                0;
                if (1 >= (0xA1 ^ 0xA5)) {
                    return;
                }
            } else if (f.llllIlIlIIIlIl(f.llllIlIlIIlllI(var18, Instant.now().getEpochSecond()))) {
                var99 = B.COMPLETED;
                lllllllllllllllIlIlIIllIIllIIlII2 = 0L;
                0;
                
                }
            } else {
                var99 = B.IN_PROGRESS;
                lllllllllllllllIlIlIIllIIllIIlII2 = var18;
            }
            var93.ag.put(var151.getKey(), (B)((Object)var99));
            0;
            var93.ah.put(var151.getKey(), lllllllllllllllIlIlIIllIIllIIlII2);
            0;
            0;
            if ((0x1F ^ 0x27 ^ (0x77 ^ 0x4B)) == (0x4E ^ 0xD ^ (0x5C ^ 0x1B))) continue;
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    public Item g(N n2) {
        void var3_3;
        Item var141;
        H var55;
        H h2;
        f var3;
        void var127;
        if (f.llllIlIIllllIl((Object)n2.aL(), (Object)P.GRAPES)) {
            int[] nArray = new int[llIIIlIlIllI[0]];
            nArray[f.llIIIlIlIllI[1]] = llIIIlIlIllI[2];
            return Inventory.getFirst((int[])nArray);
        }
        if (f.llllIlIIllllIl((Object)var127.aL(), (Object)P.FLOWER)) {
            h2 = var3.ab.compostTypeFlowers();
            0;
            if (3 <= 0) {
                return null;
            }
        } else {
            h2 = var55 = var3.ab.compostType();
        }
        if (f.llllIlIIllllIl((Object)var3.ab.compostTypeFlowers(), (Object)var3.ab.compostType())) {
            var141 = Inventory.getFirst(item -> {
                int n2;
                if (f.llllIlIlIIIIII(item.getName().toLowerCase().contains(llIIIlIIIlII[llIIIlIlIllI[42]]) ? 1 : 0) && f.llllIlIlIIIIll(item.getName().toLowerCase().contains(llIIIlIIIlII[llIIIlIlIllI[43]]) ? 1 : 0)) {
                    n2 = llIIIlIlIllI[0];
                    0;
                    if (2 >= 3) {
                        return false;
                    }
                } else {
                    n2 = llIIIlIlIllI[1];
                }
                return n2 != 0;
            });
            0;
            if (-1 >= ((146 + 98 - 151 + 58 ^ 143 + 25 - 68 + 93) & (139 + 199 - 264 + 129 ^ 65 + 111 - 47 + 28 ^ -1))) {
                return null;
            }
        } else {
            int[] nArray = new int[llIIIlIlIllI[0]];
            nArray[f.llIIIlIlIllI[1]] = var55.aB();
            var141 = Inventory.getFirst((int[])nArray);
        }
        if (f.llllIlIIlllllI(var141) && (!f.llllIlIlIIIlll((Object)var3.ab.compostTypeFlowers(), (Object)var3.ab.compostType()) || f.llllIlIlIIIlll((Object)var127.aL(), (Object)P.FLOWER))) {
            return Inventory.getFirst(item -> {
                int n2;
                if (f.llllIlIlIIIIII(item.getName().toLowerCase().contains(llIIIlIIIlII[llIIIlIlIllI[40]]) ? 1 : 0) && f.llllIlIlIIIIll(item.getName().toLowerCase().contains(llIIIlIIIlII[llIIIlIlIllI[41]]) ? 1 : 0)) {
                    n2 = llIIIlIlIllI[0];
                    0;
                    if ((0 ^ 4) < 0) {
                        return false;
                    }
                } else {
                    n2 = llIIIlIlIllI[1];
                }
                return n2 != 0;
            });
        }
        return var3_3;
    }

    private static String llllIIlllllllI(String var57, String var152) {
        try {
            SecretKeySpec var132 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var152.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var41 = Cipher.getInstance("Blowfish");
            var41.init(llIIIlIlIllI[4], var132);
            return new String(var41.doFinal(Base64.getDecoder().decode(var57.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var70) {
            var70.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private boolean b(String string) {
        int n2;
        void var153;
        if (f.llllIlIlIIIIll(string.contains(llIIIlIIIlII[llIIIlIlIllI[1]]) ? 1 : 0)) {
            return llIIIlIlIllI[1];
        }
        if (!f.llllIlIlIIIIll(U.matcher((CharSequence)var153).matches() ? 1 : 0) || !f.llllIlIlIIIIll(V.matcher((CharSequence)var153).find() ? 1 : 0) || !f.llllIlIlIIIIll(W.matcher((CharSequence)var153).matches() ? 1 : 0) || f.llllIlIlIIIIII(X.matcher((CharSequence)var153).matches() ? 1 : 0)) {
            n2 = llIIIlIlIllI[0];
            0;
            if (-1 > 1) {
                return ((0x3D ^ 0x1C ^ (0xA3 ^ 0xC6)) & (0xB3 ^ 0x9E ^ (0x5A ^ 0x33) ^ -1)) != 0;
            }
        } else {
            n2 = llIIIlIlIllI[1];
        }
        return n2 != 0;
    }
}

