/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 */
package gg.squire.construction.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;

@TaskDesc(name="Attacking Chompy", priority=100, blocking=true)
public class AttackingChompyTask
extends Task {
    private static  String[] llIlllll;
    private static  int[] lllIIIIl;

        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var13;
        NPC nPC2 = Combat.getAttackableNPC(nPC -> {
            int n2;
            if ((nPC.getName( != 0).equals(llIlllll[3]) ? 1 : 0) && (nPC.isDead( == 0) ? 1 : 0)) {
                String[] stringArray = new String[3];
                stringArray[1] = llIlllll[2];
                if ((nPC.hasActionstringArray)) {
                    String[] stringArray2 = new String[3];
                    stringArray2[1] = llIlllll[4];
                    if ((nPC.hasAction(stringArray2 == 0) ? 1 : 0)) {
                        n2 = 3;
                        0;
                        if null == null return n2 != 0;
                        return ((0x85 ^ 0x93 ^ (0x5F ^ 0x19)) & (0x59 ^ 0x3F ^ (0x7C ^ 0x4A) ^ -1)) != 0;
                    }
                }
            }
            n2 = 1;
            return n2 != 0;
        });
        if ((Players.getLocal().getAnimation() == 0)) {
            return 1;
        }
        if ((Players.getLocal( != null).getInteracting())) {
            return 1;
        }
        if var13 == null {
            return 1;
        }
        nPC2.interact(llIlllll[1]);
        this.sleep(2);
        return 3;
    }

}

