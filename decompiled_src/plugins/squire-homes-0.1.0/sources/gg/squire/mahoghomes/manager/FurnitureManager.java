package gg.squire.mahoghomes.manager;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.mahoghomes.SquireHomesPlugin;
import gg.squire.mahoghomes.manager.furniture.DefaultFurnitureHandler;
import gg.squire.mahoghomes.manager.furniture.FurnitureHandler;
import gg.squire.mahoghomes.manager.furniture.JeffFurnitureHandler;
import gg.squire.mahoghomes.manager.furniture.NormanFurnitureHandler;
import gg.squire.mahoghomes.manager.furniture.RossFurnitureHandler;
import gg.squire.mahoghomes.manager.stairs.DefaultStaircaseHandler;
import gg.squire.mahoghomes.manager.stairs.NoellaStaircaseHandler;
import gg.squire.mahoghomes.manager.stairs.StaircaseHandler;
import gg.squire.mahoghomes.model.Home;
import gg.squire.mahoghomes.model.Hotspot;
import java.util.Comparator;
import java.util.Objects;
import java.util.function.Predicate;
import net.runelite.api.Client;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
@Singleton
/* loaded from: squire-homes-0.1.0.jar:gg/squire/mahoghomes/manager/FurnitureManager.class */
public class FurnitureManager {
    public static final Predicate<String> FURNITURE_ACTION_PREDICATE = action -> {
        return "Build".equals(action) || "Remove".equals(action) || "Repair".equals(action);
    };
    private static final NoellaStaircaseHandler NOELLA_STAIRCASE_HANDLER = new NoellaStaircaseHandler();
    private static final NormanFurnitureHandler NORMAN_FURNITURE_HANDLER = new NormanFurnitureHandler();
    private static final RossFurnitureHandler ROSS_FURNITURE_HANDLER = new RossFurnitureHandler();
    private static final DefaultFurnitureHandler DEFAULT_FURNITURE_HANDLER = new DefaultFurnitureHandler();
    private static final DefaultStaircaseHandler DEFAULT_STAIRCASE_HANDLER = new DefaultStaircaseHandler();
    private static final JeffFurnitureHandler JEFF_FURNITURE_HANDLER = new JeffFurnitureHandler();
    private final SquireHomesPlugin homesPlugin;
    private final Client client;
    private TileObject currentFurniture;

    @Inject
    public FurnitureManager(SquireHomesPlugin homesPlugin, Client client) {
        this.homesPlugin = homesPlugin;
        this.client = client;
    }

    public TileObject getCurrentFurniture() {
        Home current = this.homesPlugin.getCurrentHome();
        Player local = Players.getLocal();
        if (current == null || !current.getArea().contains2D(local.getWorldLocation())) {
            return null;
        }
        if (this.currentFurniture == null || this.currentFurniture.getPlane() != this.client.getPlane() || !Hotspot.requiresAttention(this.currentFurniture.getId()) || !current.getArea().contains2D(this.currentFurniture.getWorldLocation())) {
            WorldPoint compare = current == Home.JEFF ? current.getArea().getCenter() : Players.getLocal().getWorldLocation();
            this.currentFurniture = (TileObject) TileObjects.getAll(to -> {
                return Hotspot.requiresAttention(to.getId()) && current.getArea().contains2D(to.getWorldLocation());
            }).stream().min(Comparator.comparingInt(to2 -> {
                return to2.distanceTo(compare);
            })).orElse(null);
        }
        if (this.currentFurniture != null && (this.currentFurniture.getActions() == null || TileObjects.getNearest(new int[]{this.currentFurniture.getId()}) == null)) {
            this.currentFurniture = null;
            return null;
        }
        return this.currentFurniture;
    }

    public FurnitureHandler getFurnitureHandler() {
        switch (this.homesPlugin.getCurrentHome()) {
            case ROSS:
                return ROSS_FURNITURE_HANDLER;
            case NORMAN:
                return NORMAN_FURNITURE_HANDLER;
            case JEFF:
                return JEFF_FURNITURE_HANDLER;
            default:
                return DEFAULT_FURNITURE_HANDLER;
        }
    }

    public StaircaseHandler getStaircaseHandler() {
        if (Objects.requireNonNull(this.homesPlugin.getCurrentHome()) == Home.NOELLA) {
            return NOELLA_STAIRCASE_HANDLER;
        }
        return DEFAULT_STAIRCASE_HANDLER;
    }
}
