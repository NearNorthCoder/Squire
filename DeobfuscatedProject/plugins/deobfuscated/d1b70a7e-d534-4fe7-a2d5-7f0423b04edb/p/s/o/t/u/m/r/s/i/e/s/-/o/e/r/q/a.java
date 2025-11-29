/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  net.runelite.api.Actor
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.SceneEntity
 *  net.unethicalite.api.commons.StopWatch
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 */
package p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.tempoross.SquireTempoross;
import gg.squire.tempoross.SquireTemporossConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.SceneEntity;
import net.unethicalite.api.commons.StopWatch;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.c;

@Singleton
public class a {
    private final /* synthetic */ SquireTemporossConfig f;
    private /* synthetic */ int h;
    private /* synthetic */ boolean p;
    private /* synthetic */ c s;
    private /* synthetic */ boolean q;
    private /* synthetic */ boolean r;
    private /* synthetic */ int i;
    private /* synthetic */ int l;
    private /* synthetic */ int j;
    private static /* synthetic */ int[] lIIllIllllIII;
    private final /* synthetic */ SquireTempoross e;
    private /* synthetic */ StopWatch g;
    private /* synthetic */ int k;
    private /* synthetic */ int m;
    private /* synthetic */ boolean o;
    private static /* synthetic */ String[] lIIllIlllIllI;
    private /* synthetic */ boolean n;

    public void a(boolean bl) {
        this.n = bl;
    }

    public int F() {
        return this.k;
    }

    public boolean r() {
        boolean bl;
        int[] nArray = new int[lIIllIllllIII[1]];
        nArray[a.lIIllIllllIII[0]] = lIIllIllllIII[8];
        if (!a.lIllIIIlllIIlll(Inventory.contains((int[])nArray) ? 1 : 0) || a.lIllIIIlllIIllI(this.s() ? 1 : 0)) {
            bl = lIIllIllllIII[1];
            0;
            if (null != null) {
                return (2 & (2 ^ -1)) != 0;
            }
        } else {
            bl = lIIllIllllIII[0];
        }
        return bl;
    }

    public boolean M() {
        return this.r;
    }

    public int H() {
        return this.m;
    }

    public c N() {
        return this.s;
    }

    @Inject
    public a(SquireTempoross squireTempoross, SquireTemporossConfig squireTemporossConfig) {
        this.h = lIIllIllllIII[0];
        this.i = lIIllIllllIII[0];
        this.j = lIIllIllllIII[1];
        this.k = lIIllIllllIII[2];
        this.l = lIIllIllllIII[3];
        this.m = lIIllIllllIII[4];
        this.n = lIIllIllllIII[0];
        this.o = lIIllIllllIII[0];
        this.p = lIIllIllllIII[0];
        this.q = lIIllIllllIII[0];
        this.r = lIIllIllllIII[0];
        this.e = squireTempoross;
        this.f = squireTemporossConfig;
    }

    public void u() {
        this.j += lIIllIllllIII[1];
        if (a.lIllIIIlllIIllI(this.f.solo() ? 1 : 0)) {
            this.n = lIIllIllllIII[1];
        }
    }

    public void a(c c2) {
        this.s = c2;
    }

