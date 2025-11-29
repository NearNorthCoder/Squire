/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bQ;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bX;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

@TaskDesc(name="Clearing boulder", priority=150, blocking=true)
public class bP
extends bX {
    private static /* synthetic */ int[] llIIlIIIlIl;
    private static final /* synthetic */ int gT;
    private static /* synthetic */ String[] llIIlIIIlII;
    private /* synthetic */ bQ gY;
    private static final /* synthetic */ int gW;
    private static final /* synthetic */ int gV;
    private final /* synthetic */ SquireAutoTOA gX;
    private static final /* synthetic */ int gS;
    private static final /* synthetic */ int gU;

    static {
        bP.lIlIIIIIIlIIII();
        bP.lIlIIIIIIIllll();
        gV = llIIlIIIlIl[5];
        gU = llIIlIIIlIl[18];
        gW = llIIlIIIlIl[6];
        gS = llIIlIIIlIl[7];
        gT = llIIlIIIlIl[17];
    }

    private static String lIlIIIIIIIlllI(String llllllllllllllllIlIIIIIIIlllllIl, String llllllllllllllllIlIIIIIIIllllllI) {
        try {
            SecretKeySpec llllllllllllllllIlIIIIIIlIIIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIIIIIIllllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIlIIIIIIlIIIIIIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIlIIIIIIlIIIIIIl.init(llIIlIIIlIl[4], llllllllllllllllIlIIIIIIlIIIIIlI);
            return new String(llllllllllllllllIlIIIIIIlIIIIIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIIIIIIlllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIIIIIIlIIIIIII) {
            llllllllllllllllIlIIIIIIlIIIIIII.printStackTrace();
            return null;
        }
    }

    @Inject
    protected bP(Client client, z z2, TOAConfig tOAConfig, SquireAutoTOA squireAutoTOA) {
        super(client, z2, tOAConfig);
        this.gX = squireAutoTOA;
    }

    private static boolean lIlIIIIIIllIII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIIIIIIlIIIl(int n2) {
        return n2 != 0;
    }

    private static /* synthetic */ boolean c(NPC nPC, int n2, NPC nPC2) {
        boolean bl2;
        if (bP.lIlIIIIIIlIlIl(nPC2.getWorldLocation().distanceTo((Locatable)nPC), n2)) {
            bl2 = llIIlIIIlIl[0];
            "".length();
            if (((68 + 11 - -3 + 149 ^ 159 + 121 - 250 + 164) & (113 + 35 - 143 + 144 ^ 71 + 30 - 97 + 172 ^ -" ".length())) >= "  ".length()) {
                return ((0x23 ^ 0x42 ^ (0x3D ^ 0x61)) & (0x72 ^ 2 ^ (0x77 ^ 0x3A) ^ -" ".length())) != 0;
            }
        } else {
            bl2 = llIIlIIIlIl[1];
        }
        return bl2;
    }

    private static boolean lIlIIIIIIlIlII(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bL() {
        void llllllllllllllllIlIIIIIIllIllIll;
        bP llllllllllllllllIlIIIIIIllIlllII;
        int[] nArray = new int[llIIlIIIlIl[0]];
        nArray[bP.llIIlIIIlIl[1]] = llIIlIIIlIl[2];
        List list = NPCs.getAll((int[])nArray);
        if (bP.lIlIIIIIIlIIIl(list.isEmpty() ? 1 : 0)) {
            this.gY = null;
            return llIIlIIIlIl[1];
        }
        if (bP.lIlIIIIIIlIIlI(llllllllllllllllIlIIIIIIllIlllII.cG().isEmpty() ? 1 : 0)) {
            return llIIlIIIlIl[1];
        }
        llllllllllllllllIlIIIIIIllIlllII.gX.a(llIIlIIIlIl[3]);
        NPC llllllllllllllllIlIIIIIIllIllIlI = llllllllllllllllIlIIIIIIllIllIll.stream().filter(nPC -> this.F((NPC)nPC).stream().anyMatch(worldPoint -> {
            boolean bl2;
            if (bP.lIlIIIIIIlIIlI(this.p((WorldPoint)worldPoint) ? 1 : 0)) {
                bl2 = llIIlIIIlIl[0];
                "".length();
                if (((3 ^ 7) & ~(0x3A ^ 0x3E)) == "   ".length()) {
                    return ((0xB0 ^ 0x98) & ~(0xBE ^ 0x96)) != 0;
                }
            } else {
                bl2 = llIIlIIIlIl[1];
            }
            return bl2;
        })).findFirst().orElse(null);
        WorldPoint llllllllllllllllIlIIIIIIllIllIIl = Players.getLocal().getWorldLocation();
        if (bP.lIlIIIIIIlIIll(llllllllllllllllIlIIIIIIllIllIlI)) {
            WorldPoint llllllllllllllllIlIIIIIIllIllIII = llllllllllllllllIlIIIIIIllIllIlI.getWorldLocation().dx(llIIlIIIlIl[0]);
            Iterator<WorldPoint> llllllllllllllllIlIIIIIIllIlIlll = llllllllllllllllIlIIIIIIllIlllII.F(llllllllllllllllIlIIIIIIllIllIlI).iterator();
            while (bP.lIlIIIIIIlIIIl(llllllllllllllllIlIIIIIIllIlIlll.hasNext() ? 1 : 0)) {
                WorldPoint llllllllllllllllIlIIIIIIllIlIllI = llllllllllllllllIlIIIIIIllIlIlll.next();
                if (bP.lIlIIIIIIlIIlI(llllllllllllllllIlIIIIIIllIlllII.p(llllllllllllllllIlIIIIIIllIlIllI) ? 1 : 0)) {
                    llllllllllllllllIlIIIIIIllIllIII = llllllllllllllllIlIIIIIIllIlIllI;
                }
                "".length();
                if ("   ".length() > 0) continue;
                return ((8 ^ 0x18 ^ (0x17 ^ 0x3D)) & (91 + 88 - 142 + 100 ^ 96 + 136 - 230 + 177 ^ -" ".length())) != 0;
            }
            if (bP.lIlIIIIIIlIIIl(llllllllllllllllIlIIIIIIllIllIIl.equals((Object)llllllllllllllllIlIIIIIIllIllIII) ? 1 : 0)) {
                llllllllllllllllIlIIIIIIllIlllII.gX.c();
                return llIIlIIIlIl[1];
            }
            llllllllllllllllIlIIIIIIllIlllII.a(llllllllllllllllIlIIIIIIllIllIII, llllllllllllllllIlIIIIIIllIlllII::P);
            return llIIlIIIlIl[0];
        }
        NPC llllllllllllllllIlIIIIIIllIllIII = NPCs.getNearest(nPC -> {
            boolean bl2;
            if (!bP.lIlIIIIIIlIlll(nPC.getId(), llIIlIIIlIl[17]) || bP.lIlIIIIIIllIII(nPC.getId(), llIIlIIIlIl[18])) {
                bl2 = llIIlIIIlIl[0];
                "".length();
                if (" ".length() > "   ".length()) {
                    return ((82 + 108 - 125 + 70 ^ 30 + 159 - 124 + 95) & (0x29 ^ 0x21 ^ (0x9C ^ 0xB3) ^ -" ".length())) != 0;
                }
            } else {
                bl2 = llIIlIIIlIl[1];
            }
            return bl2;
        });
        if (bP.lIlIIIIIIlIIll(llllllllllllllllIlIIIIIIllIllIII)) {
            if (bP.lIlIIIIIIlIIll(llllllllllllllllIlIIIIIIllIlllII.gY) && bP.lIlIIIIIIlIIlI(llllllllllllllllIlIIIIIIllIlllII.gY.hd ? 1 : 0)) {
                WorldPoint llllllllllllllllIlIIIIIIllIlIlll = llllllllllllllllIlIIIIIIllIlllII.gY.ct();
                List<TileObject> llllllllllllllllIlIIIIIIllIlIllI = llllllllllllllllIlIIIIIIllIlllII.cC();
                WorldPoint llllllllllllllllIlIIIIIIllIlIlIl = llllllllllllllllIlIIIIIIllIlIlll.createWorldArea(llIIlIIIlIl[4]).toWorldPointList().stream().filter(worldPoint -> {
                    boolean bl2;
                    if (bP.lIlIIIIIIlIIlI(this.k(llllllllllllllllIlIIIIIIllIlIllI, (WorldPoint)worldPoint) ? 1 : 0)) {
                        bl2 = llIIlIIIlIl[0];
                        "".length();
                        if (null != null) {
                            return ((0xA1 ^ 0xC5 ^ (0xD3 ^ 0x86)) & (0x14 ^ 0x77 ^ (0x5B ^ 9) ^ -" ".length())) != 0;
                        }
                    } else {
                        bl2 = llIIlIIIlIl[1];
                    }
                    return bl2;
                }).min(Comparator.comparingInt(worldPoint2 -> worldPoint2.distanceTo(llllllllllllllllIlIIIIIIllIlIlll))).orElse(null);
                NPC llllllllllllllllIlIIIIIIllIlIlII = llllllllllllllllIlIIIIIIllIlllII.cB();
                WorldArea llllllllllllllllIlIIIIIIllIlIIll = llllllllllllllllIlIIIIIIllIlIlII.getWorldArea();
                llllllllllllllllIlIIIIIIllIlllII.a(llllllllllllllllIlIIIIIIllIlIlIl, worldPoint -> {
                    int n2;
                    if (bP.lIlIIIIIIlIIlI(this.k(llllllllllllllllIlIIIIIIllIlIllI, (WorldPoint)worldPoint) ? 1 : 0) && bP.lIlIIIIIIlIIlI(llllllllllllllllIlIIIIIIllIlIIll.isInMeleeDistance(worldPoint) ? 1 : 0) && bP.lIlIIIIIIlIllI(llllllllllllllllIlIIIIIIllIlIIll.distanceTo2D(worldPoint), llIIlIIIlIl[0])) {
                        n2 = llIIlIIIlIl[0];
                        "".length();
                        if ("  ".length() >= (84 + 63 - 86 + 94 ^ 69 + 76 - 20 + 34)) {
                            return ((0x6C ^ 0x5A ^ (5 ^ 0x1F)) & (0xC4 ^ 0xC1 ^ (0x7C ^ 0x55) ^ -" ".length())) != 0;
                        }
                    } else {
                        n2 = llIIlIIIlIl[1];
                    }
                    return n2 != 0;
                });
                return llIIlIIIlIl[0];
            }
            NPC llllllllllllllllIlIIIIIIllIlIlll = llllllllllllllllIlIIIIIIllIllIll.stream().min(Comparator.comparingDouble(nPC2 -> nPC2.distanceTo((Locatable)llllllllllllllllIlIIIIIIllIllIII))).orElse(null);
            if (bP.lIlIIIIIIlIlII(llllllllllllllllIlIIIIIIllIlIlll)) {
                boolean bl2;
                if (bP.lIlIIIIIIlIlII(llllllllllllllllIlIIIIIIllIlllII.cA())) {
                    bl2 = llIIlIIIlIl[0];
                    "".length();
                    if (((20 + 149 - 53 + 78 ^ 108 + 85 - 85 + 32) & (0x11 ^ 0x73 ^ (0x52 ^ 0x7E) ^ -" ".length())) > " ".length()) {
                        return ((0xFB ^ 0xA8 ^ (0x64 ^ 0xD)) & (108 + 132 - 110 + 50 ^ 84 + 63 - 29 + 24 ^ -" ".length())) != 0;
                    }
                } else {
                    bl2 = llIIlIIIlIl[1];
                }
                return bl2;
            }
            Iterator<WorldPoint> llllllllllllllllIlIIIIIIllIlIllI = llllllllllllllllIlIIIIIIllIlllII.F(llllllllllllllllIlIIIIIIllIlIlll).iterator();
            while (bP.lIlIIIIIIlIIIl(llllllllllllllllIlIIIIIIllIlIllI.hasNext() ? 1 : 0)) {
                WorldPoint llllllllllllllllIlIIIIIIllIlIlIl = llllllllllllllllIlIIIIIIllIlIllI.next();
                if (bP.lIlIIIIIIlIlIl(llllllllllllllllIlIIIIIIllIllIII.distanceTo(llllllllllllllllIlIIIIIIllIlIlIl), llIIlIIIlIl[5]) && (!bP.lIlIIIIIIlIIll(llllllllllllllllIlIIIIIIllIlllII.gY) || bP.lIlIIIIIIlIIIl(llllllllllllllllIlIIIIIIllIlllII.gY.hd ? 1 : 0))) {
                    llllllllllllllllIlIIIIIIllIlllII.bp();
                    llllllllllllllllIlIIIIIIllIllIII.interact(llIIlIIIlII[llIIlIIIlIl[1]]);
                    return llIIlIIIlIl[0];
                }
                "".length();
                if (" ".length() == " ".length()) continue;
                return ((0x21 ^ 0x29) & ~(0x71 ^ 0x79)) != 0;
            }
            return llIIlIIIlIl[0];
        }
        if (bP.lIlIIIIIIlIlII(llllllllllllllllIlIIIIIIllIlllII.gY)) {
            llllllllllllllllIlIIIIIIllIlllII.gY = llllllllllllllllIlIIIIIIllIlllII.p(llIIlIIIlIl[6]);
            return llIIlIIIlIl[0];
        }
        NPC llllllllllllllllIlIIIIIIllIlIlll = llllllllllllllllIlIIIIIIllIlllII.gY.cv();
        if (bP.lIlIIIIIIlIlII(llllllllllllllllIlIIIIIIllIlIlll)) {
            return llIIlIIIlIl[1];
        }
        NPC llllllllllllllllIlIIIIIIllIlIllI = llllllllllllllllIlIIIIIIllIlllII.gY.cu();
        if (bP.lIlIIIIIIlIlII(llllllllllllllllIlIIIIIIllIlIllI)) {
            return llIIlIIIlIl[1];
        }
        WorldPoint llllllllllllllllIlIIIIIIllIlIlIl = llllllllllllllllIlIIIIIIllIlllII.gY.ct();
        if (bP.lIlIIIIIIlIIIl(llllllllllllllllIlIIIIIIllIllIIl.equals((Object)llllllllllllllllIlIIIIIIllIlIlIl) ? 1 : 0)) {
            if (bP.lIlIIIIIIlIlIl(llllllllllllllllIlIIIIIIllIlIlll.getWorldLocation().distanceTo(llllllllllllllllIlIIIIIIllIlllII.gY.cw()), llIIlIIIlIl[0]) && bP.lIlIIIIIIlIIIl(llllllllllllllllIlIIIIIIllIlllII.gY.hd ? 1 : 0)) {
                llllllllllllllllIlIIIIIIllIlIlll.interact(llIIlIIIlII[llIIlIIIlIl[0]]);
                "".length();
                if ("   ".length() <= " ".length()) {
                    return ((0x31 ^ 0x3D) & ~(0x6C ^ 0x60)) != 0;
                }
            } else {
                llllllllllllllllIlIIIIIIllIlIlll.interact(llIIlIIIlII[llIIlIIIlIl[4]]);
                "".length();
                if ("   ".length() != "   ".length()) {
                    return ((0x15 ^ 0x42 ^ (0xC9 ^ 0x86)) & (0x9A ^ 0x93 ^ (0x47 ^ 0x56) ^ -" ".length())) != 0;
                }
            }
        } else {
            llllllllllllllllIlIIIIIIllIlllII.a(llllllllllllllllIlIIIIIIllIlIlIl, llllllllllllllllIlIIIIIIllIlllII::P);
        }
        return llIIlIIIlIl[0];
    }

    private static /* synthetic */ boolean i(WorldPoint worldPoint, NPC nPC) {
        boolean bl2;
        if (!bP.lIlIIIIIIlIlll(nPC.getWorldX(), worldPoint.getWorldX()) || bP.lIlIIIIIIllIII(nPC.getWorldY(), worldPoint.getWorldY())) {
            bl2 = llIIlIIIlIl[0];
            "".length();
            if (null != null) {
                return ((0xA7 ^ 0xB6) & ~(0x8F ^ 0x9E)) != 0;
            }
        } else {
            bl2 = llIIlIIIlIl[1];
        }
        return bl2;
    }

    private static boolean lIlIIIIIIlIlIl(int n2, int n3) {
        return n2 <= n3;
    }

    private List<WorldPoint> E(NPC nPC) {
        WorldPoint worldPoint = nPC.getWorldLocation();
        WorldPoint worldPoint2 = worldPoint.getWorldLocation().dy(llIIlIIIlIl[0]);
        WorldPoint worldPoint3 = worldPoint.getWorldLocation().dy(llIIlIIIlIl[8]);
        WorldPoint[] worldPointArray = new WorldPoint[llIIlIIIlIl[9]];
        worldPointArray[bP.llIIlIIIlIl[1]] = worldPoint.dx(llIIlIIIlIl[0]);
        worldPointArray[bP.llIIlIIIlIl[0]] = worldPoint.dx(llIIlIIIlIl[4]);
        worldPointArray[bP.llIIlIIIlIl[4]] = worldPoint.dx(llIIlIIIlIl[5]);
        worldPointArray[bP.llIIlIIIlIl[5]] = worldPoint.dx(llIIlIIIlIl[10]);
        worldPointArray[bP.llIIlIIIlIl[10]] = worldPoint2.dx(llIIlIIIlIl[0]);
        worldPointArray[bP.llIIlIIIlIl[11]] = worldPoint2.dx(llIIlIIIlIl[4]);
        worldPointArray[bP.llIIlIIIlIl[12]] = worldPoint2.dx(llIIlIIIlIl[5]);
        worldPointArray[bP.llIIlIIIlIl[6]] = worldPoint2.dx(llIIlIIIlIl[10]);
        worldPointArray[bP.llIIlIIIlIl[13]] = worldPoint3.dx(llIIlIIIlIl[0]);
        worldPointArray[bP.llIIlIIIlIl[14]] = worldPoint3.dx(llIIlIIIlIl[4]);
        worldPointArray[bP.llIIlIIIlIl[15]] = worldPoint3.dx(llIIlIIIlIl[5]);
        worldPointArray[bP.llIIlIIIlIl[16]] = worldPoint3.dx(llIIlIIIlIl[10]);
        return List.of(worldPointArray);
    }

    /*
     * WARNING - void declaration
     */
    private bQ p(int n2) {
        void var3_3;
        void llllllllllllllllIlIIIIIIllIIIlIl;
        Object llllllllllllllllIlIIIIIIlIllllIl;
        NPC llllllllllllllllIlIIIIIIlIlllllI;
        bP llllllllllllllllIlIIIIIIllIIIllI;
        NPC llllllllllllllllIlIIIIIIlIllllll;
        void llllllllllllllllIlIIIIIIllIIIlII;
        int[] nArray = new int[llIIlIIIlIl[0]];
        nArray[bP.llIIlIIIlIl[1]] = llIIlIIIlIl[2];
        List list = NPCs.getAll((int[])nArray);
        if (bP.lIlIIIIIIlIIIl(list.isEmpty() ? 1 : 0)) {
            return null;
        }
        ArrayList<Object> llllllllllllllllIlIIIIIIllIIIIll = new ArrayList<Object>();
        Player llllllllllllllllIlIIIIIIllIIIIlI = Players.getLocal();
        int[] nArray2 = new int[llIIlIIIlIl[0]];
        nArray2[bP.llIIlIIIlIl[1]] = llIIlIIIlIl[7];
        List llllllllllllllllIlIIIIIIllIIIIIl = NPCs.getAll((int[])nArray2);
        Iterator llllllllllllllllIlIIIIIIllIIIIII = llllllllllllllllIlIIIIIIllIIIlII.iterator();
        while (bP.lIlIIIIIIlIIIl(llllllllllllllllIlIIIIIIllIIIIII.hasNext() ? 1 : 0)) {
            llllllllllllllllIlIIIIIIlIllllll = (NPC)llllllllllllllllIlIIIIIIllIIIIII.next();
            llllllllllllllllIlIIIIIIlIlllllI = llllllllllllllllIlIIIIIIllIIIllI.F(llllllllllllllllIlIIIIIIlIllllll).iterator();
            while (bP.lIlIIIIIIlIIIl(llllllllllllllllIlIIIIIIlIlllllI.hasNext() ? 1 : 0)) {
                llllllllllllllllIlIIIIIIlIllllIl = llllllllllllllllIlIIIIIIlIlllllI.next();
                if (bP.lIlIIIIIIlIIlI(llllllllllllllllIlIIIIIIllIIIllI.p((WorldPoint)llllllllllllllllIlIIIIIIlIllllIl) ? 1 : 0)) {
                    llllllllllllllllIlIIIIIIllIIIIll.add(new bQ(llllllllllllllllIlIIIIIIlIllllll, null, llllllllllllllllIlIIIIIIlIllllll.getWorldLocation(), llIIlIIIlIl[1], llIIlIIIlIl[1]));
                    "".length();
                }
                "".length();
                if (-" ".length() <= 0) continue;
                return null;
            }
            llllllllllllllllIlIIIIIIlIlllllI = llllllllllllllllIlIIIIIIllIIIIIl.stream().filter(arg_0 -> bP.c(llllllllllllllllIlIIIIIIlIllllll, (int)llllllllllllllllIlIIIIIIllIIIlIl, arg_0)).filter(nPC2 -> {
                boolean bl2;
                if (!bP.lIlIIIIIIlIlll(nPC2.getWorldY(), llllllllllllllllIlIIIIIIlIllllll.getWorldY()) || bP.lIlIIIIIIllIII(nPC2.getWorldX(), llllllllllllllllIlIIIIIIlIllllll.getWorldX())) {
                    bl2 = llIIlIIIlIl[0];
                    "".length();
                    if ("  ".length() <= -" ".length()) {
                        return ((0x90 ^ 0xC5 ^ (0x9C ^ 0x9B)) & (105 + 40 - -4 + 54 ^ 103 + 113 - 101 + 38 ^ -" ".length())) != 0;
                    }
                } else {
                    bl2 = llIIlIIIlIl[1];
                }
                return bl2;
            }).min(Comparator.comparingInt(nPC -> nPC.distanceTo((Locatable)Players.getLocal()))).orElse(null);
            if (bP.lIlIIIIIIlIIll(llllllllllllllllIlIIIIIIlIlllllI)) {
                llllllllllllllllIlIIIIIIlIllllIl = new bQ(llllllllllllllllIlIIIIIIlIllllll, llllllllllllllllIlIIIIIIlIlllllI, llllllllllllllllIlIIIIIIlIllllll.getWorldLocation(), llIIlIIIlIl[1], llIIlIIIlIl[1]);
                if (bP.lIlIIIIIIlIIIl(llllllllllllllllIlIIIIIIllIIIllI.p(((bQ)llllllllllllllllIlIIIIIIlIllllIl).ct()) ? 1 : 0)) {
                    "".length();
                    if ("  ".length() != "   ".length()) continue;
                    return null;
                }
                llllllllllllllllIlIIIIIIllIIIIll.add(llllllllllllllllIlIIIIIIlIllllIl);
                "".length();
            }
            "".length();
            if (((0x63 ^ 0x3D) & ~(0xDF ^ 0x81)) <= 0) continue;
            return null;
        }
        llllllllllllllllIlIIIIIIllIIIIII = llllllllllllllllIlIIIIIIllIIIlII.iterator();
        while (bP.lIlIIIIIIlIIIl(llllllllllllllllIlIIIIIIllIIIIII.hasNext() ? 1 : 0)) {
            llllllllllllllllIlIIIIIIlIllllll = (NPC)llllllllllllllllIlIIIIIIllIIIIII.next();
            llllllllllllllllIlIIIIIIlIlllllI = llllllllllllllllIlIIIIIIllIIIIIl.stream().filter(arg_0 -> bP.b(llllllllllllllllIlIIIIIIlIllllll, (int)llllllllllllllllIlIIIIIIllIIIlIl, arg_0)).filter(nPC2 -> {
                boolean bl2;
                if (bP.lIlIIIIIIllIII(Math.abs(nPC2.getWorldX() - llllllllllllllllIlIIIIIIlIllllll.getWorldX()), Math.abs(nPC2.getWorldY() - llllllllllllllllIlIIIIIIlIllllll.getWorldY()))) {
                    bl2 = llIIlIIIlIl[0];
                    "".length();
                    if ("   ".length() > "   ".length()) {
                        return ((33 + 160 - 128 + 150 ^ 79 + 43 - -9 + 14) & (0x26 ^ 0xF ^ (0xF4 ^ 0x9B) ^ -" ".length())) != 0;
                    }
                } else {
                    bl2 = llIIlIIIlIl[1];
                }
                return bl2;
            }).min(Comparator.comparingInt(nPC -> nPC.distanceTo((Locatable)Players.getLocal()))).orElse(null);
            if (bP.lIlIIIIIIlIIll(llllllllllllllllIlIIIIIIlIlllllI)) {
                llllllllllllllllIlIIIIIIlIllllIl = new bQ(llllllllllllllllIlIIIIIIlIllllll, llllllllllllllllIlIIIIIIlIlllllI, llllllllllllllllIlIIIIIIlIllllll.getWorldLocation(), llIIlIIIlIl[0], llIIlIIIlIl[1]);
                if (bP.lIlIIIIIIlIIIl(llllllllllllllllIlIIIIIIllIIIllI.p(((bQ)llllllllllllllllIlIIIIIIlIllllIl).ct()) ? 1 : 0)) {
                    "".length();
                    if (-(46 + 152 - 66 + 40 ^ 25 + 23 - 41 + 162) < 0) continue;
                    return null;
                }
                llllllllllllllllIlIIIIIIllIIIIll.add(llllllllllllllllIlIIIIIIlIllllIl);
                "".length();
            }
            "".length();
            if (((0x7E ^ 7 ^ (0x7D ^ 0x45)) & (0x5C ^ 0x34 ^ (0x62 ^ 0x4B) ^ -" ".length())) == 0) continue;
            return null;
        }
        llllllllllllllllIlIIIIIIllIIIIII = llllllllllllllllIlIIIIIIllIIIlII.iterator();
        while (bP.lIlIIIIIIlIIIl(llllllllllllllllIlIIIIIIllIIIIII.hasNext() ? 1 : 0)) {
            llllllllllllllllIlIIIIIIlIllllll = (NPC)llllllllllllllllIlIIIIIIllIIIIII.next();
            llllllllllllllllIlIIIIIIlIlllllI = llllllllllllllllIlIIIIIIllIIIllI.E(llllllllllllllllIlIIIIIIlIllllll).iterator();
            while (bP.lIlIIIIIIlIIIl(llllllllllllllllIlIIIIIIlIlllllI.hasNext() ? 1 : 0)) {
                llllllllllllllllIlIIIIIIlIllllIl = (WorldPoint)llllllllllllllllIlIIIIIIlIlllllI.next();
                NPC llllllllllllllllIlIIIIIIlIllllII = llllllllllllllllIlIIIIIIllIIIIIl.stream().filter(arg_0 -> bP.a((WorldPoint)llllllllllllllllIlIIIIIIlIllllIl, (int)llllllllllllllllIlIIIIIIllIIIlIl, arg_0)).filter(arg_0 -> bP.i((WorldPoint)llllllllllllllllIlIIIIIIlIllllIl, arg_0)).min(Comparator.comparingInt(nPC -> nPC.distanceTo((Locatable)Players.getLocal()))).orElse(null);
                if (bP.lIlIIIIIIlIIll(llllllllllllllllIlIIIIIIlIllllII)) {
                    bQ llllllllllllllllIlIIIIIIlIlllIll = new bQ(llllllllllllllllIlIIIIIIlIllllll, llllllllllllllllIlIIIIIIlIllllII, (WorldPoint)llllllllllllllllIlIIIIIIlIllllIl, llIIlIIIlIl[1], llIIlIIIlIl[0]);
                    if (bP.lIlIIIIIIlIIIl(llllllllllllllllIlIIIIIIllIIIllI.p(llllllllllllllllIlIIIIIIlIlllIll.ct()) ? 1 : 0)) {
                        "".length();
                        if (null == null) continue;
                        return null;
                    }
                    llllllllllllllllIlIIIIIIllIIIIll.add(llllllllllllllllIlIIIIIIlIlllIll);
                    "".length();
                }
                "".length();
                if (-" ".length() != "   ".length()) continue;
                return null;
            }
            "".length();
            if (" ".length() > -" ".length()) continue;
            return null;
        }
        WorldPoint worldPoint = Players.getLocal().getWorldLocation();
        return var3_3.stream().filter(bQ2 -> {
            boolean bl2;
            if (!bP.lIlIIIIIIlIIIl(bQ2.hd ? 1 : 0) || bP.lIlIIIIIIlIllI(bQ2.hb.distanceTo((Locatable)bQ2.ha), llIIlIIIlIl[0])) {
                bl2 = llIIlIIIlIl[0];
                "".length();
                if ("   ".length() >= (0x22 ^ 0x26)) {
                    return ((0xD9 ^ 0xC0) & ~(0xA4 ^ 0xBD)) != 0;
                }
            } else {
                bl2 = llIIlIIIlIl[1];
            }
            return bl2;
        }).min(Comparator.comparingInt(bQ2 -> bQ2.hb.distanceTo(worldPoint) + bQ2.ha.getWorldLocation().distanceTo((Locatable)bQ2.gZ))).orElse(null);
    }

    private static boolean lIlIIIIIIlIIll(Object object) {
        return object != null;
    }

    private static boolean lIlIIIIIIlIlll(int n2, int n3) {
        return n2 != n3;
    }

    private static void lIlIIIIIIIllll() {
        llIIlIIIlII = new String[llIIlIIIlIl[5]];
        bP.llIIlIIIlII[bP.llIIlIIIlIl[1]] = bP.lIlIIIIIIIllIl("XDVzPSOmjBk=", "mFWyF");
        bP.llIIlIIIlII[bP.llIIlIIIlIl[0]] = bP.lIlIIIIIIIllIl("5fRehgpkowk=", "qejXa");
        bP.llIIlIIIlII[bP.llIIlIIIlIl[4]] = bP.lIlIIIIIIIlllI("pVCG54OXe3Q=", "KszLy");
    }

    private static boolean lIlIIIIIIlIllI(int n2, int n3) {
        return n2 > n3;
    }

    private List<WorldPoint> F(NPC nPC) {
        WorldPoint worldPoint = nPC.getWorldLocation();
        return List.of(worldPoint.dx(llIIlIIIlIl[0]), worldPoint.dx(llIIlIIIlIl[4]), worldPoint.dx(llIIlIIIlIl[5]));
    }

    private static boolean lIlIIIIIIlIIlI(int n2) {
        return n2 == 0;
    }

    private static void lIlIIIIIIlIIII() {
        llIIlIIIlIl = new int[19];
        bP.llIIlIIIlIl[0] = " ".length();
        bP.llIIlIIIlIl[1] = (162 + 90 - 207 + 123 ^ 75 + 138 - 44 + 5) & (0x6D ^ 0x32 ^ (0xDC ^ 0x85) ^ -" ".length());
        bP.llIIlIIIlIl[2] = -(0xFFFFDB85 & 0x767F) & (0xFFFFFFDD & Short.MAX_VALUE);
        bP.llIIlIIIlIl[3] = 103 + 3 - -50 + 5 ^ 116 + 123 - 213 + 111;
        bP.llIIlIIIlIl[4] = "  ".length();
        bP.llIIlIIIlIl[5] = "   ".length();
        bP.llIIlIIIlIl[6] = 0x38 ^ 0x3F;
        bP.llIIlIIIlIl[7] = 0xFFFFFFFF & 0x2DD7;
        bP.llIIlIIIlIl[8] = -" ".length();
        bP.llIIlIIIlIl[9] = 0x19 ^ 0x7F ^ (0x4B ^ 0x21);
        bP.llIIlIIIlIl[10] = 0x27 ^ 0x23;
        bP.llIIlIIIlIl[11] = 0x4F ^ 0x4A;
        bP.llIIlIIIlIl[12] = 0x80 ^ 0x86;
        bP.llIIlIIIlIl[13] = 0xFD ^ 0x8E ^ (0x4F ^ 0x34);
        bP.llIIlIIIlIl[14] = 58 + 143 - 134 + 92 ^ 9 + 63 - -58 + 20;
        bP.llIIlIIIlIl[15] = 0x7C ^ 0x76;
        bP.llIIlIIIlIl[16] = 0x3E ^ 0x35;
        bP.llIIlIIIlIl[17] = 0xFFFFEDD8 & 0x3FFF;
        bP.llIIlIIIlIl[18] = -(0x88 ^ 0x93) & (0xFFFFAFFF & 0x7DFB);
    }

    private static /* synthetic */ boolean b(NPC nPC, int n2, NPC nPC2) {
        boolean bl2;
        if (bP.lIlIIIIIIlIlIl(nPC2.getWorldLocation().distanceTo((Locatable)nPC), n2)) {
            bl2 = llIIlIIIlIl[0];
            "".length();
            if (-" ".length() != -" ".length()) {
                return ((0xCD ^ 0xB3 ^ (0x81 ^ 0xC4)) & ((0x5A ^ 0x61) & ~(0xBD ^ 0x86) ^ (0x93 ^ 0xA8) ^ -" ".length())) != 0;
            }
        } else {
            bl2 = llIIlIIIlIl[1];
        }
        return bl2;
    }

    private static /* synthetic */ boolean a(WorldPoint worldPoint, int n2, NPC nPC) {
        boolean bl2;
        if (bP.lIlIIIIIIlIlIl(nPC.getWorldLocation().distanceTo(worldPoint), n2)) {
            bl2 = llIIlIIIlIl[0];
            "".length();
            if ("  ".length() <= ((0x18 ^ 0x5E ^ (0x36 ^ 0x3E)) & (0x71 ^ 0x42 ^ (0xD8 ^ 0xA5) ^ -" ".length()))) {
                return ((41 + 106 - 125 + 122 ^ 115 + 122 - 89 + 47) & (9 ^ 0x4A ^ (0xA0 ^ 0xB0) ^ -" ".length())) != 0;
            }
        } else {
            bl2 = llIIlIIIlIl[1];
        }
        return bl2;
    }

    private static String lIlIIIIIIIllIl(String llllllllllllllllIlIIIIIIIlllIIII, String llllllllllllllllIlIIIIIIIlllIIIl) {
        try {
            SecretKeySpec llllllllllllllllIlIIIIIIIlllIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIIIIIIlllIIIl.getBytes(StandardCharsets.UTF_8)), llIIlIIIlIl[13]), "DES");
            Cipher llllllllllllllllIlIIIIIIIlllIlII = Cipher.getInstance("DES");
            llllllllllllllllIlIIIIIIIlllIlII.init(llIIlIIIlIl[4], llllllllllllllllIlIIIIIIIlllIlIl);
            return new String(llllllllllllllllIlIIIIIIIlllIlII.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIIIIIIlllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIIIIIIIlllIIll) {
            llllllllllllllllIlIIIIIIIlllIIll.printStackTrace();
            return null;
        }
    }

    @Override
    public void r() {
        this.gX.c();
        this.gY = null;
    }
}

