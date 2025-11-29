/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Provides
 *  gg.squire.api.InventorySetup
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.events.ConfigChanged
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.thieving;

import com.google.inject.Provides;
import gg.squire.api.InventorySetup;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.util.Log;
import gg.squire.thieving.SquireThievingConfig;
import gg.squire.thieving.ThievingOverlayPanel;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.A;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.B;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.C;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.D;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.E;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.F;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.G;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.H;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.I;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.J;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.K;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.c;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.d;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.e;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.f;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.i;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.j;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.k;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.l;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.m;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.n;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.o;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.q;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.r;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.t;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.u;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.v;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.w;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.x;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.y;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.z;

@PluginDescriptor(name="Squire Thiever", enabledByDefault=false)
public class SquireThieving
extends SquirePlugin {
    private /* synthetic */ boolean j;
    private /* synthetic */ List<Item> i;
    private static /* synthetic */ int[] lIIllIlllIIlI;
    private /* synthetic */ boolean l;
    @Inject
    private /* synthetic */ ThievingOverlayPanel d;
    @Inject
    private /* synthetic */ SquireThievingConfig e;
    private static /* synthetic */ String[] lIIllIlllIIIl;
    @Inject
    private /* synthetic */ OverlayManager c;
    private static final /* synthetic */ Logger a;
    private /* synthetic */ InventorySetup h;
    private /* synthetic */ int f;
    private /* synthetic */ WorldPoint g;
    private /* synthetic */ boolean k;
    private final /* synthetic */ List<Integer> b;

    protected void onStart() {
        this.a(lIIllIlllIIlI[38]);
        Player player = Players.getLocal();
        if (SquireThieving.lIllIIIllIlIlII(player)) {
            this.a(player.getWorldLocation());
        }
        this.c.add((Overlay)this.d);
        0;
        this.a(new InventorySetup());
        this.a();
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(Player player, boolean bl) {
        TileObject var24;
        void var18;
        SquireThieving var22;
        c var2;
        c c2;
        if (SquireThieving.lIllIIIllIlIlII((Object)s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.c.b(player.getWorldLocation()))) {
            c2 = s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.c.b(player.getWorldLocation());
            0;
            if (((93 + 60 - 83 + 65 ^ 13 + 14 - 25 + 143) & (0x52 ^ 0x25 ^ (0x42 ^ 0x23) ^ -1)) == 3) {
                return ((102 + 119 - 126 + 35 ^ 57 + 41 - -35 + 13) & (0xC7 ^ 0x93 ^ (0x2F ^ 0x6B) ^ -1)) != 0;
            }
        } else {
            c2 = var2 = var22.b().t();
        }
        if (SquireThieving.lIllIIIllIllIlI((int)var18) && SquireThieving.lIllIIIllIllIlI(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        if (SquireThieving.lIllIIIllIlIlII(var24 = var22.a(var2))) {
            String string;
            String[] stringArray = new String[lIIllIlllIIlI[3]];
            if (SquireThieving.lIllIIIllIlIllI((int)var18)) {
                string = lIIllIlllIIIl[lIIllIlllIIlI[1]];
                0;
                if (1 <= -1) {
                    return ((0xBE ^ 0x81 ^ (0x4F ^ 0x37)) & (0xE1 ^ 0xA7 ^ 1 ^ -1)) != 0;
                }
            } else {
                string = stringArray[SquireThieving.lIIllIlllIIlI[1]] = lIIllIlllIIIl[lIIllIlllIIlI[3]];
            }
            if (SquireThieving.lIllIIIllIlIllI(var24.hasAction(stringArray) ? 1 : 0)) {
                String string2;
                String string3;
                String string4;
                String[] stringArray2 = new String[lIIllIlllIIlI[3]];
                if (SquireThieving.lIllIIIllIlIllI((int)var18)) {
                    string4 = lIIllIlllIIIl[lIIllIlllIIlI[5]];
                    0;
                    if (1 > (0x3A ^ 0x56 ^ (0xF8 ^ 0x90))) {
                        return ((0x3E ^ 0xD ^ (0xA6 ^ 0xB9)) & (0x47 ^ 0x1B ^ (2 ^ 0x72) ^ -1)) != 0;
                    }
                } else {
                    string4 = stringArray2[SquireThieving.lIIllIlllIIlI[1]] = lIIllIlllIIIl[lIIllIlllIIlI[7]];
                }
                if (SquireThieving.lIllIIIllIllIlI(var24.hasAction(stringArray2) ? 1 : 0)) {
                    Object[] objectArray = new Object[lIIllIlllIIlI[3]];
                    objectArray[SquireThieving.lIIllIlllIIlI[1]] = (boolean)var18;
                    Log.info((String)lIIllIlllIIIl[lIIllIlllIIlI[9]], (Object[])objectArray);
                    return lIIllIlllIIlI[1];
                }
                String string5 = lIIllIlllIIIl[lIIllIlllIIlI[11]];
                Object[] objectArray = new Object[lIIllIlllIIlI[5]];
                int n2 = lIIllIlllIIlI[1];
                if (SquireThieving.lIllIIIllIlIllI((int)var18)) {
                    string3 = lIIllIlllIIIl[lIIllIlllIIlI[13]];
                    0;
                    if ((83 + 35 - 26 + 47 ^ 86 + 39 - 104 + 122) <= -1) {
                        return ((0xC3 ^ 0xA6 ^ (0xC2 ^ 0xAC)) & (0x72 ^ 0x3B ^ (0x18 ^ 0x5A) ^ -1)) != 0;
                    }
                } else {
                    string3 = lIIllIlllIIIl[lIIllIlllIIlI[15]];
                }
                objectArray[n2] = string3;
                objectArray[SquireThieving.lIIllIlllIIlI[3]] = var24.getId();
                Log.info((String)string5, (Object[])objectArray);
                if (SquireThieving.lIllIIIllIlIllI((int)var18)) {
                    string2 = lIIllIlllIIIl[lIIllIlllIIlI[17]];
                    0;
                    if (-2 > 0) {
                        return (2 & ~2) != 0;
                    }
                } else {
                    string2 = lIIllIlllIIIl[lIIllIlllIIlI[19]];
                }
                var24.interact(string2);
                return lIIllIlllIIlI[3];
            }
        }
        return lIIllIlllIIlI[1];
    }

    public boolean j() {
        return this.k;
    }

    private static boolean lIllIIIllIlIllI(int n2) {
        return n2 != 0;
    }

    @Subscribe
    public void a(ConfigChanged configChanged) {
        this.a(new InventorySetup());
        this.a();
    }

    public InventorySetup g() {
        return this.h;
    }

    private static boolean lIllIIIllIllIll(Object object) {
        return object == null;
    }

    static {
        SquireThieving.lIllIIIllIlIIll();
        SquireThieving.lIllIIIllIlIIlI();
        a = LoggerFactory.getLogger(SquireThieving.class);
    }

    public boolean k() {
        return this.l;
    }

    public TileObject a(c c2) {
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> tileObject.getWorldLocation().equals((Object)c2.s()));
        if (SquireThieving.lIllIIIllIllIll(tileObject2)) {
            Log.info((String)lIIllIlllIIIl[lIIllIlllIIlI[0]]);
            return null;
        }
        return tileObject2;
    }

    /*
     * WARNING - void declaration
     */
    public d c() {
        void var16;
        int n2 = Skills.getLevel((Skill)Skill.THIEVING);
        if (SquireThieving.lIllIIIllIllIIl(n2, s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.d.MENAPHITE.u())) {
            return s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.d.MENAPHITE;
        }
        if (SquireThieving.lIllIIIllIllIIl((int)var16, s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.d.BANDIT_56.u())) {
            return s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.d.BANDIT_56;
        }
        return s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.d.BANDIT_41;
    }

    private static void lIllIIIllIlIIll() {
        lIIllIlllIIlI = new int[43];
        SquireThieving.lIIllIlllIIlI[0] = 0x64 ^ 0x70 ^ (0xA8 ^ 0xB6);
        SquireThieving.lIIllIlllIIlI[1] = (0x6A ^ 0x38) & ~(0x5E ^ 0xC);
        SquireThieving.lIIllIlllIIlI[2] = -(0xFFFFCB8F & 0x3C79) & (0xFFFFBBFF & 0x7DFF);
        SquireThieving.lIIllIlllIIlI[3] = 1;
        SquireThieving.lIIllIlllIIlI[4] = 0xFFFFEA97 & 0x7FF9;
        SquireThieving.lIIllIlllIIlI[5] = 2;
        SquireThieving.lIIllIlllIIlI[6] = 0xFFFFFEAD & 0x37F;
        SquireThieving.lIIllIlllIIlI[7] = 3;
        SquireThieving.lIIllIlllIIlI[8] = 0xFFFFE2AA & 0x1F7F;
        SquireThieving.lIIllIlllIIlI[9] = 6 + 93 - 81 + 153 ^ 109 + 135 - 148 + 79;
        SquireThieving.lIIllIlllIIlI[10] = 0xFFFFD77D & 0x2AB6;
        SquireThieving.lIIllIlllIIlI[11] = 0x63 ^ 0x34 ^ (0x47 ^ 0x15);
        SquireThieving.lIIllIlllIIlI[12] = -(0xFFFFC691 & 0x7DEF) & (0xFFFFDFFA & 0x76DF);
        SquireThieving.lIIllIlllIIlI[13] = 3 ^ 0x43 ^ (0x2E ^ 0x68);
        SquireThieving.lIIllIlllIIlI[14] = 0xFFFF97DB & 0x7A7F;
        SquireThieving.lIIllIlllIIlI[15] = 0x27 ^ 0x20;
        SquireThieving.lIIllIlllIIlI[16] = 0xFFFF93DE & 0x7E79;
        SquireThieving.lIIllIlllIIlI[17] = 0x3D ^ 0x56 ^ (0xA0 ^ 0xC3);
        SquireThieving.lIIllIlllIIlI[18] = 0xFFFF9ED7 & 0x737E;
        SquireThieving.lIIllIlllIIlI[19] = 0x7F ^ 0x42 ^ (0x18 ^ 0x2C);
        SquireThieving.lIIllIlllIIlI[20] = -(0xFFFFECF7 & 0x17AD) & (0xFFFFFEFD & 0x17FF);
        SquireThieving.lIIllIlllIIlI[21] = 0x7B ^ 0x31 ^ (0xC1 ^ 0x90);
        SquireThieving.lIIllIlllIIlI[22] = 0x18 ^ 0x37 ^ (0x9D ^ 0xB9);
        SquireThieving.lIIllIlllIIlI[23] = 0xF3 ^ 0xBF ^ (0xC9 ^ 0x89);
        SquireThieving.lIIllIlllIIlI[24] = 0x77 ^ 0x7A;
        SquireThieving.lIIllIlllIIlI[25] = 0x1F ^ 0x11;
        SquireThieving.lIIllIlllIIlI[26] = 163 + 45 - 135 + 93 ^ 151 + 117 - 165 + 66;
        SquireThieving.lIIllIlllIIlI[27] = 49 + 58 - -43 + 4 ^ 45 + 14 - 34 + 113;
        SquireThieving.lIIllIlllIIlI[28] = 0xB ^ 0x63 ^ (0x27 ^ 0x5E);
        SquireThieving.lIIllIlllIIlI[29] = 0x40 ^ 0x52;
        SquireThieving.lIIllIlllIIlI[30] = 0x8D ^ 0x9E;
        SquireThieving.lIIllIlllIIlI[31] = 104 + 5 - 45 + 147 ^ 133 + 17 - 27 + 76;
        SquireThieving.lIIllIlllIIlI[32] = 0x38 ^ 0x2D;
        SquireThieving.lIIllIlllIIlI[33] = 0x9A ^ 0xB0 ^ (0x68 ^ 0x54);
        SquireThieving.lIIllIlllIIlI[34] = 0x9D ^ 0x8A;
        SquireThieving.lIIllIlllIIlI[35] = 7 ^ 0x1F;
        SquireThieving.lIIllIlllIIlI[36] = 21 + 85 - 46 + 79 ^ 49 + 60 - 92 + 129;
        SquireThieving.lIIllIlllIIlI[37] = 0xA0 ^ 0xBA;
        SquireThieving.lIIllIlllIIlI[38] = -1;
        SquireThieving.lIIllIlllIIlI[39] = -(0xFFFFF05F & 0x6FAB) & (0xFFFFF7BF & 0x7DFF);
        SquireThieving.lIIllIlllIIlI[40] = 0xFFFFFDBB & 0x17F5;
        SquireThieving.lIIllIlllIIlI[41] = 0xFFFFDFBF & 0x35F3;
        SquireThieving.lIIllIlllIIlI[42] = 0xFFFFDAB7 & 0x77DF;
    }

    protected void onStop() {
        this.c.remove((Overlay)this.d);
        0;
        this.a((InventorySetup)null);
        this.a((List<Item>)null);
    }

    private static boolean lIllIIIllIllIIl(int n2, int n3) {
        return n2 >= n3;
    }

    public SquireThieving() {
        Integer[] integerArray = new Integer[lIIllIlllIIlI[0]];
        integerArray[SquireThieving.lIIllIlllIIlI[1]] = lIIllIlllIIlI[2];
        integerArray[SquireThieving.lIIllIlllIIlI[3]] = lIIllIlllIIlI[4];
        integerArray[SquireThieving.lIIllIlllIIlI[5]] = lIIllIlllIIlI[6];
        integerArray[SquireThieving.lIIllIlllIIlI[7]] = lIIllIlllIIlI[8];
        integerArray[SquireThieving.lIIllIlllIIlI[9]] = lIIllIlllIIlI[10];
        integerArray[SquireThieving.lIIllIlllIIlI[11]] = lIIllIlllIIlI[12];
        integerArray[SquireThieving.lIIllIlllIIlI[13]] = lIIllIlllIIlI[14];
        integerArray[SquireThieving.lIIllIlllIIlI[15]] = lIIllIlllIIlI[16];
        integerArray[SquireThieving.lIIllIlllIIlI[17]] = lIIllIlllIIlI[18];
        integerArray[SquireThieving.lIIllIlllIIlI[19]] = lIIllIlllIIlI[20];
        this.b = Stream.of(integerArray).collect(Collectors.toList());
        this.f = lIIllIlllIIlI[1];
        this.l = lIIllIlllIIlI[1];
    }

    private static String lIllIIIllIIllll(String var19, String var25) {
        try {
            SecretKeySpec var14 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var25.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var23 = Cipher.getInstance("Blowfish");
            var23.init(lIIllIlllIIlI[5], var14);
            return new String(var23.doFinal(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    public void a(boolean bl) {
        this.j = bl;
    }

    public void b(boolean bl) {
        this.k = bl;
    }

    public void a(List<Item> list) {
        this.i = list;
    }

    public WorldPoint f() {
        return this.g;
    }

    public void a(int n2) {
        this.f = n2;
    }

    public List<Item> h() {
        return this.i;
    }

    public void a(WorldPoint worldPoint) {
        this.g = worldPoint;
    }

    private static boolean lIllIIIllIlllII(int n2, int n3) {
        return n2 < n3;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIIllIlllIIlI[21]];
        classArray[SquireThieving.lIIllIlllIIlI[1]] = F.class;
        classArray[SquireThieving.lIIllIlllIIlI[3]] = C.class;
        classArray[SquireThieving.lIIllIlllIIlI[5]] = D.class;
        classArray[SquireThieving.lIIllIlllIIlI[7]] = H.class;
        classArray[SquireThieving.lIIllIlllIIlI[9]] = G.class;
        classArray[SquireThieving.lIIllIlllIIlI[11]] = x.class;
        classArray[SquireThieving.lIIllIlllIIlI[13]] = y.class;
        classArray[SquireThieving.lIIllIlllIIlI[15]] = z.class;
        classArray[SquireThieving.lIIllIlllIIlI[17]] = B.class;
        classArray[SquireThieving.lIIllIlllIIlI[19]] = E.class;
        classArray[SquireThieving.lIIllIlllIIlI[0]] = A.class;
        classArray[SquireThieving.lIIllIlllIIlI[22]] = k.class;
        classArray[SquireThieving.lIIllIlllIIlI[23]] = o.class;
        classArray[SquireThieving.lIIllIlllIIlI[24]] = r.class;
        classArray[SquireThieving.lIIllIlllIIlI[25]] = l.class;
        classArray[SquireThieving.lIIllIlllIIlI[26]] = n.class;
        classArray[SquireThieving.lIIllIlllIIlI[27]] = m.class;
        classArray[SquireThieving.lIIllIlllIIlI[28]] = q.class;
        classArray[SquireThieving.lIIllIlllIIlI[29]] = t.class;
        classArray[SquireThieving.lIIllIlllIIlI[30]] = v.class;
        classArray[SquireThieving.lIIllIlllIIlI[31]] = w.class;
        classArray[SquireThieving.lIIllIlllIIlI[32]] = u.class;
        classArray[SquireThieving.lIIllIlllIIlI[33]] = i.class;
        classArray[SquireThieving.lIIllIlllIIlI[34]] = j.class;
        classArray[SquireThieving.lIIllIlllIIlI[35]] = K.class;
        classArray[SquireThieving.lIIllIlllIIlI[36]] = J.class;
        classArray[SquireThieving.lIIllIlllIIlI[37]] = I.class;
        return classArray;
    }

    private static String lIllIIIllIlIIII(String var21, String var13) {
        try {
            SecretKeySpec var20 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var13.getBytes(StandardCharsets.UTF_8)), lIIllIlllIIlI[17]), "DES");
            Cipher var7 = Cipher.getInstance("DES");
            var7.init(lIIllIlllIIlI[5], var20);
            return new String(var7.doFinal(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    public List<Integer> d() {
        return this.b;
    }

    private static boolean lIllIIIllIlIlII(Object object) {
        return object != null;
    }

    private static void lIllIIIllIlIIlI() {
        lIIllIlllIIIl = new String[lIIllIlllIIlI[28]];
        SquireThieving.lIIllIlllIIIl[SquireThieving.lIIllIlllIIlI[1]] = SquireThieving."Open";
        SquireThieving.lIIllIlllIIIl[SquireThieving.lIIllIlllIIlI[3]] = SquireThieving."Close";
        SquireThieving.lIIllIlllIIIl[SquireThieving.lIIllIlllIIlI[5]] = SquireThieving."Open";
        SquireThieving.lIIllIlllIIIl[SquireThieving.lIIllIlllIIlI[7]] = SquireThieving."Close";
        SquireThieving.lIIllIlllIIIl[SquireThieving.lIIllIlllIIlI[9]] = SquireThieving."Curtain didn't have the right action. open: {}";
        SquireThieving.lIIllIlllIIIl[SquireThieving.lIIllIlllIIlI[11]] = SquireThieving."{} the curtain! Curtain: {}";
        SquireThieving.lIIllIlllIIIl[SquireThieving.lIIllIlllIIlI[13]] = SquireThieving."Opening";
        SquireThieving.lIIllIlllIIIl[SquireThieving.lIIllIlllIIlI[15]] = SquireThieving."Closing";
        SquireThieving.lIIllIlllIIIl[SquireThieving.lIIllIlllIIlI[17]] = SquireThieving."Open";
        SquireThieving.lIIllIlllIIIl[SquireThieving.lIIllIlllIIlI[19]] = SquireThieving."Close";
        SquireThieving.lIIllIlllIIIl[SquireThieving.lIIllIlllIIlI[0]] = SquireThieving."Couldn't find our curtains [default]";
        SquireThieving.lIIllIlllIIIl[SquireThieving.lIIllIlllIIlI[22]] = SquireThieving."Getting correct curtain for house: {}, openable: {}";
        SquireThieving.lIIllIlllIIIl[SquireThieving.lIIllIlllIIlI[23]] = SquireThieving."Couldn't find our curtains [overloaded]";
        SquireThieving.lIIllIlllIIIl[SquireThieving.lIIllIlllIIlI[24]] = SquireThieving."Open";
        SquireThieving.lIIllIlllIIIl[SquireThieving.lIIllIlllIIlI[25]] = SquireThieving."Close";
        SquireThieving.lIIllIlllIIIl[SquireThieving.lIIllIlllIIlI[26]] = SquireThieving."seed box";
        SquireThieving.lIIllIlllIIIl[SquireThieving.lIIllIlllIIlI[27]] = SquireThieving."gem bag";
    }

    public void a(InventorySetup inventorySetup) {
        this.h = inventorySetup;
    }

    public void c(boolean bl) {
        this.l = bl;
    }

    private static boolean lIllIIIllIlIlll(Object object, Object object2) {
        return object != object2;
    }

    private static String lIllIIIllIlIIIl(String var11, String var5) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var8 = var5.toCharArray();
        int var1 = lIIllIlllIIlI[1];
        char[] var9 = var11.toCharArray();
        int var27 = var9.length;
        int var3 = lIIllIlllIIlI[1];
        while (SquireThieving.lIllIIIllIlllII(var3, var27)) {
            char var12 = var9[var3];
            var10.append((char)(var12 ^ var8[var1 % var8.length]));
            0;
            ++var1;
            ++var3;
            0;
            if ((0x38 ^ 0x4D ^ (0xE2 ^ 0x92)) > 0) continue;
            return null;
        }
        return String.valueOf(var10);
    }

    private static boolean lIllIIIllIllIlI(int n2) {
        return n2 == 0;
    }

    @Provides
    SquireThievingConfig a(ConfigManager configManager) {
        return (SquireThievingConfig)configManager.getConfig(SquireThievingConfig.class);
    }

    private static boolean lIllIIIllIlIlIl(Object object, Object object2) {
        return object == object2;
    }

    public int e() {
        return this.f;
    }

    public boolean i() {
        return this.j;
    }

    private void a() {
        SquireThieving var6;
        if (SquireThieving.lIllIIIllIlIlIl((Object)this.e.pickpocketTarget(), (Object)s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.f.VYRE)) {
            this.h.add(lIIllIlllIIlI[39]);
            0;
            this.h.add(lIIllIlllIIlI[40]);
            0;
            this.h.add(lIIllIlllIIlI[41]);
            0;
        }
        if (SquireThieving.lIllIIIllIlIllI(var6.e.gemBag() ? 1 : 0)) {
            var6.h.add(item -> item.getName().toLowerCase().contains(lIIllIlllIIIl[lIIllIlllIIlI[27]]));
            0;
        }
        if (SquireThieving.lIllIIIllIlIllI(var6.e.shadowVeil() ? 1 : 0)) {
            Iterator<Integer> var17 = var6.b.iterator();
            while (SquireThieving.lIllIIIllIlIllI(var17.hasNext() ? 1 : 0)) {
                int var4 = var17.next();
                int[] nArray = new int[lIIllIlllIIlI[3]];
                nArray[SquireThieving.lIIllIlllIIlI[1]] = var4;
                if (SquireThieving.lIllIIIllIlIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    var6.h.add(var4);
                    0;
                }
                0;
                if (((0x55 ^ 0x2F ^ (0x16 ^ 0x56)) & (0x7E ^ 0x2A ^ (0xF0 ^ 0x9E) ^ -1)) != (20 + 80 - -14 + 31 ^ 13 + 10 - -14 + 112)) continue;
                return;
            }
        }
        if (SquireThieving.lIllIIIllIlIlll((Object)var6.e.pickpocketFood(), (Object)s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.e.NONE) && SquireThieving.lIllIIIllIllIII(var6.e.pickpocketFoodAmount())) {
            var6.h.add(var6.e.pickpocketFood().x(), var6.e.pickpocketFoodAmount());
            0;
        }
        if (SquireThieving.lIllIIIllIlIllI(var6.e.dodgyNecklace() ? 1 : 0) && SquireThieving.lIllIIIllIllIII(var6.e.dodgyNecklaceAmount())) {
            var6.h.add(lIIllIlllIIlI[42], var6.e.dodgyNecklaceAmount());
            0;
        }
        if (SquireThieving.lIllIIIllIlIllI(var6.e.useSeedBox() ? 1 : 0)) {
            var6.h.add(item -> item.getName().toLowerCase().contains(lIIllIlllIIIl[lIIllIlllIIlI[26]]));
            0;
        }
    }

    public TileObject a(c c2, boolean bl) {
        Object[] objectArray = new Object[lIIllIlllIIlI[5]];
        objectArray[SquireThieving.lIIllIlllIIlI[1]] = c2;
        objectArray[SquireThieving.lIIllIlllIIlI[3]] = bl;
        Log.info((String)lIIllIlllIIIl[lIIllIlllIIlI[22]], (Object[])objectArray);
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (SquireThieving.lIllIIIllIlIllI(tileObject.getWorldLocation().equals((Object)c2.s()) ? 1 : 0)) {
                String string;
                String[] stringArray = new String[lIIllIlllIIlI[3]];
                if (SquireThieving.lIllIIIllIlIllI(bl ? 1 : 0)) {
                    string = lIIllIlllIIIl[lIIllIlllIIlI[24]];
                    0;
                    if (-1 >= (0x7C ^ 0x7B ^ 3)) {
                        return false;
                    }
                } else {
                    string = stringArray[SquireThieving.lIIllIlllIIlI[1]] = lIIllIlllIIIl[lIIllIlllIIlI[25]];
                }
                if (SquireThieving.lIllIIIllIlIllI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIIllIlllIIlI[3];
                    0;
                    if (2 > 0) return n2 != 0;
                    return ((0x46 ^ 5 ^ (0xD4 ^ 0x9D)) & (0xD0 ^ 0x88 ^ (0x68 ^ 0x3A) ^ -1)) != 0;
                }
            }
            n2 = lIIllIlllIIlI[1];
            return n2 != 0;
        });
        if (SquireThieving.lIllIIIllIllIll(tileObject2)) {
            Log.info((String)lIIllIlllIIIl[lIIllIlllIIlI[23]]);
            return null;
        }
        return tileObject2;
    }

    private static boolean lIllIIIllIllIII(int n2) {
        return n2 > 0;
    }

    public d b() {
        if (SquireThieving.lIllIIIllIlIlIl((Object)this.e.blackJackTarget(), (Object)s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.d.HIGHEST_LEVEL)) {
            return this.c();
        }
        return this.e.blackJackTarget();
    }
}

