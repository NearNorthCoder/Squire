/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  net.runelite.api.Actor
 *  net.runelite.api.HeadIcon
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.rs.api.RSNPCComposition
 */
package s.l.l.r.o.q.-.a.i.g.i.r.u.e.s;

import com.google.inject.Inject;
import java.util.Arrays;
import java.util.List;
import net.runelite.api.Actor;
import net.runelite.api.HeadIcon;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldArea;
import net.runelite.rs.api.RSNPCComposition;
import s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.DEnum;

public class c_Unknown {
    private /* synthetic */ NPC t;
    public static final /* synthetic */ int m;
    private /* synthetic */ int v;
    private /* synthetic */ int x;
    public static final /* synthetic */ int p;
    private /* synthetic */ int D;
    private /* synthetic */ boolean E;
    private /* synthetic */ boolean G;
    private /* synthetic */ HeadIcon H;
    private /* synthetic */ boolean z;
    private /* synthetic */ boolean C;
    public static final /* synthetic */ int r;
    public static final /* synthetic */ int n;
    private /* synthetic */ int I;
    private /* synthetic */ WorldArea y;
    private /* synthetic */ Actor B;
    private /* synthetic */ int w;
    public static final /* synthetic */ d[] l;
    private /* synthetic */ Actor A;
    public static final /* synthetic */ int s;
    private /* synthetic */ List<d> u;
    public static final /* synthetic */ int q;
    private static /* synthetic */ int[] llIIlIlIIlII;
    private /* synthetic */ boolean F;
    public static final /* synthetic */ int o;

    public void c(boolean bl) {
        this.E = bl;
    }

    static {
        c.lllllIlIlIIIll();
        q = llIIlIlIIlII[4];
        p = llIIlIlIIlII[5];
        r = llIIlIlIIlII[6];
        s = llIIlIlIIlII[7];
        n = llIIlIlIIlII[8];
        m = llIIlIlIIlII[9];
        o = llIIlIlIIlII[1];
        d[] dArray = new d[llIIlIlIIlII[1]];
        dArray[c.llIIlIlIIlII[3]] = d.MELEE;
        dArray[c.llIIlIlIIlII[10]] = d.RANGED;
        dArray[c.llIIlIlIIlII[11]] = d.MAGIC;
        l = dArray;
    }

    public boolean z() {
        return this.G;
    }

    @Inject
    public c(NPC nPC) {
        this.t = nPC;
        this.u = Arrays.asList(l);
        this.w = llIIlIlIIlII[0];
        this.v = llIIlIlIIlII[1];
        this.D = llIIlIlIIlII[2];
    }

    public boolean x() {
        return this.E;
    }

    public void b(boolean bl) {
        this.C = bl;
    }

    public void b(Actor actor) {
        this.B = actor;
    }

    public WorldArea r() {
        return this.y;
    }

    public void a(List<d> list) {
        this.u = list;
    }

    public int w() {
        return this.D;
    }

    public void a(WorldArea worldArea) {
        this.y = worldArea;
    }

    public HeadIcon A() {
        return this.H;
    }

    public boolean s() {
        return this.z;
    }

    public void f(int n2) {
        this.I = n2;
    }

    public NPC m() {
        return this.t;
    }

    public Actor t() {
        return this.A;
    }

    private static boolean lllllIlIlIIlII(Object object) {
        return object != null;
    }

    public void a(HeadIcon headIcon) {
        this.H = headIcon;
    }

    public Actor u() {
        return this.B;
    }

    public void d(int n2) {
        this.x = n2;
    }

    public void a(Actor actor) {
        this.A = actor;
    }

    public void e(int n2) {
        this.D = n2;
    }

    public List<d> n() {
        return this.u;
    }

    public void b(int n2) {
        this.v = n2;
    }

    public int B() {
        return this.I;
    }

    public void c(int n2) {
        this.w = n2;
    }

    public boolean y() {
        return this.F;
    }

    public int p() {
        return this.w;
    }

    public HeadIcon l() {
        RSNPCComposition rSNPCComposition = (RSNPCComposition)this.t.getComposition();
        if (c.lllllIlIlIIlII(rSNPCComposition)) {
            short[] sArray = rSNPCComposition.getRsOverheadIcons();
            return HeadIcon.values()[sArray[llIIlIlIIlII[3]]];
        }
        return null;
    }

    private static void lllllIlIlIIIll() {
        llIIlIlIIlII = new int[12];
        c.llIIlIlIIlII[0] = -(1 ^ 0x38 ^ (0x79 ^ 0x24));
        c.llIIlIlIIlII[1] = 3;
        c.llIIlIlIIlII[2] = -1;
        c.llIIlIlIIlII[3] = (0x74 ^ 0x68 ^ (0x4B ^ 0x76)) & (0xCB ^ 0xA9 ^ (0xC6 ^ 0x85) ^ -1);
        c.llIIlIlIIlII[4] = 0x1D ^ 0x1B;
        c.llIIlIlIIlII[5] = 0x65 ^ 0x6D;
        c.llIIlIlIIlII[6] = 0x99 ^ 0x95;
        c.llIIlIlIIlII[7] = 0xFB ^ 0xA2 ^ (0xF9 ^ 0xA9);
        c.llIIlIlIIlII[8] = 0x54 ^ 0x51;
        c.llIIlIlIIlII[9] = 0x1E ^ 0x14;
        c.llIIlIlIIlII[10] = 1;
        c.llIIlIlIIlII[11] = 2;
    }

    public void a(boolean bl) {
        this.z = bl;
    }

    public int o() {
        return this.v;
    }

    public void d(boolean bl) {
        this.F = bl;
    }

    public void e(boolean bl) {
        this.G = bl;
    }

    public boolean v() {
        return this.C;
    }

    public int q() {
        return this.x;
    }
}

