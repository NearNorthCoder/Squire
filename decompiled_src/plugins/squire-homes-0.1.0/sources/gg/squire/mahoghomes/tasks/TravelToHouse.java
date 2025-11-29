package gg.squire.mahoghomes.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mahoghomes.SquireHomesPlugin;
import gg.squire.mahoghomes.model.Home;
import javax.inject.Inject;
import net.runelite.api.GameState;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
@TaskDesc(name = "Traveling To House", priority = 10, blocking = true)
/* loaded from: squire-homes-0.1.0.jar:gg/squire/mahoghomes/tasks/TravelToHouse.class */
public class TravelToHouse extends Task {
    private final SquireHomesPlugin plugin;

    @Inject
    public TravelToHouse(SquireHomesPlugin plugin) {
        this.plugin = plugin;
    }

    public boolean run() {
        if (Game.getState() != GameState.LOGGED_IN || Bank.isOpen()) {
            return false;
        }
        if (Dialog.canContinue()) {
            Dialog.continueSpace();
            return true;
        }
        Home home = this.plugin.getCurrentHome();
        if (home == null || !this.plugin.hasItems()) {
            return false;
        }
        Player local = Players.getLocal();
        WorldArea homeArea = home.getArea();
        if (homeArea.contains2D(local.getWorldLocation()) || !Movement.shouldWalk()) {
            return false;
        }
        if (home == Home.SARAH && Home.SARAH.getLocation().distanceTo(Players.getLocal()) > 100) {
            SpellBook.Standard varrockTeleport = SpellBook.Standard.VARROCK_TELEPORT;
            if (varrockTeleport.canCast()) {
                Magic.cast(varrockTeleport);
                return true;
            }
            Inventory.getFirst(new int[]{8007}).interact("Break");
            return true;
        }
        NPC npc = NPCs.getNearest(new int[]{home.getNpcId()});
        Movement.walkTo(npc == null ? home.getLocation() : npc.getWorldLocation());
        return true;
    }
}
