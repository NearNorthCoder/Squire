/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.items.Inventory
 *  org.pf4j.util.StringUtils
 */
package i.e.u.e.s.r.a.l.q.-.0.s.2.2.u.e.-.g.5;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.leagues.banknote.NoteItemsConfig;
import i.e.u.e.s.r.a.l.q.-.0.s.2.2.u.e.-.g.5.a;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.items.Inventory;
import org.pf4j.util.StringUtils;

/* TASK: note item task -> NoteitemtaskTask */
@TaskDesc(name="note item task")
public class NoteItemTask
extends Task {
    private static /* synthetic */ int[] llI;
    private final /* synthetic */ NoteItemsConfig c;
    private static /* synthetic */ String[] lIl;

    private static void lIl() {
        llI = new int[4];
        b.llI[0] = (0x14 ^ 0x33) & ~(0x6A ^ 0x4D);
        b.llI[1] = 1;
        b.llI[2] = 0xAE ^ 0x9B ^ (0xC ^ 0x31);
        b.llI[3] = 2;
    }

    private static String ll(String llllllllllIIIII, String lllllllllIlllll) {
        try {
            SecretKeySpec llllllllllIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllIlllll.getBytes(StandardCharsets.UTF_8)), llI[2]), "DES");
            Cipher llllllllllIIIlI = Cipher.getInstance("DES");
            llllllllllIIIlI.init(llI[3], llllllllllIIIll);
            return new String(llllllllllIIIlI.doFinal(Base64.getDecoder().decode(llllllllllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllIIIIl) {
            llllllllllIIIIl.printStackTrace();
            return null;
        }
    }

    private static void lII() {
        lIl = new String[llI[1]];
        b.lIl[b.llI[0]] = b."Empty or null note item, please fill it out case sensitive";
    }

    private static boolean lll(int n) {
        return n == 0;
    }

    public b(NoteItemsConfig noteItemsConfig) {
        this.c = noteItemsConfig;
    }

    private static boolean llI(int n) {
        return n != 0;
    }

    public boolean run() {
        b lllllllllllIlII;
        if (b.llI(StringUtils.isNotNullOrEmpty((String)this.c.noteItem()) ? 1 : 0)) {
            System.out.println(lIl[llI[0]]);
            return llI[0];
        }
        if (b.lll(lllllllllllIlII.c.getUnnotedMode() ? 1 : 0) && b.llI(Inventory.isFull() ? 1 : 0)) {
            int[] nArray = new int[llI[1]];
            nArray[b.llI[0]] = a.a;
            if (b.llI(Inventory.contains((int[])nArray) ? 1 : 0) && b.lll(StringUtils.isNotNullOrEmpty((String)lllllllllllIlII.c.noteItem()) ? 1 : 0)) {
                int[] nArray2 = new int[llI[1]];
                nArray2[b.llI[0]] = a.a;
                Inventory.getFirst(item -> {
                    int n;
                    if (b.llI(item.getName().equalsIgnoreCase(this.c.noteItem()) ? 1 : 0) && b.lll(item.isNoted() ? 1 : 0)) {
                        n = llI[1];
                        0;
                        
                        }
                    } else {
                        n = llI[0];
                    }
                    return n != 0;
                }).useOn(Inventory.getFirst((int[])nArray2));
            }
        }
        if (b.llI(lllllllllllIlII.c.getUnnotedMode() ? 1 : 0) && b.lll(Inventory.contains(item -> {
            int n;
            if (b.llI(item.getName().equalsIgnoreCase(this.c.noteItem()) ? 1 : 0) && b.lll(item.isNoted() ? 1 : 0)) {
                n = llI[1];
                0;
                if (3 == 2) {
                    return false;
                }
            } else {
                n = llI[0];
            }
            return n != 0;
        }) ? 1 : 0)) {
            int[] nArray = new int[llI[1]];
            nArray[b.llI[0]] = a.a;
            if (b.llI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray3 = new int[llI[1]];
                nArray3[b.llI[0]] = a.a;
                Inventory.getFirst(item -> {
                    int n;
                    if (b.llI(item.getName().equalsIgnoreCase(this.c.noteItem()) ? 1 : 0) && b.llI(item.isNoted() ? 1 : 0)) {
                        n = llI[1];
                        0;
                        if (3 < 3) {
                            return false;
                        }
                    } else {
                        n = llI[0];
                    }
                    return n != 0;
                }).useOn(Inventory.getFirst((int[])nArray3));
            }
        }
        return llI[0];
    }

    static {
        b.lIl();
        b.lII();
    }
}

