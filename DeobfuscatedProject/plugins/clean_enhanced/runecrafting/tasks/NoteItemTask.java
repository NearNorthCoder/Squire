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
import net.unethicalite.api.items.Inventory;
import org.pf4j.util.StringUtils;

@TaskDesc(name="note item task")
public class NoteItemTask
extends Task {
    private static  int[] llI;
    private final  NoteItemsConfig c;
    private static  String[] lIl;

    private static void lIl() {
        llI = new int[4];
        b.llI[0] = (0x14 ^ 0x33) & ~(0x6A ^ 0x4D);
        b.llI[1] = 1;
        b.llI[2] = 0xAE ^ 0x9B ^ (0xC ^ 0x31);
        b.llI[3] = 2;
    }

        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    private static void lII() {
        lIl = new String[llI[1]];
        b.lIl[b.llI[0]] = "Empty or null note item, please fill it out case sensitive";
    }

    public NoteItemTask(NoteItemsConfig noteItemsConfig) {
        this.c = noteItemsConfig;
    }

    public boolean run() {
        b var6;
        if ((StringUtils.isNotNullOrEmpty(Stringthis.c.noteItem()) ? 1 : 0)) {
            System.out.println(lIl[llI[0]]);
            return llI[0];
        }
        if ((var6.c.getUnnotedMode( == 0) ? 1 : 0) && (Inventory.isFull( != 0) ? 1 : 0)) {
            int[] nArray = new int[llI[1]];
            nArray[b.llI[0]] = a.a;
            if ((Inventory.contains((int[] != 0)nArray) ? 1 : 0) && (StringUtils.isNotNullOrEmpty((String == 0)var6.c.noteItem()) ? 1 : 0)) {
                int[] nArray2 = new int[llI[1]];
                nArray2[b.llI[0]] = a.a;
                Inventory.getFirst(item -> {
                    int n;
                    if ((item.getName( != 0).equalsIgnoreCase(this.c.noteItem()) ? 1 : 0) && (item.isNoted( == 0) ? 1 : 0)) {
                        n = llI[1];
                        0;
                        if null != null {
                            return ((0xF ^ 0x27) & ~(0x52 ^ 0x7A)) != 0;
                        }
                    } else {
                        n = llI[0];
                    }
                    return n != 0;
                }).useOn(Inventory.getFirst((int[])nArray2));
            }
        }
        if ((var6.c.getUnnotedMode( != 0) ? 1 : 0) && (Inventory.contains(item -> {
            int n;
            if ((item.getName( == 0 != 0).equalsIgnoreCase(this.c.noteItem()) ? 1 : 0) && (item.isNoted( == 0) ? 1 : 0)) {
                n = llI[1];
                0;
                if (3 == 2) {
                    return ((66 + 101 - 67 + 36 ^ 24 + 76 - -5 + 23) & (98 + 92 - 102 + 65 ^ 7 + 103 - 3 + 38 ^ -1)) != 0;
                }
            } else {
                n = llI[0];
            }
            return n != 0;
        }) ? 1 : 0)) {
            int[] nArray = new int[llI[1]];
            nArray[b.llI[0]] = a.a;
            if ((Inventory.contains((int[] != 0)nArray) ? 1 : 0)) {
                int[] nArray3 = new int[llI[1]];
                nArray3[b.llI[0]] = a.a;
                Inventory.getFirst(item -> {
                    int n;
                    if ((item.getName( != 0).equalsIgnoreCase(this.c.noteItem()) ? 1 : 0) && (item.isNoted( != 0) ? 1 : 0)) {
                        n = llI[1];
                        0;
                        if (3 < 3) {
                            return ((0xB ^ 0x4B) & ~(0xD9 ^ 0x99)) != 0;
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

}

