/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.Prayer
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.U;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.n;
import com.google.inject.Inject;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Prayer;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;

public abstract class bg
extends U {
    private static /* synthetic */ String[] lIlIllIIIIlI;
    private static /* synthetic */ int[] lIlIllIIIIll;
    protected /* synthetic */ n al;
    protected /* synthetic */ int el;
    protected static /* synthetic */ int em;
    protected /* synthetic */ n ak;
    protected /* synthetic */ int am;

    @Override
    public List<Prayer> ci() {
        return null;
    }

    protected int ei() {
        int[] nArray = new int[lIlIllIIIIll[3]];
        nArray[bg.lIlIllIIIIll[5]] = lIlIllIIIIll[8];
        return Inventory.getCount((int[])nArray);
    }

    static {
        bg.llIllllllIlIll();
        bg.llIllllllIlIlI();
        em = lIlIllIIIIll[10];
    }

    private static void llIllllllIlIll() {
        lIlIllIIIIll = new int[11];
        bg.lIlIllIIIIll[0] = -1;
        bg.lIlIllIIIIll[1] = 3;
        bg.lIlIllIIIIll[2] = 6 ^ 0x45 ^ (0x76 ^ 0x29);
        bg.lIlIllIIIIll[3] = 1;
        bg.lIlIllIIIIll[4] = 2;
        bg.lIlIllIIIIll[5] = (0x19 ^ 0x7B) & ~(0xF9 ^ 0x9B);
        bg.lIlIllIIIIll[6] = -(0xFFFFB7D8 & 0x4EBF) & (0xFFFFD7DF & 0x7FF7);
        bg.lIlIllIIIIll[7] = -(0xFFFF8F3F & 0x76FB) & (0xFFFFD7FF & 0x7F7B);
        bg.lIlIllIIIIll[8] = -(0xFFFFFDFF & 0x2E14) & (0xFFFFFFBF & 0x7DFF);
        bg.lIlIllIIIIll[9] = -(0xFFFF8FC7 & 0x7879) & (0xFFFFD9FF & 0x7FEB);
        bg.lIlIllIIIIll[10] = 0xFFFFF5BB & 0x7F7F;
    }

    protected int cp() {
        return Inventory.getCount(item -> item.getName().startsWith(lIlIllIIIIlI[lIlIllIIIIll[3]]));
    }

    @Override
    public EquipmentSetup cj() {
        if (bg.llIllllllIlllI(this.co.R())) {
            return this.co.R();
        }
        return this.co.Q();
    }

    private static void llIllllllIlIlI() {
        lIlIllIIIIlI = new String[lIlIllIIIIll[4]];
        bg.lIlIllIIIIlI[bg.lIlIllIIIIll[5]] = bg."Revitalisation";
        bg.lIlIllIIIIlI[bg.lIlIllIIIIll[3]] = bg."Xeric's aid";
    }

    protected int eh() {
        return this.eg() + this.cp() + this.cq();
    }

    private static boolean llIlllllllIIIl(Object object) {
        return object == null;
    }

    protected int cq() {
        return Inventory.getCount(item -> item.getName().startsWith(lIlIllIIIIlI[lIlIllIIIIll[5]]));
    }

    @Override
    public boolean cg() {
        return this.dY();
    }

    @Override
    public boolean ch() {
        boolean bl2;
        bg var16;
        if (bg.llIllllllIllII(this.bS.getPlane(), lIlIllIIIIll[4])) {
            return lIlIllIIIIll[5];
        }
        var16.ak = var16.co.L();
        var16.am = var16.co.N();
        var16.al = var16.co.M();
        if (bg.llIllllllIllIl((Object)var16.ak.bw, (Object)N.FARMING)) {
            bl2 = lIlIllIIIIll[3];
            0;
            if ((0xB6 ^ 0xB2) == 2) {
                return false;
            }
        } else {
            bl2 = lIlIllIIIIll[5];
        }
        return bl2;
    }

    private static boolean llIlllllllIIII(int n2) {
        return n2 != 0;
    }

    protected int ed() {
        return lIlIllIIIIll[2] - this.el().size() - lIlIllIIIIll[3] - lIlIllIIIIll[4];
    }

    protected int ej() {
        int[] nArray = new int[lIlIllIIIIll[3]];
        nArray[bg.lIlIllIIIIll[5]] = lIlIllIIIIll[9];
        return Inventory.getCount((int[])nArray);
    }

    /*
     * WARNING - void declaration
     */
    private List<Integer> a(int[] nArray) {
        void var22;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int[] nArray2 = nArray;
        int n2 = nArray2.length;
        int var2 = lIlIllIIIIll[5];
        while (bg.llIllllllIllll(var2, (int)var22)) {
            void var7;
            void var19;
            void var9 = var19[var2];
            var7.add((int)var9);
            0;
            ++var2;
            0;
            if (-1 != 3) continue;
            return null;
        }
        return arrayList;
    }

    private static boolean llIllllllIllIl(Object object, Object object2) {
        return object == object2;
    }

    public abstract boolean dY();

    private static String llIllllllIlIII(String var20, String var15) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var17 = Cipher.getInstance("Blowfish");
            var17.init(lIlIllIIIIll[4], var1);
            return new String(var17.doFinal(Base64.getDecoder().decode(var20.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    @Inject
    protected bg(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.am = lIlIllIIIIll[0];
        this.el = lIlIllIIIIll[1];
    }

    protected int ef() {
        int[] nArray = new int[lIlIllIIIIll[3]];
        nArray[bg.lIlIllIIIIll[5]] = lIlIllIIIIll[6];
        return Inventory.getCount((int[])nArray);
    }

    private static String llIllllllIlIIl(String var5, String var10) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var11 = new StringBuilder();
        char[] var12 = var10.toCharArray();
        int var8 = lIlIllIIIIll[5];
        char[] var6 = var5.toCharArray();
        int var21 = var6.length;
        int var23 = lIlIllIIIIll[5];
        while (bg.llIllllllIllll(var23, var21)) {
            char var24 = var6[var23];
            var11.append((char)(var24 ^ var12[var8 % var12.length]));
            0;
            ++var8;
            ++var23;
            0;
            if (2 >= 2) continue;
            return null;
        }
        return String.valueOf(var11);
    }

    private static boolean llIllllllIlllI(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    protected HashSet<Integer> el() {
        void var7_7;
        EquipmentSetup equipmentSetup = this.co.P();
        EquipmentSetup equipmentSetup2 = this.co.Q();
        EquipmentSetup equipmentSetup3 = this.co.O();
        EquipmentSetup equipmentSetup4 = this.co.R();
        HashSet<Integer> hashSet = new HashSet<Integer>();
        hashSet.addAll(this.a(equipmentSetup2.getIds()));
        0;
        hashSet.addAll(this.a(equipmentSetup.getIds()));
        0;
        hashSet.addAll(this.a(equipmentSetup3.getIds()));
        0;
        if (bg.llIllllllIlllI(equipmentSetup4)) {
            hashSet.addAll(this.a(equipmentSetup4.getIds()));
            0;
        }
        List var4 = Equipment.getAll();
        HashSet<Integer> var3 = new HashSet<Integer>();
        Iterator var14 = var4.iterator();
        while (bg.llIlllllllIIII(var14.hasNext() ? 1 : 0)) {
            Item var18 = (Item)var14.next();
            if (bg.llIlllllllIIIl(var18)) {
                0;
                if (-1 != 1) continue;
                return null;
            }
            var3.add(var18.getId());
            0;
            0;
            
            return null;
        }
        hashSet.removeAll((Collection<?>)var7_7);
        0;
        hashSet.remove(lIlIllIIIIll[0]);
        0;
        hashSet.remove(lIlIllIIIIll[5]);
        0;
        return hashSet;
    }

    private static boolean llIllllllIllll(int n2, int n3) {
        return n2 < n3;
    }

    protected int eg() {
        int[] nArray = new int[lIlIllIIIIll[3]];
        nArray[bg.lIlIllIIIIll[5]] = lIlIllIIIIll[7];
        return Inventory.getCount((int[])nArray);
    }

    protected int ee() {
        return this.ed() - this.el;
    }

    private static boolean llIllllllIllII(int n2, int n3) {
        return n2 != n3;
    }

    protected int ek() {
        return this.ei() + this.ej();
    }
}