    private static String lIllIIIllIlIlll(String llllllllllllllIlllIllIlIllllIIIl, String llllllllllllllIlllIllIlIllllIIII) {
        try {
            SecretKeySpec llllllllllllllIlllIllIlIllllIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIlIllllIIII.getBytes(StandardCharsets.UTF_8)), lIIllIllllIII[18]), "DES");
            Cipher llllllllllllllIlllIllIlIllllIIll = Cipher.getInstance("DES");
            llllllllllllllIlllIllIlIllllIIll.init(lIIllIllllIII[9], llllllllllllllIlllIllIlIllllIlII);
            return new String(llllllllllllllIlllIllIlIllllIIll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIlIllllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIllIlIllllIIlI) {
            llllllllllllllIlllIllIlIllllIIlI.printStackTrace();
            return null;
        }
    }

    public boolean c(NPC nPC) {
        if (a.lIllIIIlllIIllI(this.e.a((Locatable)nPC) ? 1 : 0)) {
            return this.e.b((SceneEntity)nPC);
        }
        return this.e.b((Locatable)nPC);
    }

    private static void lIllIIIlllIIIll() {
        lIIllIllllIII = new int[33];
        a.lIIllIllllIII[0] = (85 + 153 - 159 + 105 ^ 34 + 23 - -11 + 62) & (0x4A ^ 7 ^ (0x56 ^ 0x21) ^ -1);
        a.lIIllIllllIII[1] = 1;
        a.lIIllIllllIII[2] = 0x44 ^ 0x33 ^ (0xFC ^ 0xA3);
        a.lIIllIllllIII[3] = 0x81 ^ 0x8E;
        a.lIIllIllllIII[4] = 0x94 ^ 0x8D;
        a.lIIllIllllIII[5] = 0xFFFFABF5 & 0x574A;
        a.lIIllIllllIII[6] = 0xFFFFF77F & 0xFB5;
        a.lIIllIllllIII[7] = 0xFFFFF7BF & 0xF74;
        a.lIIllIllllIII[8] = -(0xFFFFD46D & 0x2F97) & (0xFFFF87FE & 0x7FBF);
        a.lIIllIllllIII[9] = 2;
        a.lIIllIllllIII[10] = 3;
        a.lIIllIllllIII[11] = 0xFFFFF92B & 0xFFF;
        a.lIIllIllllIII[12] = 0xFFFFEFED & 0x743E;
        a.lIIllIllllIII[13] = 0x17 ^ 0x45 ^ (0x1C ^ 0x4A);
        a.lIIllIllllIII[14] = 0xB ^ 0xE;
        a.lIIllIllllIII[15] = 0x1D ^ 0x1B;
        a.lIIllIllllIII[16] = 0x6A ^ 0x5F ^ (0x77 ^ 0x52);
        a.lIIllIllllIII[17] = 0 ^ 0x42 ^ (0x4C ^ 9);
        a.lIIllIllllIII[18] = 93 + 14 - 37 + 71 ^ 83 + 89 - 155 + 116;
        a.lIIllIllllIII[19] = 0x79 ^ 0x5F ^ (0x3B ^ 0x14);
        a.lIIllIllllIII[20] = 0x5F ^ 0x27 ^ (0x6D ^ 0x1F);
        a.lIIllIllllIII[21] = 0x32 ^ 0x39;
        a.lIIllIllllIII[22] = 0xA3 ^ 0xAF;
        a.lIIllIllllIII[23] = 140 + 175 - 283 + 149 ^ 55 + 2 - 49 + 176;
        a.lIIllIllllIII[24] = 0x53 ^ 0x5D;
        a.lIIllIllllIII[25] = 0x9F ^ 0x90 ^ (0x72 ^ 0x6C);
        a.lIIllIllllIII[26] = 0x1A ^ 8;
        a.lIIllIllllIII[27] = 0x86 ^ 0x95;
        a.lIIllIllllIII[28] = 0x7B ^ 0x2F ^ (0x39 ^ 0x79);
        a.lIIllIllllIII[29] = 105 + 147 - 217 + 115 ^ 49 + 118 - 59 + 23;
        a.lIIllIllllIII[30] = 0x13 ^ 5;
        a.lIIllIllllIII[31] = 0x21 ^ 0x76 ^ (0x61 ^ 0x21);
        a.lIIllIllllIII[32] = 0xBE ^ 0xA6;
    }

    public void c(int n2) {
        this.j = n2;
    }

    public SquireTempoross z() {
        return this.e;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void llllllllllllllIlllIllIllIIlIIlll;
        ChatMessageType chatMessageType = chatMessage.getType();
        String string = chatMessage.getMessage();
        if (a.lIllIIIlllIlIIl(chatMessageType, ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        if (a.lIllIIIlllIIllI(llllllllllllllIlllIllIllIIlIIlll.contains(lIIllIlllIllI[lIIllIllllIII[13]]) ? 1 : 0)) {
            llllllllllllllIlllIllIllIIlIlIlI.r = lIIllIllllIII[1];
            llllllllllllllIlllIllIllIIlIlIlI.i += lIIllIllllIII[1];
            llllllllllllllIlllIllIllIIlIlIlI.s = null;
            System.out.println(lIIllIlllIllI[lIIllIllllIII[14]]);
        }
        if (a.lIllIIIlllIIllI(llllllllllllllIlllIllIllIIlIIlll.contains(lIIllIlllIllI[lIIllIllllIII[15]]) ? 1 : 0)) {
            String llllllllllllllIlllIllIllIIlIIllI = llllllllllllllIlllIllIllIIlIIlll.substring(lIIllIllllIII[16], llllllllllllllIlllIllIllIIlIIlll.indexOf(lIIllIlllIllI[lIIllIllllIII[17]]));
            String llllllllllllllIlllIllIllIIlIIlIl = llllllllllllllIlllIllIllIIlIIllI.replace(lIIllIlllIllI[lIIllIllllIII[18]], lIIllIlllIllI[lIIllIllllIII[19]]).replace(lIIllIlllIllI[lIIllIllllIII[20]], lIIllIlllIllI[lIIllIllllIII[21]]);
            int llllllllllllllIlllIllIllIIlIIlII = Integer.parseInt(llllllllllllllIlllIllIllIIlIIlIl);
            llllllllllllllIlllIllIllIIlIlIlI.h += llllllllllllllIlllIllIllIIlIIlII;
        }
        if (a.lIllIIIlllIIllI(llllllllllllllIlllIllIllIIlIIlll.toLowerCase().contains(lIIllIlllIllI[lIIllIllllIII[22]]) ? 1 : 0)) {
            llllllllllllllIlllIllIllIIlIlIlI.p = lIIllIllllIII[1];
        }
        if (!a.lIllIIIlllIIlll(llllllllllllllIlllIllIllIIlIIlll.contains(lIIllIlllIllI[lIIllIllllIII[23]]) ? 1 : 0) || a.lIllIIIlllIIllI(llllllllllllllIlllIllIllIIlIIlll.contains(lIIllIlllIllI[lIIllIllllIII[24]]) ? 1 : 0)) {
            llllllllllllllIlllIllIllIIlIlIlI.p = lIIllIllllIII[0];
        }
        if (a.lIllIIIlllIIllI(llllllllllllllIlllIllIllIIlIIlll.contains(lIIllIlllIllI[lIIllIllllIII[3]]) ? 1 : 0)) {
            llllllllllllllIlllIllIllIIlIlIlI.q = lIIllIllllIII[1];
        }
    }

    public boolean a(NPC nPC, String string) {
        if (a.lIllIIIlllIIllI(this.e.a((Locatable)nPC) ? 1 : 0)) {
            return this.e.b((SceneEntity)nPC);
        }
        nPC.interact(string);
        return lIIllIllllIII[1];
    }

    public boolean k() {
        int n2;
        int n3 = Players.getLocal().getGraphic();
        int n4 = Players.getLocal().getAnimation();
        if (a.lIllIIIlllIIlII(n4, lIIllIllllIII[5]) && (!a.lIllIIIlllIIlII(n3, lIIllIllllIII[6]) || a.lIllIIIlllIIlIl(n3, lIIllIllllIII[7]))) {
            n2 = lIIllIllllIII[1];
            0;
            if (1 < 0) {
                return ((192 + 114 - 102 + 50 ^ 163 + 149 - 144 + 4) & (0x2A ^ 0x72 ^ (0x6D ^ 0x67) ^ -1)) != 0;
            }
        } else {
            n2 = lIIllIllllIII[0];
        }
        return n2 != 0;
    }

    public void a(StopWatch stopWatch) {
        this.g = stopWatch;
    }

    public void y() {
        this.h = lIIllIllllIII[0];
        this.i = lIIllIllllIII[0];
    }

    public boolean f(WorldPoint worldPoint) {
        if (a.lIllIIIlllIIllI(this.e.a(worldPoint) ? 1 : 0)) {
            return this.e.e(worldPoint);
        }
        return this.e.b(worldPoint);
    }

    public void d(boolean bl) {
        this.q = bl;
    }

    public TileObject x() {
        return TileObjects.getNearest(tileObject -> {
            String[] stringArray = new String[lIIllIllllIII[1]];
            stringArray[a.lIIllIllllIII[0]] = lIIllIlllIllI[lIIllIllllIII[16]];
            return tileObject.hasAction(stringArray);
        });
    }

    public void b(int n2) {
        this.i = n2;
    }

    public void d(int n2) {
        this.k = n2;
    }

    private static boolean lIllIIIlllIIlIl(int n2, int n3) {
        return n2 == n3;
    }

    public void a(int n2) {
        this.h = n2;
    }

    private static String lIllIIIllIlIllI(String llllllllllllllIlllIllIllIIIIIllI, String llllllllllllllIlllIllIllIIIIIlIl) {
        llllllllllllllIlllIllIllIIIIIllI = new String(Base64.getDecoder().decode(llllllllllllllIlllIllIllIIIIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIllIllIIIIIlII = new StringBuilder();
        char[] llllllllllllllIlllIllIllIIIIIIll = llllllllllllllIlllIllIllIIIIIlIl.toCharArray();
        int llllllllllllllIlllIllIllIIIIIIlI = lIIllIllllIII[0];
        char[] llllllllllllllIlllIllIlIllllllII = llllllllllllllIlllIllIllIIIIIllI.toCharArray();
        int llllllllllllllIlllIllIlIlllllIll = llllllllllllllIlllIllIlIllllllII.length;
        int llllllllllllllIlllIllIlIlllllIlI = lIIllIllllIII[0];
        while (a.lIllIIIlllIlIlI(llllllllllllllIlllIllIlIlllllIlI, llllllllllllllIlllIllIlIlllllIll)) {
            char llllllllllllllIlllIllIllIIIIIlll = llllllllllllllIlllIllIlIllllllII[llllllllllllllIlllIllIlIlllllIlI];
            llllllllllllllIlllIllIllIIIIIlII.append((char)(llllllllllllllIlllIllIllIIIIIlll ^ llllllllllllllIlllIllIllIIIIIIll[llllllllllllllIlllIllIllIIIIIIlI % llllllllllllllIlllIllIllIIIIIIll.length]));
            0;
            ++llllllllllllllIlllIllIllIIIIIIlI;
            ++llllllllllllllIlllIllIlIlllllIlI;
            0;
            if (((0x16 ^ 0x4C) & ~(0x2B ^ 0x71)) >= 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIllIllIIIIIlII);
    }

    private static boolean lIllIIIlllIlIIl(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIllIIIlllIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIIIlllIlIII(int n2, int n3) {
        return n2 <= n3;
    }

    public void c(boolean bl) {
        this.p = bl;
    }

    public int E() {
        return this.j;
    }

    public boolean q() {
        boolean bl;
        if (a.lIllIIIlllIlIII(this.f.numberOfBuckets(), this.p())) {
            bl = lIIllIllllIII[1];
            0;
            if (2 < 0) {
                return ((0x3C ^ 0x24 ^ (0x3F ^ 0x61)) & (0x15 ^ 0xB ^ (0x65 ^ 0x3D) ^ -1)) != 0;
            }
        } else {
            bl = lIIllIllllIII[0];
        }
        return bl;
    }

    public SquireTemporossConfig A() {
        return this.f;
    }

    public NPC j() {
        return NPCs.getNearest(nPC -> {
            int n2;
            String[] stringArray = new String[lIIllIllllIII[1]];
            stringArray[a.lIIllIllllIII[0]] = lIIllIlllIllI[lIIllIllllIII[30]];
            if (a.lIllIIIlllIIllI(nPC.hasAction(stringArray) ? 1 : 0) && a.lIllIIIlllIlIII(nPC.getWorldLocation().distanceTo(this.s.Z()), lIIllIllllIII[20])) {
                String[] stringArray2 = new String[lIIllIllllIII[1]];
                stringArray2[a.lIIllIllllIII[0]] = lIIllIlllIllI[lIIllIllllIII[31]];
                if (a.lIllIIIlllIIllI(nPC.hasAction(stringArray2) ? 1 : 0) && a.lIllIIIlllIIllI(this.e.a((Actor)nPC) ? 1 : 0)) {
                    n2 = lIIllIllllIII[1];
                    0;
                    if (-1 < 0) return n2 != 0;
                    return ((0x20 ^ 0x78) & ~(0xE0 ^ 0xB8)) != 0;
                }
            }
            n2 = lIIllIllllIII[0];
            return n2 != 0;
        });
    }

    public int n() {
        return Inventory.getCount(item -> {
            int n2;
            if (a.lIllIIIlllIIllI(item.getName().contains(lIIllIlllIllI[lIIllIllllIII[26]]) ? 1 : 0)) {
                String[] stringArray = new String[lIIllIllllIII[1]];
                stringArray[a.lIIllIllllIII[0]] = lIIllIlllIllI[lIIllIllllIII[27]];
                if (a.lIllIIIlllIIlll(item.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIIllIllllIII[1];
                    0;
                    if (3 >= 3) return n2 != 0;
                    return ((0x53 ^ 0x7E) & ~(0x59 ^ 0x74)) != 0;
                }
            }
            n2 = lIIllIllllIII[0];
            return n2 != 0;
        });
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean t() {
        int n2;
        block3: {
            block2: {
                int[] nArray = new int[lIIllIllllIII[1]];
                nArray[a.lIIllIllllIII[0]] = lIIllIllllIII[11];
                if (!a.lIllIIIlllIIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block2;
                int[] nArray2 = new int[lIIllIllllIII[1]];
                nArray2[a.lIIllIllllIII[0]] = lIIllIllllIII[12];
                if (!a.lIllIIIlllIIllI(Equipment.contains((int[])nArray2) ? 1 : 0)) break block3;
            }
            n2 = lIIllIllllIII[1];
            0;
            if (-1 < 2) return n2 != 0;
            return ((0x8C ^ 0xA1 ^ (0xEC ^ 0xA3)) & (0x55 ^ 0x62 ^ (0x1F ^ 0x4A) ^ -1)) != 0;
        }
        n2 = lIIllIllllIII[0];
        return n2 != 0;
    }

    public boolean o() {
        boolean bl;
        if (a.lIllIIIlllIIlIl(this.f.numberOfBuckets(), this.n())) {
            bl = lIIllIllllIII[1];
            0;
            if (((0x39 ^ 0xE ^ (0xA3 ^ 0xB2)) & (0x56 ^ 0x5C ^ (0x23 ^ 0xF) ^ -1)) == 2) {
                return ((0x44 ^ 0x6D ^ (0x70 ^ 1)) & (0xC0 ^ 0x8E ^ (0x97 ^ 0x81) ^ -1)) != 0;
            }
        } else {
            bl = lIIllIllllIII[0];
        }
        return bl;
    }

    private static boolean lIllIIIlllIIllI(int n2) {
        return n2 != 0;
    }

    public boolean J() {
        return this.o;
    }

    private static String lIllIIIllIlIlIl(String llllllllllllllIlllIllIllIIIlIllI, String llllllllllllllIlllIllIllIIIlIIll) {
        try {
            SecretKeySpec llllllllllllllIlllIllIllIIIllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIllIIIlIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIllIllIIIllIII = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIllIllIIIllIII.init(lIIllIllllIII[9], llllllllllllllIlllIllIllIIIllIIl);
            return new String(llllllllllllllIlllIllIllIIIllIII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIllIIIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIllIllIIIlIlll) {
            llllllllllllllIlllIllIllIIIlIlll.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIlllIIlII(int n2, int n3) {
        return n2 != n3;
    }

    public boolean K() {
        return this.p;
    }

    static {
        a.lIllIIIlllIIIll();
        a.lIllIIIllIllIII();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean s() {
        int n2;
        String[] stringArray = new String[lIIllIllllIII[1]];
        stringArray[a.lIIllIllllIII[0]] = lIIllIlllIllI[lIIllIllllIII[0]];
        if (a.lIllIIIlllIIllI(Equipment.contains((String[])stringArray) ? 1 : 0)) {
            String[] stringArray2 = new String[lIIllIllllIII[1]];
            stringArray2[a.lIIllIllllIII[0]] = lIIllIlllIllI[lIIllIllllIII[1]];
            if (a.lIllIIIlllIIllI(Equipment.contains((String[])stringArray2) ? 1 : 0)) {
                String[] stringArray3 = new String[lIIllIllllIII[1]];
                stringArray3[a.lIIllIllllIII[0]] = lIIllIlllIllI[lIIllIllllIII[9]];
                if (a.lIllIIIlllIIllI(Equipment.contains((String[])stringArray3) ? 1 : 0)) {
                    String[] stringArray4 = new String[lIIllIllllIII[1]];
                    stringArray4[a.lIIllIllllIII[0]] = lIIllIlllIllI[lIIllIllllIII[10]];
                    if (a.lIllIIIlllIIllI(Equipment.contains((String[])stringArray4) ? 1 : 0)) {
                        n2 = lIIllIllllIII[1];
                        0;
                        if (null == null) return n2 != 0;
                        return ((0x60 ^ 0x30) & ~(0xF5 ^ 0xA5)) != 0;
                    }
                }
            }
        }
        n2 = lIIllIllllIII[0];
        return n2 != 0;
    }

    public boolean L() {
        return this.q;
    }

    private static void lIllIIIllIllIII() {
        lIIllIlllIllI = new String[lIIllIllllIII[32]];
        a.lIIllIlllIllI[a.lIIllIllllIII[0]] = a."Spirit angler headband";
        a.lIIllIlllIllI[a.lIIllIllllIII[1]] = a."Spirit angler top";
        a.lIIllIlllIllI[a.lIIllIllllIII[9]] = a."Spirit angler waders";
        a.lIIllIlllIllI[a.lIIllIllllIII[10]] = a."Spirit angler boots";
        a.lIIllIlllIllI[a.lIIllIllllIII[13]] = a."Subdued in";
        a.lIIllIlllIllI[a.lIIllIllllIII[14]] = a."Resetting game state!";
        a.lIIllIlllIllI[a.lIIllIllllIII[15]] = a."Reward permits:";
        a.lIIllIlllIllI[a.lIIllIllllIII[17]] = a.".";
        a.lIIllIlllIllI[a.lIIllIllllIII[18]] = a."<col=ef1020>";
        a.lIIllIlllIllI[a.lIIllIllllIII[19]] = a."";
        a.lIIllIlllIllI[a.lIIllIllllIII[20]] = a."</col>";
        a.lIIllIlllIllI[a.lIIllIllllIII[21]] = a."";
        a.lIIllIlllIllI[a.lIIllIllllIII[22]] = a."a colossal wave closes in..";
        a.lIIllIlllIllI[a.lIIllIllllIII[23]] = a."the rope keeps you securely";
        a.lIIllIlllIllI[a.lIIllIllllIII[24]] = a."the wave slams into you";
        a.lIIllIlllIllI[a.lIIllIllllIII[3]] = a."Tempoross is vulnerable";
        a.lIIllIlllIllI[a.lIIllIllllIII[16]] = a."Repair";
        a.lIIllIlllIllI[a.lIIllIllllIII[25]] = a."Bucket";
        a.lIIllIlllIllI[a.lIIllIllllIII[26]] = a."Bucket";
        a.lIIllIlllIllI[a.lIIllIllllIII[27]] = a."Empty";
        a.lIIllIlllIllI[a.lIIllIllllIII[28]] = a."harpoon";
        a.lIIllIlllIllI[a.lIIllIllllIII[29]] = a."harpoon";
        a.lIIllIlllIllI[a.lIIllIllllIII[30]] = a."Fill";
        a.lIIllIlllIllI[a.lIIllIllllIII[31]] = a."Check-ammo";
    }

    public void f(int n2) {
        this.m = n2;
    }

    public void e(boolean bl) {
        this.r = bl;
    }

    public int G() {
        return this.l;
    }

    public boolean l() {
        int n2;
        if (a.lIllIIIlllIIllI(this.m() ? 1 : 0) && a.lIllIIIlllIIllI(this.r() ? 1 : 0) && a.lIllIIIlllIIllI(this.q() ? 1 : 0)) {
            n2 = lIIllIllllIII[1];
            0;
            if (((150 + 214 - 202 + 56 ^ 132 + 70 - 112 + 64) & (0x20 ^ 0x57 ^ (0x42 ^ 0x75) ^ -1)) >= 2) {
                return ((19 + 102 - 113 + 125 ^ 68 + 148 - 68 + 37) & (103 + 106 - 113 + 51 ^ 123 + 25 - 69 + 96 ^ -1)) != 0;
            }
        } else {
            n2 = lIIllIllllIII[0];
        }
        return n2 != 0;
    }

    public int p() {
        return Inventory.getCount(item -> item.getName().contains(lIIllIlllIllI[lIIllIllllIII[25]]));
    }

    public boolean I() {
        return this.n;
    }

    public void b(boolean bl) {
        this.o = bl;
    }

    public void v() {
        this.r = lIIllIllllIII[0];
    }

    public int D() {
        return this.i;
    }

    public void w() {
        this.j = lIIllIllllIII[1];
        this.n = lIIllIllllIII[0];
        this.q = lIIllIllllIII[0];
        this.p = lIIllIllllIII[0];
        this.s = null;
    }

    public boolean m() {
        boolean bl;
        if (!a.lIllIIIlllIIlll(Inventory.contains(item -> item.getName().toLowerCase().contains(lIIllIlllIllI[lIIllIllllIII[29]])) ? 1 : 0) || a.lIllIIIlllIIllI(Equipment.contains(item -> item.getName().toLowerCase().contains(lIIllIlllIllI[lIIllIllllIII[28]])) ? 1 : 0)) {
            bl = lIIllIllllIII[1];
            0;
            if (null != null) {
                return ((68 + 88 - 30 + 60 ^ 18 + 90 - -17 + 28) & (108 + 52 - 19 + 19 ^ 33 + 69 - -12 + 17 ^ -1)) != 0;
            }
        } else {
            bl = lIIllIllllIII[0];
        }
        return bl;
    }

    public int C() {
        return this.h;
    }

    public StopWatch B() {
        return this.g;
    }

    private static boolean lIllIIIlllIIlll(int n2) {
        return n2 == 0;
    }

    public void e(int n2) {
        this.l = n2;
    }
}

