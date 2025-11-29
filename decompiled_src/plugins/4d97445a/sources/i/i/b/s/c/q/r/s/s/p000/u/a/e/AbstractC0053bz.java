package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import java.util.concurrent.ExecutorService;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.MenuAction;
import net.runelite.api.MenuEntry;
import net.runelite.api.events.MenuEntryAdded;
import net.unethicalite.api.items.Inventory;
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.bz  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/bz.class */
public abstract class AbstractC0053bz extends Task {
    private final /* synthetic */ ExecutorService gc;
    private final /* synthetic */ String gd;
    private static /* synthetic */ int[] lIIIllllI;
    private final /* synthetic */ Client gb;

    private static boolean llllIlllII(int i2) {
        return i2 == 0;
    }

    public abstract boolean c(String str, String str2);

    public void a(MenuEntryAdded menuEntryAdded) {
        if (llllIlllII(c(menuEntryAdded.getOption(), menuEntryAdded.getTarget()) ? 1 : 0)) {
            return;
        }
        this.gb.createMenuEntry(this.gb.getMenuOptionCount()).setOption("<col=ffcf40>" + this.gd).setTarget(menuEntryAdded.getTarget()).setIdentifier(menuEntryAdded.getIdentifier()).setParam1(menuEntryAdded.getActionParam1()).setParam0(menuEntryAdded.getActionParam0()).setType(MenuAction.RUNELITE_HIGH_PRIORITY).onClick(menuEntry -> {
            this.gc.submit(() -> {
                a(menuEntryAdded.getMenuEntry());
            });
            "".length();
        });
        "".length();
    }

    private static boolean llllIllllI(int i2) {
        return i2 <= 0;
    }

    static {
        llllIllIll();
    }

    @Inject
    public AbstractC0053bz(Client client, ExecutorService executorService, String str) {
        this.gb = client;
        this.gc = executorService;
        this.gd = str;
    }

    private static boolean llllIlllll(Object obj) {
        return obj != null;
    }

    private static boolean llllIlllIl(int i2) {
        return i2 != 0;
    }

    private static void llllIllIll() {
        lIIIllllI = new int[3];
        lIIIllllI[0] = 173 ^ 165;
        lIIIllllI[1] = " ".length();
        lIIIllllI[2] = (104 ^ 8) & ((219 ^ 187) ^ (-1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(MenuEntry menuEntry) {
        int i2 = lIIIllllI[0];
        for (Item item : Inventory.getAll(item2 -> {
            return item2.hasAction(str -> {
                if (llllIlllll(str) && llllIlllIl(c(str, item2.getName()) ? 1 : 0)) {
                    ?? r0 = lIIIllllI[1];
                    "".length();
                    return ((173 ^ 199) ^ (20 ^ 123)) <= 0 ? ((225 ^ 144) ^ (143 ^ 187)) & (("   ".length() ^ (96 ^ 38)) ^ (-" ".length())) : r0;
                }
                return lIIIllllI[2];
            });
        })) {
            item.interact(menuEntry.getIdentifier(), menuEntry.getType().getId(), item.getSlot(), menuEntry.getParam1());
            i2--;
            if (llllIllllI(i2)) {
                "".length();
                if (((63 ^ 104) & ((96 ^ 55) ^ (-1))) > 0) {
                    return;
                }
                return;
            }
            "".length();
            if (((193 ^ 143) ^ (79 ^ 5)) < 0) {
                return;
            }
        }
    }
}
