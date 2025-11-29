/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.events.MenuEntryAdded
 *  net.runelite.client.eventbus.Subscribe
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.concurrent.ExecutorService;
import net.runelite.api.Client;
import net.runelite.api.events.MenuEntryAdded;
import net.runelite.client.eventbus.Subscribe;

@TaskDesc(name="Bulk Cleaning Herbs", register=true)
public class BulkCleaningHerbsTask
extends bz {
    private static  String[] llIlllIIl;
    private static  int[] llIlllIlI;

    public boolean run() {
        return llIlllIlI[0];
    }

    @Inject
    public BulkCleaningHerbsTask(Client client, ExecutorService executorService) {
        super(client, executorService, llIlllIIl[llIlllIlI[0]]);
    }

    private static void var1() {
        llIlllIIl = new String[llIlllIlI[2]];
        bA.llIlllIIl[bA.llIlllIlI[0]] = "Clean-All";
        bA.llIlllIIl[bA.llIlllIlI[1]] = "Clean";
    }

    private static void var2() {
        llIlllIlI = new int[4];
        bA.llIlllIlI[0] = (0x12 ^ 0x46) & ~(2 ^ 0x56);
        bA.llIlllIlI[1] = 1;
        bA.llIlllIlI[2] = 2;
        bA.llIlllIlI[3] = 0x14 ^ 0x18 ^ (0x8F ^ 0x8B);
    }

    @Override
    public boolean c(String string, String string2) {
        return string.contains(llIlllIIl[llIlllIlI[1]]);
    }

    @Subscribe
    public void c(MenuEntryAdded menuEntryAdded) {
        super.a(menuEntryAdded);
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    static {
        bA.var2();
        bA.var1();
    }
}

