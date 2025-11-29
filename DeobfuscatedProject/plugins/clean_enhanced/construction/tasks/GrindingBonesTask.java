/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.events.InventoryChanged
 *  net.unethicalite.api.events.InventoryChanged$ChangeType
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.construction.tasks;

import gg.squire.basics.ectofuntus.SquireEcto;
import gg.squire.basics.ectofuntus.SquireEctoConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.construction.tasks.GameEnum14;
import javax.inject.Inject;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.events.InventoryChanged;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Grinding bones", priority=5, blocking=true, register=true)
public class GrindingBonesTask
extends as {
    private static final  WorldPoint dg;
    private static final  int dk;
    private static final  int dj;
    private static  String[] llIIlIl;
    private static final  int di;
    private static final  WorldPoint dh;
    private static final  WorldPoint df;
    private static  int[] llIIllI;
    private  boolean dl;

    private boolean bE() {
        boolean bl2;
        if ((Players.getLocal().getAnimation() == llIIllI[10])) {
            bl2 = 2;
            0;
            if (((0x1B ^ 0x47) & ~(0x4B ^ 0x17)) != 0) {
                return ((0xD6 ^ 0x95) & ~(0xC2 ^ 0x81)) != 0;
            }
        } else {
            bl2 = 1;
        }
        return bl2;
    }

    private static String llIIlIllI(String var1, String var2) {
        var1 = new String(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var3 = new StringBuilder();
        char[] var4 = var2.toCharArray();
        int var5 = 1;
        char[] var6 = var1.toCharArray();
        int var7 = var6.length;
        int var8 = 1;
        while (var8 < var7) {
            char var9 = var6[var8];
            var3.append((char)(var9 ^ var4[var5 % var4.length]));
            0;
            ++var5;
            ++var8;
            0;
            if (1 > 0) continue;
            return null;
        }
        return String.valueOf(var3);
    }

    @Inject
    public GrindingBonesTask(SquireEcto squireEcto, SquireEctoConfig squireEctoConfig) {
        super(squireEcto, squireEctoConfig);
    }

    private boolean bF() {
        boolean bl2;
        if ((Players.getLocal().getAnimation() == llIIllI[11])) {
            bl2 = 2;
            0;
            if (-2 > 0) {
                return ((68 + 10 - 9 + 175 ^ 81 + 82 - -16 + 19) & (0xA3 ^ 0x95 ^ (0x69 ^ 0x6D) ^ -1)) != 0;
            }
        } else {
            bl2 = 1;
        }
        return bl2;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var10;
        if ((chatMessage.getType() != chatMessage.getType()2) && (chatMessage.getType() != chatMessage.getType()2)) {
            return;
        }
        String var11 = var10.getMessage();
        if ((var11.contains(llIIlIl[llIIllI[12]] != 0) ? 1 : 0)) {
            var12.dl = 2;
        }
    }

        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    private boolean bD() {
        boolean bl2;
        if ((Players.getLocal().getAnimation() == 9)) {
            bl2 = 2;
            0;
            if (((0x2C ^ 0x29 ^ (0x88 ^ 0xC6)) & (0x36 ^ 0xF ^ (0xC0 ^ 0xB2) ^ -1)) != 0) {
                return ((0xFE ^ 0x9D ^ (0x6F ^ 0x29)) & (0x67 ^ 0x79 ^ (0x66 ^ 0x5D) ^ -1)) != 0;
            }
        } else {
            bl2 = 1;
        }
        return bl2;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(InventoryChanged inventoryChanged) {
        at var18;
        void var19;
        if ((am.ECTO_UPSTAIRS.bo( == 0) ? 1 : 0)) {
            return;
        }
        if ((var19.getChangeType() == var19.getChangeType()2) && (var19.getItemId() == var18.de.bonesToUse().groundItemId)) {
            var18.dd.q(var18.dd.bl() + 2);
        }
    }

        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean bB() {
        at var25;
        int[] nArray = new int[0];
        nArray[1] = this.de.bonesToUse().itemId;
        nArray[2] = 3;
        if ((Inventory.containsAllOf((int[] == 0)nArray) ? 1 : 0)) {
            return 1;
        }
        if ((am.ECTOFUNTUS.bo( == 0) ? 1 : 0) && (am.ECTO_UPSTAIRS.bo( == 0) ? 1 : 0)) {
            return var25.dd.bk();
        }
        if ((am.ECTO_UPSTAIRS.bo( == 0) ? 1 : 0)) {
            String[] stringArray = new String[2];
            stringArray[1] = llIIlIl[1];
            TileObject var26 = TileObjects.getNearest((String[])stringArray);
            if var26 == null {
                return 1;
            }
            var26.interact(llIIlIl[2]);
            return 2;
        }
        TileObject var26 = TileObjects.getNearest(tileObject -> {
            int n2;
            if ((tileObject.getName( != 0).equals(llIIlIl[llIIllI[13]]) ? 1 : 0)) {
                String[] stringArray = new String[2];
                stringArray[1] = llIIlIl[llIIllI[14]];
                if ((tileObject.hasActionstringArray)) {
                    n2 = 2;
                    0;
                    if null == null return n2 != 0;
                    return ((0x4B ^ 0x53 ^ (0x5D ^ 0x43)) & (0x37 ^ 0x4F ^ (0x15 ^ 0x6B) ^ -1)) != 0;
                }
            }
            n2 = 1;
            return n2 != 0;
        });
        String[] stringArray = new String[2];
        stringArray[1] = llIIlIl[0];
        TileObject var27 = TileObjects.getNearest((String[])stringArray);
        String[] stringArray2 = new String[2];
        stringArray2[1] = llIIlIl[4];
        TileObject var28 = TileObjects.getNearest((String[])stringArray2);
        if (!var26 != null || !var27 != null || var28 == null) {
            Log.info((String)llIIlIl[5]);
            return 1;
        }
        if (var25.dl != 0) {
            var26.interact(llIIlIl[6]);
            var25.dl = 1;
            return 2;
        }
        if ((var25.bD( != 0) ? 1 : 0)) {
            var26.interact(llIIlIl[7]);
            return 2;
        }
        if ((var25.bE( != 0) ? 1 : 0)) {
            var28.interact(llIIlIl[8]);
            return 2;
        }
        int[] nArray2 = new int[2];
        nArray2[1] = var25.de.bonesToUse().itemId;
        Item var29 = Inventory.getFirst((int[])nArray2);
        if var29 == null {
            return 1;
        }
        if ((var25.bF( != 0) ? 1 : 0)) {
            var29.useOn(var27);
            var25.sleep(0);
            return 2;
        }
        if ((var26.distanceTo(Players.getLocal().getWorldLocation()) > 7)) {
            var29.useOn(var27);
            var25.sleep(4);
            return 2;
        }
        return 1;
    }

}

