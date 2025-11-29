/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.items.Inventory
 *  org.pf4j.util.StringUtils
 */
package gg.squire.runecrafting.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.leagues.banknote.NoteItemsConfig;
import gg.squire.runecrafting.tasks.AHelper;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.items.Inventory;
import org.pf4j.util.StringUtils;

@TaskDesc(name="note item task")
public class NoteItemTask
extends Task {
    
    private final  NoteItemsConfig c;

    private static void lII() {
        lIl = new String[llI[1]];
        b.lIl[b.llI[0]] = "Empty or null note item, please fill it out case sensitive";
    }

    private static boolean lll(int n) {
        return n == 0;
    }

    public NoteItemTask(NoteItemsConfig noteItemsConfig) {
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

