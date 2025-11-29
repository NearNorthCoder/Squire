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

import -.m.e.a.u.s.r.r.q.i.r.e.f.A;
import -.m.e.a.u.s.r.r.q.i.r.e.f.B;
import -.m.e.a.u.s.r.r.q.i.r.e.f.H;
import -.m.e.a.u.s.r.r.q.i.r.e.f.K;
import -.m.e.a.u.s.r.r.q.i.r.e.f.N;
import -.m.e.a.u.s.r.r.q.i.r.e.f.P;
import -.m.e.a.u.s.r.r.q.i.r.e.f.am;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import -.m.e.a.u.s.r.r.q.i.r.e.f.ap;
import -.m.e.a.u.s.r.r.q.i.r.e.f.ar;
import -.m.e.a.u.s.r.r.q.i.r.e.f.at;
import -.m.e.a.u.s.r.r.q.i.r.e.f.au;
import -.m.e.a.u.s.r.r.q.i.r.e.f.av;
import -.m.e.a.u.s.r.r.q.i.r.e.f.ax;
import -.m.e.a.u.s.r.r.q.i.r.e.f.b;
import -.m.e.a.u.s.r.r.q.i.r.e.f.g;
import -.m.e.a.u.s.r.r.q.i.r.e.f.i;
import -.m.e.a.u.s.r.r.q.i.r.e.f.m;
import -.m.e.a.u.s.r.r.q.i.r.e.f.n;
import -.m.e.a.u.s.r.r.q.i.r.e.f.o;
import -.m.e.a.u.s.r.r.q.i.r.e.f.p;
import -.m.e.a.u.s.r.r.q.i.r.e.f.q;
import -.m.e.a.u.s.r.r.q.i.r.e.f.r;
import -.m.e.a.u.s.r.r.q.i.r.e.f.x;
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
public class f {
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
        void lllllllllllllllIlIlIIllllIIIlllI;
        q q2 = this.x();
        if (f.llllIlIIlllllI(q2)) {
            return null;
        }
        p lllllllllllllllIlIlIIllllIIIllIl = p.b(lllllllllllllllIlIlIIllllIIIlllI.X());
        if (f.llllIlIIlllllI((Object)lllllllllllllllIlIlIIllllIIIllIl)) {
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
        p[] lllllllllllllllIlIlIIlllIlIlllIl = p.W();
        int lllllllllllllllIlIlIIlllIlIlllII = lllllllllllllllIlIlIIlllIlIlllIl.length;
        int lllllllllllllllIlIlIIlllIlIllIll = llIIIlIlIllI[1];
        while (f.llllIlIlIIIIIl(lllllllllllllllIlIlIIlllIlIllIll, lllllllllllllllIlIlIIlllIlIlllII)) {
            f lllllllllllllllIlIlIIlllIlIlllll;
            p lllllllllllllllIlIlIIlllIlIllIlI = lllllllllllllllIlIlIIlllIlIlllIl[lllllllllllllllIlIlIIlllIlIllIll];
            if (f.llllIlIlIIIIll(lllllllllllllllIlIlIIlllIlIlllll.b(lllllllllllllllIlIlIIlllIlIllIlI) ? 1 : 0)) {
                0;
                if (-(0x91 ^ 0x94) >= 0) {
                    return null;
                }
            } else {
                x lllllllllllllllIlIlIIlllIlIllIIl = lllllllllllllllIlIlIIlllIlIlllll.a(lllllllllllllllIlIlIIlllIlIllIlI);
                q lllllllllllllllIlIlIIlllIlIllIII = lllllllllllllllIlIlIIlllIlIlllll.Z.af().get((Object)lllllllllllllllIlIlIIlllIlIllIlI);
                N[] lllllllllllllllIlIlIIlllIlIlIlll = lllllllllllllllIlIlIIlllIlIllIII.ae();
                int lllllllllllllllIlIlIIlllIlIlIllI = lllllllllllllllIlIlIIlllIlIlIlll.length;
                int lllllllllllllllIlIlIIlllIlIlIlIl = llIIIlIlIllI[1];
                while (f.llllIlIlIIIIIl(lllllllllllllllIlIlIIlllIlIlIlIl, lllllllllllllllIlIlIIlllIlIlIllI)) {
                    N lllllllllllllllIlIlIIlllIlIlIlII = lllllllllllllllIlIlIIlllIlIlIlll[lllllllllllllllIlIlIIlllIlIlIlIl];
                    if (f.llllIlIlIIIIll(lllllllllllllllIlIlIIlllIlIlllll.i(lllllllllllllllIlIlIIlllIlIlIlII) ? 1 : 0)) {
                        0;
                        if ((0xC3 ^ 0xC7) == 0) {
                            return null;
                        }
                    } else if (f.llllIlIlIIIIII(lllllllllllllllIlIlIIlllIlIlIlII.aL().aT() ? 1 : 0)) {
                        if (f.llllIlIIlllllI((Object)lllllllllllllllIlIlIIlllIlIllIIl.C(lllllllllllllllIlIlIIlllIlIlIlII)) && f.llllIlIlIIIIII(lllllllllllllllIlIlIIlllIlIlllll.d(lllllllllllllllIlIlIIlllIlIlIlII) ? 1 : 0)) {
                            0;
                            if (2 < 0) {
                                return null;
                            }
                        } else {
                            void lllllllllllllllIlIlIIlllIlIllllI;
                            am lllllllllllllllIlIlIIlllIlIlIIll = lllllllllllllllIlIlIIlllIlIlllll.j(lllllllllllllllIlIlIIlllIlIlIlII);
                            if (!f.llllIlIIllllll(lllllllllllllllIlIlIIlllIlIlIIll) || f.llllIlIlIIIlIl(f.llllIlIlIIIlII(lllllllllllllllIlIlIIlllIlIlIIll.ba(), (long)lllllllllllllllIlIlIIlllIlIllllI))) {
                                return lllllllllllllllIlIlIIlllIlIllIII;
                            }
                        }
                    }
                    ++lllllllllllllllIlIlIIlllIlIlIlIl;
                    0;
                    if (2 <= (0x83 ^ 0x91 ^ (0x7D ^ 0x6B))) continue;
                    return null;
                }
            }
            ++lllllllllllllllIlIlIIlllIlIllIll;
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
        void lllllllllllllllIlIlIIllIIlIlIlll;
        f lllllllllllllllIlIlIIllIIlIllIII;
        if (f.llllIlIIlllllI(this.aj)) {
            return llIIIlIlIllI[0];
        }
        p lllllllllllllllIlIlIIllIIlIlIllI = p.b(lllllllllllllllIlIlIIllIIlIllIII.aj.X());
        if (f.llllIlIIlllllI((Object)lllllllllllllllIlIlIIllIIlIlIllI)) {
            return llIIIlIlIllI[1];
        }
        if (f.llllIlIlIIIIlI(lllllllllllllllIlIlIIllIIlIlIllI.Y().distanceTo((WorldPoint)lllllllllllllllIlIlIIllIIlIlIlll), lllllllllllllllIlIlIIllIIlIlIllI.Z())) {
            return llIIIlIlIllI[1];
        }
        if (f.llllIlIIllllIl((Object)lllllllllllllllIlIlIIllIIlIlIllI, (Object)p.GRAPE_VINE_KOUREND)) {
            return llIIIlIlIllI[0];
        }
        NPC lllllllllllllllIlIlIIllIIlIlIlIl = NPCs.getNearest(nPC -> nPC.getName().toLowerCase().contains(llIIIlIIIlII[llIIIlIlIllI[39]]));
        if (f.llllIlIIlllllI(lllllllllllllllIlIlIIllIIlIlIlIl)) {
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
            void lllllllllllllllIlIlIIllIIlllIlIl;
            l2 = lllllllllllllllIlIlIIllIIlllIlIl.longValue();
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
        f lllllllllllllllIlIlIIllIllllllll;
        void lllllllllllllllIlIlIIllIlllllllI;
        if (f.llllIlIIllllIl((Object)n2.aL(), (Object)P.GRAPES)) {
            return llIIIlIlIllI[0];
        }
        q lllllllllllllllIlIlIIllIllllllIl = lllllllllllllllIlIlIIllIlllllllI.aM();
        x lllllllllllllllIlIlIIllIllllllII = lllllllllllllllIlIlIIllIllllllll.b(lllllllllllllllIlIlIIllIllllllIl);
        av lllllllllllllllIlIlIIllIlllllIll = lllllllllllllllIlIlIIllIllllllII.C((N)lllllllllllllllIlIlIIllIlllllllI);
        if (f.llllIlIIlllllI((Object)lllllllllllllllIlIlIIllIlllllIll)) {
            return llIIIlIlIllI[1];
        }
        if (f.llllIlIIllllIl((Object)lllllllllllllllIlIlIIllIlllllIll, (Object)av.DEFAULT)) {
            lllllllllllllllIlIlIIllIlllllIll = lllllllllllllllIlIlIIllIllllllll.a(lllllllllllllllIlIlIIllIlllllllI.aL());
        }
        if (f.llllIlIlIIIlll((Object)lllllllllllllllIlIlIIllIlllllIll, (Object)av.DEFAULT) && f.llllIlIIllllll((Object)lllllllllllllllIlIlIIllIlllllIll)) {
            n3 = llIIIlIlIllI[0];
            0;
            if (null != null) {
                return ((5 ^ 0x43) & ~(0xC5 ^ 0x83)) != 0;
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
                return ((0x7A ^ 0x62) & ~(0xBB ^ 0xA3)) != 0;
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
        void lllllllllllllllIlIlIIllIllIlllIl;
        int lllllllllllllllIlIlIIllIllIllIll;
        f lllllllllllllllIlIlIIllIllIllllI;
        Object lllllllllllllllIlIlIIllIllIllIIl;
        boolean bl = llIIIlIlIllI[1];
        Object lllllllllllllllIlIlIIllIllIllIlI = this.aa.getComponentTable().iterator();
        while (f.llllIlIlIIIIII(lllllllllllllllIlIlIIllIllIllIlI.hasNext() ? 1 : 0)) {
            lllllllllllllllIlIlIIllIllIllIIl = (WidgetNode)lllllllllllllllIlIlIIllIllIllIlI.next();
            if (f.llllIlIlIIlIIl(lllllllllllllllIlIlIIllIllIllIIl.getModalMode(), llIIIlIlIllI[0])) {
                return llIIIlIlIllI[1];
            }
            0;
            if (1 < 2) continue;
            return ((0xD3 ^ 0xC3) & ~(0xA4 ^ 0xB4)) != 0;
        }
        lllllllllllllllIlIlIIllIllIllIlI = Integer.toString(lllllllllllllllIlIlIIllIllIllllI.aa.getVarbitValue(llIIIlIlIllI[3]));
        if (f.llllIlIlIIIIll(((String)lllllllllllllllIlIlIIllIllIllIlI).equals(lllllllllllllllIlIlIIllIllIllllI.ac.getRSProfileConfiguration(llIIIlIIIlII[llIIIlIlIllI[4]], llIIIlIIIlII[llIIIlIlIllI[5]])) ? 1 : 0)) {
            lllllllllllllllIlIlIIllIllIllllI.ac.setRSProfileConfiguration(llIIIlIIIlII[llIIIlIlIllI[6]], llIIIlIIIlII[llIIIlIlIllI[7]], lllllllllllllllIlIlIIllIllIllIlI);
            lllllllllllllllIlIlIIllIllIllIll = llIIIlIlIllI[0];
        }
        if (f.llllIlIlIIIIll((lllllllllllllllIlIlIIllIllIllIlI = lllllllllllllllIlIlIIllIllIllllI.Z.d((WorldPoint)lllllllllllllllIlIlIIllIllIlllIl)).equals(lllllllllllllllIlIlIIllIllIllllI.al) ? 1 : 0)) {
            lllllllllllllllIlIlIIllIllIllllI.ak = llIIIlIlIllI[0];
            T.debug(llIIIlIIIlII[llIIIlIlIllI[8]], lllllllllllllllIlIlIIllIllIllIlI, (Object)lllllllllllllllIlIlIIllIllIllllI.aa.getTickCount());
        }
        lllllllllllllllIlIlIIllIllIllIIl = lllllllllllllllIlIlIIllIllIllIlI.iterator();
        while (f.llllIlIlIIIIII(lllllllllllllllIlIlIIllIllIllIIl.hasNext() ? 1 : 0)) {
            q lllllllllllllllIlIlIIllIllIllIII = (q)lllllllllllllllIlIlIIllIllIllIIl.next();
            long lllllllllllllllIlIlIIllIllIlIlll = Instant.now().getEpochSecond();
            N[] lllllllllllllllIlIlIIllIllIlIllI = lllllllllllllllIlIlIIllIllIllIII.ae();
            int lllllllllllllllIlIlIIllIllIlIlIl = lllllllllllllllIlIlIIllIllIlIllI.length;
            int lllllllllllllllIlIlIIllIllIlIlII = llIIIlIlIllI[1];
            while (f.llllIlIlIIIIIl(lllllllllllllllIlIlIIllIllIlIlII, lllllllllllllllIlIlIIllIllIlIlIl)) {
                block20: {
                    Object lllllllllllllllIlIlIIllIllIIllIl;
                    an lllllllllllllllIlIlIIllIllIIlllI;
                    String lllllllllllllllIlIlIIllIllIlIIII;
                    String lllllllllllllllIlIlIIllIllIlIIIl;
                    N lllllllllllllllIlIlIIllIllIlIIll;
                    block21: {
                        void lllllllllllllllIlIlIIllIllIlllII;
                        block25: {
                            an lllllllllllllllIlIlIIllIllIIllII2;
                            block26: {
                                block22: {
                                    block24: {
                                        String lllllllllllllllIlIlIIllIllIIllll;
                                        block19: {
                                            lllllllllllllllIlIlIIllIllIlIIll = lllllllllllllllIlIlIIllIllIlIllI[lllllllllllllllIlIlIIllIllIlIlII];
                                            int lllllllllllllllIlIlIIllIllIlIIlI = lllllllllllllllIlIlIIllIllIlIIll.aO();
                                            lllllllllllllllIlIlIIllIllIlIIIl = lllllllllllllllIlIlIIllIllIlIIll.aJ();
                                            lllllllllllllllIlIlIIllIllIlIIII = Integer.toString(lllllllllllllllIlIlIIllIllIllllI.aa.getVarbitValue(lllllllllllllllIlIlIIllIllIlIIlI));
                                            lllllllllllllllIlIlIIllIllIIllll = lllllllllllllllIlIlIIllIllIllllI.ac.getRSProfileConfiguration(llIIIlIIIlII[llIIIlIlIllI[9]], lllllllllllllllIlIlIIllIllIlIIIl);
                                            lllllllllllllllIlIlIIllIllIIlllI = lllllllllllllllIlIlIIllIllIlIIll.aL().f(lllllllllllllllIlIlIIllIllIllllI.aa.getVarbitValue(lllllllllllllllIlIlIIllIllIlIIlI));
                                            if (!f.llllIlIIlllllI(lllllllllllllllIlIlIIllIllIIlllI)) break block19;
                                            0;
                                            if (1 < 0) {
                                                return ((4 ^ 0x4F ^ (0x3F ^ 0x48)) & (0x7C ^ 0x15 ^ (0x57 ^ 2) ^ -1)) != 0;
                                            }
                                            break block20;
                                        }
                                        if (!f.llllIlIIllllll(lllllllllllllllIlIlIIllIllIIllll) || !f.llllIlIlIIlIlI(((String[])(lllllllllllllllIlIlIIllIllIIllIl = lllllllllllllllIlIlIIllIllIIllll.split(llIIIlIIIlII[llIIIlIlIllI[10]]))).length, llIIIlIlIllI[4])) break block21;
                                        if (!f.llllIlIlIIIIII(lllllllllllllllIlIlIIllIllIIllIl[llIIIlIlIllI[1]].equals(lllllllllllllllIlIlIIllIllIlIIII) ? 1 : 0)) break block22;
                                        long lllllllllllllllIlIlIIllIllIIllII2 = 0L;
                                        try {
                                            lllllllllllllllIlIlIIllIllIIllII2 = Long.parseLong(lllllllllllllllIlIlIIllIllIIllIl[llIIIlIlIllI[0]]);
                                        }
                                        catch (NumberFormatException lllllllllllllllIlIlIIllIllIIlIlI) {
                                            // empty catch block
                                        }
                                        0;
                                        if (2 != 2) {
                                            return ((0x72 ^ 0x2D) & ~(0xFB ^ 0xA4)) != 0;
                                        }
                                        if (!f.llllIlIlIIIllI(f.llllIlIlIIlIII(lllllllllllllllIlIlIIllIllIIllII2 + 300L, lllllllllllllllIlIlIIllIllIlIlll)) || !f.llllIlIlIIIllI(f.llllIlIlIIlIII(lllllllllllllllIlIlIIllIllIlIlll + 30L, lllllllllllllllIlIlIIllIllIIllII2))) break block24;
                                        0;
                                        if (null != null) {
                                            return ((6 ^ 9) & ~(0x26 ^ 0x29)) != 0;
                                        }
                                        break block20;
                                    }
                                    0;
                                    if (1 < 0) {
                                        return ((86 + 28 - -35 + 14 ^ 145 + 147 - 268 + 169) & (0xB5 ^ 0xAE ^ (0xF4 ^ 0x8D) ^ -1)) != 0;
                                    }
                                    break block21;
                                }
                                if (!f.llllIlIlIIIIll(lllllllllllllllIlIlIIllIllIllllI.ak ? 1 : 0) || !f.llllIlIlIIIIlI((int)lllllllllllllllIlIlIIllIllIlllII, llIIIlIlIllI[0])) break block25;
                                lllllllllllllllIlIlIIllIllIIllII2 = lllllllllllllllIlIlIIllIllIlIIll.aL().f(Integer.parseInt(lllllllllllllllIlIlIIllIllIIllIl[llIIIlIlIllI[1]]));
                                if (!f.llllIlIIlllllI(lllllllllllllllIlIlIIllIllIIllII2)) break block26;
                                0;
                                if (((30 + 16 - -7 + 76 ^ 74 + 128 - 191 + 136) & (122 + 16 - 122 + 155 ^ 60 + 162 - 217 + 180 ^ -1)) != 0) {
                                    return ((0x8E ^ 0xAC ^ (0xAA ^ 0xB9)) & (159 + 84 - 83 + 20 ^ 55 + 113 - 155 + 120 ^ -1)) != 0;
                                }
                                break block20;
                            }
                            int lllllllllllllllIlIlIIllIllIIlIll = lllllllllllllllIlIlIIllIllIIllII2.bd();
                            if (f.llllIlIlIIIIII(lllllllllllllllIlIlIIllIllIllllI.a(lllllllllllllllIlIlIIllIllIIllII2, lllllllllllllllIlIlIIllIllIIlllI) ? 1 : 0)) {
                                Integer lllllllllllllllIlIlIIllIllIIlIlI = (Integer)lllllllllllllllIlIlIIllIllIllllI.ac.getRSProfileConfiguration(llIIIlIIIlII[llIIIlIlIllI[11]], llIIIlIIIlII[llIIIlIlIllI[12]], Integer.TYPE);
                                Integer lllllllllllllllIlIlIIllIllIIlIIl = (Integer)lllllllllllllllIlIlIIllIllIllllI.ac.getRSProfileConfiguration(llIIIlIIIlII[llIIIlIlIllI[13]], llIIIlIIIlII[llIIIlIlIllI[14]], Integer.TYPE);
                                int lllllllllllllllIlIlIIllIllIIlIII = (int)Math.abs(Instant.now().getEpochSecond() / 60L % (long)lllllllllllllllIlIlIIllIllIIlIll - (long)lllllllllllllllIlIlIIllIllIIlIll);
                                T.debug(llIIIlIIIlII[llIIIlIlIllI[15]], (Object)lllllllllllllllIlIlIIllIllIIlIII, (Object)lllllllllllllllIlIlIIllIllIIlIll);
                                if (f.llllIlIIllllll(lllllllllllllllIlIlIIllIllIIlIIl) && f.llllIlIlIIIIII(lllllllllllllllIlIlIIllIllIIlIIl) && f.llllIlIlIIlIIl(lllllllllllllllIlIlIIllIllIIlIII, lllllllllllllllIlIlIIllIllIIlIIl % lllllllllllllllIlIlIIllIllIIlIll)) {
                                    WorldPoint lllllllllllllllIlIlIIllIllIIIlll = lllllllllllllllIlIlIIllIllIllllI.aa.getLocalPlayer().getWorldLocation();
                                    Object[] objectArray = new Object[llIIIlIlIllI[6]];
                                    objectArray[f.llIIIlIlIllI[1]] = lllllllllllllllIlIlIIllIllIIlIII;
                                    objectArray[f.llIIIlIlIllI[0]] = lllllllllllllllIlIlIIllIllIIlIIl;
                                    objectArray[f.llIIIlIlIllI[4]] = lllllllllllllllIlIlIIllIllIIlIIl % lllllllllllllllIlIlIIllIllIIlIll;
                                    objectArray[f.llIIIlIlIllI[5]] = lllllllllllllllIlIlIIllIllIIIlll;
                                    T.error(llIIIlIIIlII[llIIIlIlIllI[16]], objectArray);
                                }
                                if (!f.llllIlIIllllll(lllllllllllllllIlIlIIllIllIIlIlI) || f.llllIlIlIIllII(lllllllllllllllIlIlIIllIllIIlIll, lllllllllllllllIlIlIIllIllIIlIlI)) {
                                    T.debug(llIIIlIIIlII[llIIIlIlIllI[17]], (Object)lllllllllllllllIlIlIIllIllIIlIll);
                                    lllllllllllllllIlIlIIllIllIllllI.ac.setRSProfileConfiguration(llIIIlIIIlII[llIIIlIlIllI[18]], llIIIlIIIlII[llIIIlIlIllI[19]], (Object)lllllllllllllllIlIlIIllIllIIlIll);
                                    lllllllllllllllIlIlIIllIllIllllI.ac.setRSProfileConfiguration(llIIIlIIIlII[llIIIlIlIllI[20]], llIIIlIIIlII[llIIIlIlIllI[21]], (Object)lllllllllllllllIlIlIIllIllIIlIII);
                                }
                            }
                            0;
                            if (-1 >= 0) {
                                return ((14 + 155 - 167 + 213 ^ 33 + 49 - 77 + 192) & (0x1D ^ 0x14 ^ (1 ^ 0x1A) ^ -1)) != 0;
                            }
                            break block21;
                        }
                        T.debug(llIIIlIIIlII[llIIIlIlIllI[22]], (Object)lllllllllllllllIlIlIIllIllIllllI.ak, (Object)((int)lllllllllllllllIlIlIIllIllIlllII));
                    }
                    if (!f.llllIlIlIIIlll((Object)lllllllllllllllIlIlIIllIllIIlllI.aZ(), (Object)n.DEAD) || f.llllIlIIllllIl((Object)lllllllllllllllIlIlIIllIllIIlllI.aZ(), (Object)n.HARVESTABLE)) {
                        lllllllllllllllIlIlIIllIllIllllI.ae.a(lllllllllllllllIlIlIIllIllIlIIll, null);
                        lllllllllllllllIlIlIIllIllIllllI.af.a(lllllllllllllllIlIlIIllIllIlIIll, llIIIlIlIllI[1]);
                    }
                    lllllllllllllllIlIlIIllIllIIllIl = lllllllllllllllIlIlIIllIllIlIIII + ":" + lllllllllllllllIlIlIIllIllIlIlll;
                    lllllllllllllllIlIlIIllIllIllllI.ac.setRSProfileConfiguration(llIIIlIIIlII[llIIIlIlIllI[23]], lllllllllllllllIlIlIIllIllIlIIIl, lllllllllllllllIlIlIIllIllIIllIl);
                    lllllllllllllllIlIlIIllIllIllIll = llIIIlIlIllI[0];
                }
                ++lllllllllllllllIlIlIIllIllIlIlII;
                0;
                if (-3 < 0) continue;
                return ((0x76 ^ 0x4F) & ~(0x9A ^ 0xA3)) != 0;
            }
            0;
            if (2 > 0) continue;
            return ((0x33 ^ 0x7E) & ~(0x6D ^ 0x20)) != 0;
        }
        lllllllllllllllIlIlIIllIllIllllI.ak = llIIIlIlIllI[1];
        lllllllllllllllIlIlIIllIllIllllI.al = lllllllllllllllIlIlIIllIllIllIlI;
        if (f.llllIlIlIIIIII(lllllllllllllllIlIlIIllIllIllIll)) {
            lllllllllllllllIlIlIIllIllIllllI.E();
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
        void lllllllllllllllIlIlIIllIlIlIIIll;
        void lllllllllllllllIlIlIIllIlIlIIlII;
        void lllllllllllllllIlIlIIllIlIlIIlll;
        void lllllllllllllllIlIlIIllIlIlIIIIl;
        long l2 = Instant.now().getEpochSecond();
        boolean bl = Integer.toString(m.ON.ordinal()).equals(this.ac.getConfiguration(llIIIlIIIlII[llIIIlIlIllI[27]], string, llIIIlIIIlII[llIIIlIlIllI[28]]));
        boolean bl2 = Boolean.TRUE.equals(this.ac.getConfiguration(llIIIlIIIlII[llIIIlIlIllI[29]], string, llIIIlIIIlII[llIIIlIlIllI[30]], Boolean.class));
        String string2 = n2.aJ();
        String string3 = this.ac.getConfiguration(llIIIlIIIlII[llIIIlIlIllI[31]], string, string2);
        if (f.llllIlIIlllllI(string3)) {
            return null;
        }
        long lllllllllllllllIlIlIIllIlIlIIIII = 0L;
        int lllllllllllllllIlIlIIllIlIIlllll = llIIIlIlIllI[1];
        Object lllllllllllllllIlIlIIllIlIIllllI = lllllllllllllllIlIlIIllIlIlIIIIl.split(llIIIlIIIlII[llIIIlIlIllI[32]]);
        if (f.llllIlIlIIlIlI(((String[])lllllllllllllllIlIlIIllIlIIllllI).length, llIIIlIlIllI[4])) {
            try {
                lllllllllllllllIlIlIIllIlIIlllll = Integer.parseInt(lllllllllllllllIlIlIIllIlIIllllI[llIIIlIlIllI[1]]);
                lllllllllllllllIlIlIIllIlIlIIIII = Long.parseLong(lllllllllllllllIlIlIIllIlIIllllI[llIIIlIlIllI[0]]);
            }
            catch (NumberFormatException lllllllllllllllIlIlIIllIlIIlllIl) {
                // empty catch block
            }
            0;
            if (3 < 0) {
                return null;
            }
        }
        if (f.llllIlIlIIIlIl(f.llllIlIlIIllIl(lllllllllllllllIlIlIIllIlIlIIIII, 0L))) {
            return null;
        }
        lllllllllllllllIlIlIIllIlIIllllI = lllllllllllllllIlIlIIllIlIlIIlll.aL().f(lllllllllllllllIlIlIIllIlIIlllll);
        if (f.llllIlIIlllllI(lllllllllllllllIlIlIIllIlIIllllI)) {
            return null;
        }
        int lllllllllllllllIlIlIIllIlIIlllIl = ((an)lllllllllllllllIlIlIIllIlIIllllI).bb();
        int lllllllllllllllIlIlIIllIlIIlllII = ((an)lllllllllllllllIlIlIIllIlIIllllI).bc();
        int lllllllllllllllIlIlIIllIlIIllIll = ((an)lllllllllllllllIlIlIIllIlIIllllI).bd();
        if (f.llllIlIlIIIIII((int)lllllllllllllllIlIlIIllIlIlIIlII) && f.llllIlIIllllIl((Object)((an)lllllllllllllllIlIlIIllIlIIllllI).aY(), (Object)au.WEEDS)) {
            lllllllllllllllIlIlIIllIlIIlllIl = llIIIlIlIllI[1];
            lllllllllllllllIlIlIIllIlIIlllII = llIIIlIlIllI[0];
            lllllllllllllllIlIlIIllIlIIllIll = llIIIlIlIllI[1];
        }
        if (f.llllIlIlIIIIII((int)lllllllllllllllIlIlIIllIlIlIIIll)) {
            lllllllllllllllIlIlIIllIlIIllIll /= llIIIlIlIllI[7];
        }
        long lllllllllllllllIlIlIIllIlIIllIlI = 0L;
        if (f.llllIlIlIIIllI(lllllllllllllllIlIlIIllIlIIllIll)) {
            void lllllllllllllllIlIlIIllIlIlIIllI;
            void lllllllllllllllIlIlIIllIlIlIIlIl;
            f lllllllllllllllIlIlIIllIlIlIlIII;
            long lllllllllllllllIlIlIIllIlIIllIIl = lllllllllllllllIlIlIIllIlIlIlIII.a(lllllllllllllllIlIlIIllIlIIllIll, llIIIlIlIllI[1], (long)lllllllllllllllIlIlIIllIlIlIIlIl, (String)lllllllllllllllIlIlIIllIlIlIIllI);
            long lllllllllllllllIlIlIIllIlIIllIII = lllllllllllllllIlIlIIllIlIlIlIII.a(lllllllllllllllIlIlIIllIlIIllIll, llIIIlIlIllI[1], lllllllllllllllIlIlIIllIlIlIIIII, (String)lllllllllllllllIlIlIIllIlIlIIllI);
            int lllllllllllllllIlIlIIllIlIIlIlll = (int)(lllllllllllllllIlIlIIllIlIIllIIl - lllllllllllllllIlIlIIllIlIIllIII) / (lllllllllllllllIlIlIIllIlIIllIll * llIIIlIlIllI[33]);
            lllllllllllllllIlIlIIllIlIIllIlI = lllllllllllllllIlIlIIllIlIlIlIII.a(lllllllllllllllIlIlIIllIlIIllIll, lllllllllllllllIlIlIIllIlIIlllII - llIIIlIlIllI[0] - lllllllllllllllIlIlIIllIlIIlllIl, lllllllllllllllIlIlIIllIlIIllIII, (String)lllllllllllllllIlIlIIllIlIlIIllI);
            if (f.llllIlIlIIllII(lllllllllllllllIlIlIIllIlIIlllIl += lllllllllllllllIlIlIIllIlIIlIlll, lllllllllllllllIlIlIIllIlIIlllII)) {
                lllllllllllllllIlIlIIllIlIIlllIl = lllllllllllllllIlIlIIllIlIIlllII - llIIIlIlIllI[0];
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

    private static String llllIIllllllll(String lllllllllllllllIlIlIIlIllIIIlIIl, String lllllllllllllllIlIlIIlIllIIIIIII) {
        lllllllllllllllIlIlIIlIllIIIlIIl = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIIlIllIIIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlIIlIllIIIIlIl = new StringBuilder();
        char[] lllllllllllllllIlIlIIlIllIIIIlII = lllllllllllllllIlIlIIlIllIIIIIII.toCharArray();
        int lllllllllllllllIlIlIIlIllIIIIIll = llIIIlIlIllI[1];
        char[] lllllllllllllllIlIlIIlIlIllllIIl = lllllllllllllllIlIlIIlIllIIIlIIl.toCharArray();
        int lllllllllllllllIlIlIIlIlIllllIII = lllllllllllllllIlIlIIlIlIllllIIl.length;
        int lllllllllllllllIlIlIIlIlIlllIlll = llIIIlIlIllI[1];
        while (f.llllIlIlIIIIIl(lllllllllllllllIlIlIIlIlIlllIlll, lllllllllllllllIlIlIIlIlIllllIII)) {
            char lllllllllllllllIlIlIIlIllIIIlIll = lllllllllllllllIlIlIIlIlIllllIIl[lllllllllllllllIlIlIIlIlIlllIlll];
            lllllllllllllllIlIlIIlIllIIIIlIl.append((char)(lllllllllllllllIlIlIIlIllIIIlIll ^ lllllllllllllllIlIlIIlIllIIIIlII[lllllllllllllllIlIlIIlIllIIIIIll % lllllllllllllllIlIlIIlIllIIIIlII.length]));
            0;
            ++lllllllllllllllIlIlIIlIllIIIIIll;
            ++lllllllllllllllIlIlIIlIlIlllIlll;
            0;
            if (-(0x52 ^ 0x57) < 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIlIIlIllIIIIlIl);
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
        f lllllllllllllllIlIlIIlllIIlIlIll;
        if (f.llllIlIlIIIIII(this.ab.bottomless() ? 1 : 0)) {
            return K.BOTTOMLESS_BUCKET;
        }
        switch (g.am[lllllllllllllllIlIlIIlllIIlIlIll.ab.compostType().ordinal()]) {
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
        void lllllllllllllllIlIlIIlllIlllIIll;
        void lllllllllllllllIlIlIIlllIlllIIlI;
        f lllllllllllllllIlIlIIlllIlllIlII;
        p p2 = p.b(q2.X());
        if (f.llllIlIIlllllI((Object)p2)) {
            return llIIIlIlIllI[0];
        }
        if (f.llllIlIlIIIIlI(lllllllllllllllIlIlIIlllIlllIlII.aa.getLocalPlayer().distanceTo(lllllllllllllllIlIlIIlllIlllIIlI.Y()), lllllllllllllllIlIlIIlllIlllIIlI.Z())) {
            return llIIIlIlIllI[1];
        }
        x lllllllllllllllIlIlIIlllIlllIIIl = lllllllllllllllIlIlIIlllIlllIlII.a((p)lllllllllllllllIlIlIIlllIlllIIlI);
        N[] lllllllllllllllIlIlIIlllIlllIIII = lllllllllllllllIlIlIIlllIlllIIll.ae();
        int lllllllllllllllIlIlIIlllIllIllll = lllllllllllllllIlIlIIlllIlllIIII.length;
        int lllllllllllllllIlIlIIlllIllIlllI = llIIIlIlIllI[1];
        while (f.llllIlIlIIIIIl(lllllllllllllllIlIlIIlllIllIlllI, lllllllllllllllIlIlIIlllIllIllll)) {
            N lllllllllllllllIlIlIIlllIllIllIl = lllllllllllllllIlIlIIlllIlllIIII[lllllllllllllllIlIlIIlllIllIlllI];
            if (f.llllIlIlIIIIll(lllllllllllllllIlIlIIlllIlllIlII.i(lllllllllllllllIlIlIIlllIllIllIl) ? 1 : 0)) {
                0;
                if ((0x19 ^ 0x1D) < -1) {
                    return ((0xDC ^ 0x8C) & ~(0x6C ^ 0x3C)) != 0;
                }
            } else if (f.llllIlIlIIIIII(lllllllllllllllIlIlIIlllIlllIIIl.E(lllllllllllllllIlIlIIlllIllIllIl) ? 1 : 0) && f.llllIlIlIIIIll(lllllllllllllllIlIlIIlllIlllIlII.e(lllllllllllllllIlIlIIlllIllIllIl) ? 1 : 0)) {
                if (f.llllIlIIlllllI((Object)lllllllllllllllIlIlIIlllIlllIIIl.C(lllllllllllllllIlIlIIlllIllIllIl)) && f.llllIlIlIIIIII(lllllllllllllllIlIlIIlllIlllIlII.d(lllllllllllllllIlIlIIlllIllIllIl) ? 1 : 0)) {
                    0;
                    if (((0x3F ^ 0x7D) & ~(0xE7 ^ 0xA5)) != 0) {
                        return ((0x55 ^ 0x66) & ~(0x67 ^ 0x54)) != 0;
                    }
                } else {
                    return llIIIlIlIllI[1];
                }
            }
            ++lllllllllllllllIlIlIIlllIllIlllI;
            0;
            if (((58 + 86 - 74 + 60 ^ 136 + 29 - 116 + 118) & (24 + 72 - 11 + 96 ^ 45 + 101 - 101 + 99 ^ -1)) != (0x5A ^ 0x16 ^ (0x88 ^ 0xC0))) continue;
            return ((0xF5 ^ 0xAD ^ (0xF ^ 0x1C)) & (0x8E ^ 0xBF ^ (0xF5 ^ 0x8F) ^ -1)) != 0;
        }
        return llIIIlIlIllI[0];
    }

    private static String llllIIllllllIl(String lllllllllllllllIlIlIIlIlIllIllII, String lllllllllllllllIlIlIIlIlIllIllIl) {
        try {
            SecretKeySpec lllllllllllllllIlIlIIlIlIlllIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIlIlIllIllIl.getBytes(StandardCharsets.UTF_8)), llIIIlIlIllI[10]), "DES");
            Cipher lllllllllllllllIlIlIIlIlIlllIIII = Cipher.getInstance("DES");
            lllllllllllllllIlIlIIlIlIlllIIII.init(llIIIlIlIllI[4], lllllllllllllllIlIlIIlIlIlllIIIl);
            return new String(lllllllllllllllIlIlIIlIlIlllIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIlIlIllIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlIIlIlIllIllll) {
            lllllllllllllllIlIlIIlIlIllIllll.printStackTrace();
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
        void lllllllllllllllIlIlIIllllIIIIIlI;
        this.Y.clear();
        p[] pArray = p.values();
        int n2 = pArray.length;
        int lllllllllllllllIlIlIIllllIIIIIIl = llIIIlIlIllI[1];
        while (f.llllIlIlIIIIIl(lllllllllllllllIlIlIIllllIIIIIIl, (int)lllllllllllllllIlIlIIllllIIIIIlI)) {
            f lllllllllllllllIlIlIIllllIIIIlII;
            void lllllllllllllllIlIlIIllllIIIIIll;
            void lllllllllllllllIlIlIIllllIIIIIII = lllllllllllllllIlIlIIllllIIIIIll[lllllllllllllllIlIlIIllllIIIIIIl];
            x lllllllllllllllIlIlIIlllIlllllll = x.a(lllllllllllllllIlIlIIllllIIIIlII.ac, (p)lllllllllllllllIlIlIIllllIIIIIII);
            lllllllllllllllIlIlIIllllIIIIlII.Y.put((p)lllllllllllllllIlIlIIllllIIIIIII, lllllllllllllllIlIlIIlllIlllllll);
            0;
            ++lllllllllllllllIlIlIIllllIIIIIIl;
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
            f lllllllllllllllIlIlIIlllIlllllIl;
            lllllllllllllllIlIlIIlllIlllllIl.aj = lllllllllllllllIlIlIIlllIlllllIl.y();
        }
        return this.aj;
    }

    /*
     * WARNING - void declaration
     */
    public Map<K, Integer> A() {
        void var3_3;
        void lllllllllllllllIlIlIIlllIlIIIIll;
        Object lllllllllllllllIlIlIIlllIIllllll;
        Object lllllllllllllllIlIlIIlllIlIIIIII;
        HashMap<K, Integer> hashMap = new HashMap<K, Integer>(this.B());
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Inventory.getAll());
        0;
        arrayList.addAll(Equipment.getAll());
        0;
        Object lllllllllllllllIlIlIIlllIlIIIIIl = arrayList.iterator();
        while (f.llllIlIlIIIIII(lllllllllllllllIlIlIIlllIlIIIIIl.hasNext() ? 1 : 0)) {
            lllllllllllllllIlIlIIlllIlIIIIII = (Item)lllllllllllllllIlIlIIlllIlIIIIIl.next();
            if (f.llllIlIIlllllI(lllllllllllllllIlIlIIlllIlIIIIII)) {
                0;
                if (-1 < 2) continue;
                return null;
            }
            lllllllllllllllIlIlIIlllIIllllll = K.d((Item)lllllllllllllllIlIlIIlllIlIIIIII);
            if (f.llllIlIIlllllI(lllllllllllllllIlIlIIlllIIllllll)) {
                0;
                if (-1 != 1) continue;
                return null;
            }
            if (f.llllIlIlIIIIII(lllllllllllllllIlIlIIlllIlIIIIll.containsKey(lllllllllllllllIlIlIIlllIIllllll) ? 1 : 0)) {
                lllllllllllllllIlIlIIlllIlIIIIll.put(lllllllllllllllIlIlIIlllIIllllll, (Integer)lllllllllllllllIlIlIIlllIlIIIIll.get(lllllllllllllllIlIlIIlllIIllllll) - lllllllllllllllIlIlIIlllIlIIIIII.getQuantity());
                0;
            }
            0;
            if (null == null) continue;
            return null;
        }
        lllllllllllllllIlIlIIlllIlIIIIIl = new HashMap();
        lllllllllllllllIlIlIIlllIlIIIIII = lllllllllllllllIlIlIIlllIlIIIIll.entrySet().iterator();
        while (f.llllIlIlIIIIII(lllllllllllllllIlIlIIlllIlIIIIII.hasNext() ? 1 : 0)) {
            lllllllllllllllIlIlIIlllIIllllll = (Map.Entry)lllllllllllllllIlIlIIlllIlIIIIII.next();
            if (f.llllIlIlIIIllI((Integer)lllllllllllllllIlIlIIlllIIllllll.getValue())) {
                lllllllllllllllIlIlIIlllIlIIIIIl.put((K)((Object)lllllllllllllllIlIlIIlllIIllllll.getKey()), (Integer)lllllllllllllllIlIlIIlllIIllllll.getValue());
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
        void lllllllllllllllIlIlIIllIIlIllllI;
        if (f.llllIlIlIIIlll(chatMessage.getType(), ChatMessageType.GAMEMESSAGE) && f.llllIlIlIIIlll(chatMessage.getType(), ChatMessageType.SPAM)) {
            return;
        }
        H lllllllllllllllIlIlIIllIIlIlllIl = b.a(lllllllllllllllIlIlIIllIIlIllllI.getMessage());
        if (f.llllIlIIlllllI((Object)lllllllllllllllIlIlIIllIIlIlllIl)) {
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
                f lllllllllllllllIlIlIIllIlllllIII;
                return lllllllllllllllIlIlIIllIlllllIII.ab.defaultAllotment().bf();
            }
            case 2: {
                f lllllllllllllllIlIlIIllIlllllIII;
                return lllllllllllllllIlIlIIllIlllllIII.ab.defaultHerb().bf();
            }
            case 3: {
                f lllllllllllllllIlIlIIllIlllllIII;
                return lllllllllllllllIlIlIIllIlllllIII.ab.defaultFlower().bf();
            }
            case 4: {
                f lllllllllllllllIlIlIIllIlllllIII;
                return lllllllllllllllIlIlIIllIlllllIII.ab.defaultBush().bf();
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
        void lllllllllllllllIlIlIIllIIlIIIlII;
        Iterator lllllllllllllllIlIlIIllIIlIIIIlI;
        void lllllllllllllllIlIlIIllIIlIIIIIl2;
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        long l2 = Instant.now().getEpochSecond();
        p[] pArray = p.W();
        int n2 = pArray.length;
        int lllllllllllllllIlIlIIllIIlIIIIII = llIIIlIlIllI[1];
        while (f.llllIlIlIIIIIl(lllllllllllllllIlIlIIllIIlIIIIII, (int)lllllllllllllllIlIlIIllIIlIIIIIl2)) {
            f lllllllllllllllIlIlIIllIIlIIIlIl;
            void lllllllllllllllIlIlIIllIIIllllll = lllllllllllllllIlIlIIllIIlIIIIlI[lllllllllllllllIlIlIIllIIlIIIIII];
            if (f.llllIlIlIIIIll(lllllllllllllllIlIlIIllIIlIIIlIl.b((p)lllllllllllllllIlIlIIllIIIllllll) ? 1 : 0)) {
                0;
                if (-(35 + 139 - 160 + 131 ^ 18 + 139 - 71 + 63) > 0) {
                    return null;
                }
            } else {
                x lllllllllllllllIlIlIIllIIIlllllI = lllllllllllllllIlIlIIllIIlIIIlIl.a((p)lllllllllllllllIlIlIIllIIIllllll);
                q lllllllllllllllIlIlIIllIIIllllIl = lllllllllllllllIlIlIIllIIlIIIlIl.Z.af().get(lllllllllllllllIlIlIIllIIIllllll);
                N[] lllllllllllllllIlIlIIllIIIllllII = lllllllllllllllIlIlIIllIIIllllIl.ae();
                int lllllllllllllllIlIlIIllIIIlllIll = lllllllllllllllIlIlIIllIIIllllII.length;
                int lllllllllllllllIlIlIIllIIIlllIlI = llIIIlIlIllI[1];
                while (f.llllIlIlIIIIIl(lllllllllllllllIlIlIIllIIIlllIlI, lllllllllllllllIlIlIIllIIIlllIll)) {
                    N lllllllllllllllIlIlIIllIIIlllIIl = lllllllllllllllIlIlIIllIIIllllII[lllllllllllllllIlIlIIllIIIlllIlI];
                    if (f.llllIlIlIIIIll(lllllllllllllllIlIlIIllIIlIIIlIl.i(lllllllllllllllIlIlIIllIIIlllIIl) ? 1 : 0)) {
                        0;
                        if (((0x83 ^ 0xBC ^ (0x6E ^ 0x15)) & (97 + 63 - 77 + 142 ^ 10 + 43 - 16 + 128 ^ -1)) <= -1) {
                            return null;
                        }
                    } else {
                        void lllllllllllllllIlIlIIllIIlIIIIll;
                        am lllllllllllllllIlIlIIllIIIlllIII = lllllllllllllllIlIlIIllIIlIIIlIl.j(lllllllllllllllIlIlIIllIIIlllIIl);
                        if (f.llllIlIIllllll(lllllllllllllllIlIlIIllIIIlllIII) && f.llllIlIlIIIllI(f.llllIlIlIlIIII(lllllllllllllllIlIlIIllIIIlllIII.ba(), (long)lllllllllllllllIlIlIIllIIlIIIIll))) {
                            0;
                            if (2 < 0) {
                                return null;
                            }
                        } else {
                            av lllllllllllllllIlIlIIllIIIllIlll = lllllllllllllllIlIlIIllIIIlllllI.C(lllllllllllllllIlIlIIllIIIlllIIl);
                            if (f.llllIlIIlllllI((Object)lllllllllllllllIlIlIIllIIIllIlll)) {
                                0;
                                if (1 <= 0) {
                                    return null;
                                }
                            } else if (f.llllIlIIllllIl((Object)lllllllllllllllIlIlIIllIIIllIlll, (Object)av.DEFAULT) && f.llllIlIIlllllI((Object)(lllllllllllllllIlIlIIllIIIllIlll = lllllllllllllllIlIlIIllIIlIIIlIl.a(lllllllllllllllIlIlIIllIIIlllIIl.aL())))) {
                                0;
                                if (null != null) {
                                    return null;
                                }
                            } else {
                                lllllllllllllllIlIlIIllIIlIIIlII.put(lllllllllllllllIlIlIIllIIIllIlll.aA(), lllllllllllllllIlIlIIllIIlIIIlII.getOrDefault(lllllllllllllllIlIlIIllIIIllIlll.aA(), llIIIlIlIllI[1]) + lllllllllllllllIlIlIIllIIIllIlll.bl());
                                0;
                            }
                        }
                    }
                    ++lllllllllllllllIlIlIIllIIIlllIlI;
                    0;
                    if (1 >= ((0x9E ^ 0xB5 ^ (0x10 ^ 0x7A)) & (0x31 ^ 0x34 ^ (0xC7 ^ 0x83) ^ -1))) continue;
                    return null;
                }
            }
            ++lllllllllllllllIlIlIIllIIlIIIIII;
            0;
            if (-1 <= 1) continue;
            return null;
        }
        lllllllllllllllIlIlIIllIIlIIIIlI = Inventory.getAll().iterator();
        while (f.llllIlIlIIIIII(lllllllllllllllIlIlIIllIIlIIIIlI.hasNext() ? 1 : 0)) {
            Item lllllllllllllllIlIlIIllIIlIIIIIl2 = (Item)lllllllllllllllIlIlIIllIIlIIIIlI.next();
            if (f.llllIlIlIIIIII(lllllllllllllllIlIlIIllIIlIIIlII.containsKey(lllllllllllllllIlIlIIllIIlIIIIIl2.getId()) ? 1 : 0)) {
                lllllllllllllllIlIlIIllIIlIIIIII = (Integer)lllllllllllllllIlIlIIllIIlIIIlII.get(lllllllllllllllIlIlIIllIIlIIIIIl2.getId()) - lllllllllllllllIlIlIIllIIlIIIIIl2.getQuantity();
                if (f.llllIlIlIIIlIl(lllllllllllllllIlIlIIllIIlIIIIII)) {
                    lllllllllllllllIlIlIIllIIlIIIlII.remove(lllllllllllllllIlIlIIllIIlIIIIIl2.getId());
                    0;
                    0;
                    if (((0x5A ^ 0xD) & ~(0xDC ^ 0x8B)) < 2) continue;
                    return null;
                }
                lllllllllllllllIlIlIIllIIlIIIlII.put(lllllllllllllllIlIlIIllIIlIIIIIl2.getId(), lllllllllllllllIlIlIIllIIlIIIIII);
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
        f lllllllllllllllIlIlIIlllIIlIIllI;
        void lllllllllllllllIlIlIIlllIIlIIlII;
        void lllllllllllllllIlIlIIlllIIlIIlIl;
        x x2 = this.b(n2.aM());
        if (f.llllIlIIlllllI(x2)) {
            return llIIIlIlIllI[0];
        }
        an lllllllllllllllIlIlIIlllIIlIIIll = lllllllllllllllIlIlIIlllIIlIIlIl.aI();
        if (!f.llllIlIlIIIIll(lllllllllllllllIlIlIIlllIIlIIlIl.aL().aR() ? 1 : 0) || !f.llllIlIlIIIIII(lllllllllllllllIlIlIIlllIIlIIlII.E((N)lllllllllllllllIlIlIIlllIIlIIlIl) ? 1 : 0) || f.llllIlIlIIIIll(lllllllllllllllIlIlIIlllIIlIIlII.F((N)lllllllllllllllIlIlIIlllIIlIIlIl) ? 1 : 0)) {
            return llIIIlIlIllI[0];
        }
        if (f.llllIlIIllllIl((Object)lllllllllllllllIlIlIIlllIIlIIlIl.aL(), (Object)P.BUSH) && f.llllIlIlIIIIll(lllllllllllllllIlIlIIlllIIlIIIll.bb()) && f.llllIlIlIIIlll((Object)lllllllllllllllIlIlIIlllIIlIIIll.aY(), (Object)au.WEEDS)) {
            return llIIIlIlIllI[0];
        }
        if (f.llllIlIIllllIl((Object)lllllllllllllllIlIlIIlllIIlIIIll.aZ(), (Object)n.GROWING) && (!f.llllIlIlIIIlll((Object)lllllllllllllllIlIlIIlllIIlIIIll.aY(), (Object)au.GRAPE) || f.llllIlIlIIIIII(lllllllllllllllIlIlIIlllIIlIIllI.f((N)lllllllllllllllIlIlIIlllIIlIIlIl) ? 1 : 0)) && f.llllIlIlIIIlll((Object)lllllllllllllllIlIlIIlllIIlIIIll.aY(), (Object)au.WEEDS)) {
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
            f lllllllllllllllIlIlIIllllIIIlIll;
            lllllllllllllllIlIlIIllllIIIlIll.ai = lllllllllllllllIlIlIIllllIIIlIll.z();
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
        H lllllllllllllllIlIlIIlllIIlIllIl;
        f lllllllllllllllIlIlIIlllIIllIlIl;
        void lllllllllllllllIlIlIIlllIIllIIll;
        void lllllllllllllllIlIlIIlllIIllIlII;
        HashMap<K, Integer> hashMap = new HashMap<K, Integer>();
        q q2 = this.x();
        if (f.llllIlIIlllllI(q2)) {
            return lllllllllllllllIlIlIIlllIIllIlII;
        }
        int lllllllllllllllIlIlIIlllIIllIIlI = Arrays.stream(lllllllllllllllIlIlIIlllIIllIIll.ae()).filter(n2 -> {
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
                    return ((0x17 ^ 0x3A) & ~(0x33 ^ 0x1E)) != 0;
                }
            } else {
                n3 = llIIIlIlIllI[1];
            }
            return n3 != 0;
        }) ? 1 : 0;
        if (f.llllIlIlIIIIII(lllllllllllllllIlIlIIlllIIllIIlI)) {
            lllllllllllllllIlIlIIlllIIllIlII.put(K.RAKE, llIIIlIlIllI[0]);
            0;
        }
        lllllllllllllllIlIlIIlllIIllIlII.put(K.SEED_DIBBER, llIIIlIlIllI[0]);
        0;
        lllllllllllllllIlIlIIlllIIllIlII.put(K.SECATEURS, llIIIlIlIllI[0]);
        0;
        lllllllllllllllIlIlIIlllIIllIlII.put(K.SPADE, llIIIlIlIllI[0]);
        0;
        List lllllllllllllllIlIlIIlllIIllIIIl = Arrays.stream(lllllllllllllllIlIlIIlllIIllIIll.ae()).filter(n2 -> {
            boolean bl;
            if (f.llllIlIlIIIIll(n2.aL().aR() ? 1 : 0)) {
                bl = llIIIlIlIllI[0];
                0;
                if (-1 > 0) {
                    return ((0x83 ^ 0x91) & ~(0x10 ^ 2)) != 0;
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
                if (null != null) {
                    return ((0xAB ^ 0xBE) & ~(0x29 ^ 0x3C)) != 0;
                }
            } else {
                bl = llIIIlIlIllI[1];
            }
            return bl;
        }).filter(lllllllllllllllIlIlIIlllIIllIlIl::i).collect(Collectors.toList());
        int lllllllllllllllIlIlIIlllIIllIIII = (int)Arrays.stream(lllllllllllllllIlIlIIlllIIllIIll.ae()).filter(n2 -> {
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
        int n3 = Arrays.stream(lllllllllllllllIlIlIIlllIIllIIll.ae()).anyMatch(n2 -> {
            boolean bl;
            if (f.llllIlIIllllIl((Object)n2.aI().aZ(), (Object)n.DISEASED)) {
                bl = llIIIlIlIllI[0];
                0;
                if (((0x1A ^ 0x48) & ~(6 ^ 0x54)) > (0x9E ^ 0x9A)) {
                    return ((0x36 ^ 0x65) & ~(0xFA ^ 0xA9)) != 0;
                }
            } else {
                bl = llIIIlIlIllI[1];
            }
            return bl;
        });
        if (f.llllIlIlIIIIII(n3)) {
            lllllllllllllllIlIlIIlllIIllIlII.put(K.PLANT_CURE, llIIIlIlIllI[0]);
            0;
        }
        x lllllllllllllllIlIlIIlllIIlIlllI = lllllllllllllllIlIlIIlllIIllIlIl.b((q)lllllllllllllllIlIlIIlllIIllIIll);
        if (f.llllIlIIllllIl((Object)lllllllllllllllIlIlIIlllIIllIlIl.ab.compostTypeFlowers(), (Object)H.LUNAR_SPELL)) {
            return lllllllllllllllIlIlIIlllIIllIlII;
        }
        if (f.llllIlIlIIIlll(lllllllllllllllIlIlIIlllIIlIlllI.an(), ar.NOTHING) && f.llllIlIlIIIIII(lllllllllllllllIlIlIIlllIIllIIIl.stream().anyMatch(n2 -> {
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
            lllllllllllllllIlIlIIlllIIllIlII.compute(lllllllllllllllIlIlIIlllIIllIlIl.ab.compostTypeFlowers().aC(), (k2, n2) -> {
                int n3;
                if (f.llllIlIIlllllI(n2)) {
                    n3 = llIIIlIlIllI[0];
                    0;
                    if (((0x1C ^ 0x59 ^ (0x2C ^ 0x73)) & (0x4F ^ 0x29 ^ (0x68 ^ 0x14) ^ -1)) != 0) {
                        return null;
                    }
                } else {
                    void lllllllllllllllIlIlIIlIllllllIIl;
                    n3 = lllllllllllllllIlIlIIlIllllllIIl.intValue() + llIIIlIlIllI[0];
                }
                return n3;
            });
            0;
        }
        if (f.llllIlIIllllIl((Object)(lllllllllllllllIlIlIIlllIIlIllIl = lllllllllllllllIlIlIIlllIIllIlIl.ab.compostType()), (Object)H.LUNAR_SPELL)) {
            return lllllllllllllllIlIlIIlllIIllIlII;
        }
        if (f.llllIlIlIIIlll(lllllllllllllllIlIlIIlllIIlIlllI.am(), ap.NOTHING) && f.llllIlIlIIIIII(lllllllllllllllIlIlIIlllIIllIIIl.stream().anyMatch(n2 -> {
            int n3;
            if (f.llllIlIlIIIIII(this.i((N)n2) ? 1 : 0) && f.llllIlIIllllIl((Object)n2.aL(), (Object)P.ALLOTMENT) && f.llllIlIlIIIIII(n2.ac().contains(llIIIlIIIlII[llIIIlIlIllI[46]]) ? 1 : 0)) {
                n3 = llIIIlIlIllI[0];
                0;
                if (null != null) {
                    return ((0x33 ^ 0x3D) & ~(0x98 ^ 0x96)) != 0;
                }
            } else {
                n3 = llIIIlIlIllI[1];
            }
            return n3 != 0;
        }) ? 1 : 0)) {
            lllllllllllllllIlIlIIlllIIllIlII.compute(lllllllllllllllIlIlIIlllIIlIllIl.aC(), (k2, n2) -> {
                int n3;
                if (f.llllIlIIlllllI(n2)) {
                    n3 = llIIIlIlIllI[0];
                    0;
                    if ((63 + 43 - -12 + 39 ^ 152 + 33 - 127 + 95) < 3) {
                        return null;
                    }
                } else {
                    void lllllllllllllllIlIlIIlIlllllllll;
                    n3 = lllllllllllllllIlIlIIlIlllllllll.intValue() + llIIIlIlIllI[0];
                }
                return n3;
            });
            0;
        }
        if (f.llllIlIlIIIlll(lllllllllllllllIlIlIIlllIIlIlllI.al(), ap.NOTHING) && f.llllIlIlIIIIII(lllllllllllllllIlIlIIlllIIllIIIl.stream().anyMatch(n2 -> {
            int n3;
            if (f.llllIlIlIIIIII(this.i((N)n2) ? 1 : 0) && f.llllIlIIllllIl((Object)n2.aL(), (Object)P.ALLOTMENT) && f.llllIlIlIIIIII(n2.ac().contains(llIIIlIIIlII[llIIIlIlIllI[45]]) ? 1 : 0)) {
                n3 = llIIIlIlIllI[0];
                0;
                if (-1 == 3) {
                    return ((2 ^ 0x31) & ~(0x37 ^ 4)) != 0;
                }
            } else {
                n3 = llIIIlIlIllI[1];
            }
            return n3 != 0;
        }) ? 1 : 0)) {
            lllllllllllllllIlIlIIlllIIllIlII.compute(lllllllllllllllIlIlIIlllIIlIllIl.aC(), (k2, n2) -> {
                int n3;
                if (f.llllIlIIlllllI(n2)) {
                    n3 = llIIIlIlIllI[0];
                    0;
                    if (3 == (0x7E ^ 0x4D ^ (0x5D ^ 0x6A))) {
                        return null;
                    }
                } else {
                    void lllllllllllllllIlIlIIllIIIIIllII;
                    n3 = lllllllllllllllIlIlIIllIIIIIllII.intValue() + llIIIlIlIllI[0];
                }
                return n3;
            });
            0;
        }
        if (f.llllIlIlIIIlll(lllllllllllllllIlIlIIlllIIlIlllI.ak(), at.NOTHING) && f.llllIlIlIIIIII(lllllllllllllllIlIlIIlllIIllIIIl.stream().anyMatch(n2 -> {
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
            lllllllllllllllIlIlIIlllIIllIlII.compute(lllllllllllllllIlIlIIlllIIlIllIl.aC(), (k2, n2) -> {
                int n3;
                if (f.llllIlIIlllllI(n2)) {
                    n3 = llIIIlIlIllI[0];
                    0;
                    if (null != null) {
                        return null;
                    }
                } else {
                    void lllllllllllllllIlIlIIllIIIIllIIl;
                    n3 = lllllllllllllllIlIlIIllIIIIllIIl.intValue() + llIIIlIlIllI[0];
                }
                return n3;
            });
            0;
        }
        if (f.llllIlIlIIIlll(lllllllllllllllIlIlIIlllIIlIlllI.aq(), ax.NOTHING) && f.llllIlIlIIIIII(lllllllllllllllIlIlIIlllIIllIIIl.stream().anyMatch(n2 -> {
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
            lllllllllllllllIlIlIIlllIIllIlII.compute(lllllllllllllllIlIlIIlllIIlIllIl.aC(), (k2, n2) -> {
                int n3;
                if (f.llllIlIIlllllI(n2)) {
                    n3 = llIIIlIlIllI[0];
                    0;
                    if (-1 >= 3) {
                        return null;
                    }
                } else {
                    void lllllllllllllllIlIlIIllIIIlIlIll;
                    n3 = lllllllllllllllIlIlIIllIIIlIlIll.intValue() + llIIIlIlIllI[0];
                }
                return n3;
            });
            0;
        }
        if (f.llllIlIlIIIlll(lllllllllllllllIlIlIIlllIIlIlllI.aq(), ax.NOTHING) && f.llllIlIlIIIIII(lllllllllllllllIlIlIIlllIIllIIIl.stream().anyMatch(n2 -> {
            int n3;
            if (f.llllIlIlIIIIII(this.i((N)n2) ? 1 : 0) && f.llllIlIIllllIl((Object)n2.aL(), (Object)P.SEAWEED) && f.llllIlIlIIIIII(n2.ac().contains(llIIIlIIIlII[llIIIlIlIllI[38]]) ? 1 : 0)) {
                n3 = llIIIlIlIllI[0];
                0;
                if (null != null) {
                    return ((0x34 ^ 0xE) & ~(0x80 ^ 0xBA)) != 0;
                }
            } else {
                n3 = llIIIlIlIllI[1];
            }
            return n3 != 0;
        }) ? 1 : 0)) {
            lllllllllllllllIlIlIIlllIIllIlII.compute(lllllllllllllllIlIlIIlllIIlIllIl.aC(), (k2, n2) -> {
                int n3;
                if (f.llllIlIIlllllI(n2)) {
                    n3 = llIIIlIlIllI[0];
                    0;
                    if (1 > (0xB2 ^ 0xB6)) {
                        return null;
                    }
                } else {
                    void lllllllllllllllIlIlIIllIIIllIIIl;
                    n3 = lllllllllllllllIlIlIIllIIIllIIIl.intValue() + llIIIlIlIllI[0];
                }
                return n3;
            });
            0;
        }
        if (f.llllIlIlIIIIII(lllllllllllllllIlIlIIlllIIllIlIl.ab.bottomless() ? 1 : 0)) {
            lllllllllllllllIlIlIIlllIIllIlII.put(K.BOTTOMLESS_BUCKET, llIIIlIlIllI[0]);
            0;
            lllllllllllllllIlIlIIlllIIllIlII.remove((Object)lllllllllllllllIlIlIIlllIIlIllIl.aC());
            0;
        }
        return hashMap;
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(an an2, an an3) {
        void lllllllllllllllIlIlIIllIlIllllII;
        void lllllllllllllllIlIlIIllIlIllllIl;
        int n2 = an2.bd();
        n n3 = an2.aZ();
        n n4 = an3.aZ();
        au au2 = an2.aY();
        if (!f.llllIlIlIIIlll((Object)au2, (Object)au.WEEDS) || !f.llllIlIlIIIlll((Object)an3.aY(), (Object)au.WEEDS) || !f.llllIlIIllllIl((Object)an3.aY(), (Object)au2) || f.llllIlIlIIIlIl(n2)) {
            return llIIIlIlIllI[1];
        }
        if (f.llllIlIIllllIl(lllllllllllllllIlIlIIllIlIllllIl, (Object)n.GROWING)) {
            void lllllllllllllllIlIlIIllIlIlllIll;
            void lllllllllllllllIlIlIIllIllIIIIII;
            void lllllllllllllllIlIlIIllIlIllllll;
            if (f.llllIlIIllllIl(lllllllllllllllIlIlIIllIlIllllII, (Object)n.GROWING) && !f.llllIlIlIIlIIl(lllllllllllllllIlIlIIllIlIllllll.bb() - lllllllllllllllIlIlIIllIllIIIIII.bb(), llIIIlIlIllI[0]) || f.llllIlIIllllIl(lllllllllllllllIlIlIIllIlIllllII, (Object)n.DISEASED)) {
                T.debug(llIIIlIIIlII[llIIIlIlIllI[24]]);
                return llIIIlIlIllI[0];
            }
            if (f.llllIlIIllllIl(lllllllllllllllIlIlIIllIlIllllII, (Object)n.HARVESTABLE) && f.llllIlIlIIIIll(lllllllllllllllIlIlIIllIlIlllIll.bh().aX() ? 1 : 0)) {
                T.debug(llIIIlIIIlII[llIIIlIlIllI[25]]);
                return llIIIlIlIllI[0];
            }
        }
        if (f.llllIlIIllllIl(lllllllllllllllIlIlIIllIlIllllIl, (Object)n.DISEASED) && f.llllIlIIllllIl(lllllllllllllllIlIlIIllIlIllllII, (Object)n.DEAD)) {
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
            void lllllllllllllllIlIlIIllIlIIIlIlI;
            void lllllllllllllllIlIlIIllIlIIIIlIl;
            long lllllllllllllllIlIlIIllIlIIIIlII = (long)(lllllllllllllllIlIlIIllIlIIIIlIl.intValue() % lllllllllllllllIlIlIIllIlIIIlIlI) * 60L;
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
        f lllllllllllllllIlIlIIlllIIIIlIlI;
        void lllllllllllllllIlIlIIlllIIIIlIIl;
        if (f.llllIlIIllllIl((Object)n2.aL(), (Object)P.GRAPES)) {
            int[] nArray = new int[llIIIlIlIllI[0]];
            nArray[f.llIIIlIlIllI[1]] = av.GRAPES.aA();
            return Inventory.getFirst((int[])nArray);
        }
        q lllllllllllllllIlIlIIlllIIIIlIII = lllllllllllllllIlIlIIlllIIIIlIIl.aM();
        x lllllllllllllllIlIlIIlllIIIIIlll = lllllllllllllllIlIlIIlllIIIIlIlI.b(lllllllllllllllIlIlIIlllIIIIlIII);
        av lllllllllllllllIlIlIIlllIIIIIllI = lllllllllllllllIlIlIIlllIIIIIlll.C((N)lllllllllllllllIlIlIIlllIIIIlIIl);
        if (f.llllIlIIlllllI((Object)lllllllllllllllIlIlIIlllIIIIIllI)) {
            return null;
        }
        if (f.llllIlIIllllIl((Object)lllllllllllllllIlIlIIlllIIIIIllI, (Object)av.DEFAULT)) {
            lllllllllllllllIlIlIIlllIIIIIllI = lllllllllllllllIlIlIIlllIIIIlIlI.a(lllllllllllllllIlIlIIlllIIIIlIIl.aL());
        }
        if (!f.llllIlIlIIIlll((Object)lllllllllllllllIlIlIIlllIIIIIllI, (Object)av.DEFAULT) || f.llllIlIIlllllI((Object)lllllllllllllllIlIlIIlllIIIIIllI)) {
            return null;
        }
        int[] nArray = new int[llIIIlIlIllI[0]];
        nArray[f.llIIIlIlIllI[1]] = lllllllllllllllIlIlIIlllIIIIIllI.aA();
        Item lllllllllllllllIlIlIIlllIIIIIlIl = Inventory.getFirst((int[])nArray);
        if (!f.llllIlIIllllll(lllllllllllllllIlIlIIlllIIIIIlIl) || f.llllIlIlIIIIIl(lllllllllllllllIlIlIIlllIIIIIlIl.getQuantity(), lllllllllllllllIlIlIIlllIIIIIllI.bl())) {
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
        Iterator<Map.Entry<A, Set<N>>> lllllllllllllllIlIlIIllIIllIlIlI = this.Z.ah().entrySet().iterator();
        while (f.llllIlIlIIIIII(lllllllllllllllIlIlIIllIIllIlIlI.hasNext() ? 1 : 0)) {
            long lllllllllllllllIlIlIIllIIllIIlII2;
            f lllllllllllllllIlIlIIllIIllIlIll;
            Map.Entry<A, Set<N>> lllllllllllllllIlIlIIllIIllIlIIl = lllllllllllllllIlIlIIllIIllIlIlI.next();
            long lllllllllllllllIlIlIIllIIllIlIII = 0L;
            int lllllllllllllllIlIlIIllIIllIIlll = llIIIlIlIllI[0];
            int lllllllllllllllIlIlIIllIIllIIllI = llIIIlIlIllI[0];
            Object lllllllllllllllIlIlIIllIIllIIlIl = lllllllllllllllIlIlIIllIIllIlIIl.getValue().iterator();
            while (f.llllIlIlIIIIII(lllllllllllllllIlIlIIllIIllIIlIl.hasNext() ? 1 : 0)) {
                N lllllllllllllllIlIlIIllIIllIIlII2 = lllllllllllllllIlIlIIllIIllIIlIl.next();
                am lllllllllllllllIlIlIIllIIllIIIll = lllllllllllllllIlIlIIllIIllIlIll.j(lllllllllllllllIlIlIIllIIllIIlII2);
                if (!f.llllIlIIllllll(lllllllllllllllIlIlIIllIIllIIIll)) continue;
                if (f.llllIlIlIIllll(lllllllllllllllIlIlIIllIIllIIIll.aY().au())) {
                    0;
                    if (1 < 3) continue;
                    return;
                }
                lllllllllllllllIlIlIIllIIllIIlll = llIIIlIlIllI[1];
                if (f.llllIlIlIIIlll((Object)lllllllllllllllIlIlIIllIIllIIIll.aY(), (Object)au.WEEDS) && f.llllIlIlIIIlll((Object)lllllllllllllllIlIlIIllIIllIIIll.aY(), (Object)au.SCARECROW)) {
                    lllllllllllllllIlIlIIllIIllIIllI = llIIIlIlIllI[1];
                    lllllllllllllllIlIlIIllIIllIlIII = Math.max(lllllllllllllllIlIlIIllIIllIlIII, lllllllllllllllIlIlIIllIIllIIIll.ba());
                }
                0;
                if (1 <= 1) continue;
                return;
            }
            if (f.llllIlIlIIIIII(lllllllllllllllIlIlIIllIIllIIlll)) {
                lllllllllllllllIlIlIIllIIllIIlIl = B.UNKNOWN;
                lllllllllllllllIlIlIIllIIllIIlII2 = -1L;
                0;
                if (((0xCF ^ 0xB4 ^ (0x3B ^ 0x6C)) & (113 + 131 - 102 + 47 ^ 94 + 67 - 142 + 126 ^ -1)) != ((0xB5 ^ 0xA3 ^ (0x83 ^ 0xB2)) & (1 ^ 0x29 ^ (0xC ^ 3) ^ -1))) {
                    return;
                }
            } else if (f.llllIlIlIIIIII(lllllllllllllllIlIlIIllIIllIIllI)) {
                lllllllllllllllIlIlIIllIIllIIlIl = B.EMPTY;
                lllllllllllllllIlIlIIllIIllIIlII2 = -1L;
                0;
                if (1 >= (0xA1 ^ 0xA5)) {
                    return;
                }
            } else if (f.llllIlIlIIIlIl(f.llllIlIlIIlllI(lllllllllllllllIlIlIIllIIllIlIII, Instant.now().getEpochSecond()))) {
                lllllllllllllllIlIlIIllIIllIIlIl = B.COMPLETED;
                lllllllllllllllIlIlIIllIIllIIlII2 = 0L;
                0;
                if (null != null) {
                    return;
                }
            } else {
                lllllllllllllllIlIlIIllIIllIIlIl = B.IN_PROGRESS;
                lllllllllllllllIlIlIIllIIllIIlII2 = lllllllllllllllIlIlIIllIIllIlIII;
            }
            lllllllllllllllIlIlIIllIIllIlIll.ag.put(lllllllllllllllIlIlIIllIIllIlIIl.getKey(), (B)((Object)lllllllllllllllIlIlIIllIIllIIlIl));
            0;
            lllllllllllllllIlIlIIllIIllIlIll.ah.put(lllllllllllllllIlIlIIllIIllIlIIl.getKey(), lllllllllllllllIlIlIIllIIllIIlII2);
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
        Item lllllllllllllllIlIlIIlllIIIlIlll;
        H lllllllllllllllIlIlIIlllIIIllIII;
        H h2;
        f lllllllllllllllIlIlIIlllIIIllIlI;
        void lllllllllllllllIlIlIIlllIIIllIIl;
        if (f.llllIlIIllllIl((Object)n2.aL(), (Object)P.GRAPES)) {
            int[] nArray = new int[llIIIlIlIllI[0]];
            nArray[f.llIIIlIlIllI[1]] = llIIIlIlIllI[2];
            return Inventory.getFirst((int[])nArray);
        }
        if (f.llllIlIIllllIl((Object)lllllllllllllllIlIlIIlllIIIllIIl.aL(), (Object)P.FLOWER)) {
            h2 = lllllllllllllllIlIlIIlllIIIllIlI.ab.compostTypeFlowers();
            0;
            if (3 <= 0) {
                return null;
            }
        } else {
            h2 = lllllllllllllllIlIlIIlllIIIllIII = lllllllllllllllIlIlIIlllIIIllIlI.ab.compostType();
        }
        if (f.llllIlIIllllIl((Object)lllllllllllllllIlIlIIlllIIIllIlI.ab.compostTypeFlowers(), (Object)lllllllllllllllIlIlIIlllIIIllIlI.ab.compostType())) {
            lllllllllllllllIlIlIIlllIIIlIlll = Inventory.getFirst(item -> {
                int n2;
                if (f.llllIlIlIIIIII(item.getName().toLowerCase().contains(llIIIlIIIlII[llIIIlIlIllI[42]]) ? 1 : 0) && f.llllIlIlIIIIll(item.getName().toLowerCase().contains(llIIIlIIIlII[llIIIlIlIllI[43]]) ? 1 : 0)) {
                    n2 = llIIIlIlIllI[0];
                    0;
                    if (2 >= 3) {
                        return ((0x4E ^ 0x68) & ~(0xBD ^ 0x9B)) != 0;
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
            nArray[f.llIIIlIlIllI[1]] = lllllllllllllllIlIlIIlllIIIllIII.aB();
            lllllllllllllllIlIlIIlllIIIlIlll = Inventory.getFirst((int[])nArray);
        }
        if (f.llllIlIIlllllI(lllllllllllllllIlIlIIlllIIIlIlll) && (!f.llllIlIlIIIlll((Object)lllllllllllllllIlIlIIlllIIIllIlI.ab.compostTypeFlowers(), (Object)lllllllllllllllIlIlIIlllIIIllIlI.ab.compostType()) || f.llllIlIlIIIlll((Object)lllllllllllllllIlIlIIlllIIIllIIl.aL(), (Object)P.FLOWER))) {
            return Inventory.getFirst(item -> {
                int n2;
                if (f.llllIlIlIIIIII(item.getName().toLowerCase().contains(llIIIlIIIlII[llIIIlIlIllI[40]]) ? 1 : 0) && f.llllIlIlIIIIll(item.getName().toLowerCase().contains(llIIIlIIIlII[llIIIlIlIllI[41]]) ? 1 : 0)) {
                    n2 = llIIIlIlIllI[0];
                    0;
                    if ((0 ^ 4) < 0) {
                        return ((0x92 ^ 0xAF) & ~(0xA8 ^ 0x95)) != 0;
                    }
                } else {
                    n2 = llIIIlIlIllI[1];
                }
                return n2 != 0;
            });
        }
        return var3_3;
    }

    private static String llllIIlllllllI(String lllllllllllllllIlIlIIlIllIlIIIll, String lllllllllllllllIlIlIIlIllIlIIIlI) {
        try {
            SecretKeySpec lllllllllllllllIlIlIIlIllIlIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIlIllIlIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlIIlIllIlIIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlIIlIllIlIIlIl.init(llIIIlIlIllI[4], lllllllllllllllIlIlIIlIllIlIIllI);
            return new String(lllllllllllllllIlIlIIlIllIlIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIlIllIlIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlIIlIllIlIIlII) {
            lllllllllllllllIlIlIIlIllIlIIlII.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private boolean b(String string) {
        int n2;
        void lllllllllllllllIlIlIIlllIIIlIlIl;
        if (f.llllIlIlIIIIll(string.contains(llIIIlIIIlII[llIIIlIlIllI[1]]) ? 1 : 0)) {
            return llIIIlIlIllI[1];
        }
        if (!f.llllIlIlIIIIll(U.matcher((CharSequence)lllllllllllllllIlIlIIlllIIIlIlIl).matches() ? 1 : 0) || !f.llllIlIlIIIIll(V.matcher((CharSequence)lllllllllllllllIlIlIIlllIIIlIlIl).find() ? 1 : 0) || !f.llllIlIlIIIIll(W.matcher((CharSequence)lllllllllllllllIlIlIIlllIIIlIlIl).matches() ? 1 : 0) || f.llllIlIlIIIIII(X.matcher((CharSequence)lllllllllllllllIlIlIIlllIIIlIlIl).matches() ? 1 : 0)) {
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

