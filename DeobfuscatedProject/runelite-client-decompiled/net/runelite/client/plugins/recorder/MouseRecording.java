/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Client
 *  net.runelite.api.GameState
 *  net.runelite.api.MouseRecorder
 *  net.runelite.api.Player
 */
package net.runelite.client.plugins.recorder;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import gg.squire.client.Squire;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.CopyOption;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.MouseRecorder;
import net.runelite.api.Player;
import net.runelite.client.plugins.recorder.MouseClick;
import net.runelite.client.plugins.recorder.MouseMovement;
import net.runelite.client.ui.ClientUI;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Game;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MouseRecording {
    private static final Logger log = LoggerFactory.getLogger(MouseRecording.class);
    private static final Path RECORDER_PATH = Squire.SQUIRE_HOME.toPath().resolve("recorder");
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static final DateTimeFormatter FORMAT = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withLocale(Locale.UK).withZone(ZoneId.systemDefault());
    private static final String SQRF = ".sqrf";
    private final transient List<MouseMovement> mouseMovementsQueued = new ArrayList<MouseMovement>();
    String name;
    ArrayList<MouseClick> mouseClicks = new ArrayList();
    ArrayList<ArrayList<MouseMovement>> mousePaths = new ArrayList();
    ArrayList<Long> mouseDelays = new ArrayList();
    Set<Integer> regions = new HashSet<Integer>();
    private transient long lastClick;

    public static void deprecate(MouseRecording recording) {
        try (Stream<Path> stream = Files.walk(RECORDER_PATH, new FileVisitOption[0]);){
            Collection paths = stream.filter(filePath -> !Files.isDirectory(filePath, new LinkOption[0])).filter(filePath -> filePath.toString().endsWith(SQRF)).filter(filePath -> filePath.toString().contains(recording.getName())).collect(Collectors.toList());
            for (Path path : paths) {
                Files.move(path, Paths.get(RECORDER_PATH.toAbsolutePath().toString(), "deprecated", path.getFileName().toString()), new CopyOption[0]);
            }
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static List<MouseRecording> findBestFitting(int[] regions) {
        if (Game.getState() != GameState.LOGGED_IN) {
            return Collections.emptyList();
        }
        try (Stream<Path> stream = Files.walk(RECORDER_PATH, new FileVisitOption[0]);){
            Collection paths = stream.filter(filePath -> !Files.isDirectory(filePath, new LinkOption[0])).filter(filePath -> filePath.toString().endsWith(SQRF)).filter(filePath -> regions == null || !filePath.toString().contains("deprecated")).collect(Collectors.toList());
            if (regions == null) {
                List<MouseRecording> list = paths.stream().map(MouseRecording::parse).filter(Objects::nonNull).filter(mouseRecording -> !mouseRecording.getMousePaths().isEmpty()).sorted(Comparator.comparingInt(recording -> recording.getMousePaths().stream().mapToInt(ArrayList::size).sum()).reversed()).collect(Collectors.toList());
                return list;
            }
            List<MouseRecording> pathRegionResult = paths.stream().map(MouseRecording::parse).filter(Objects::nonNull).filter(mouseRecording -> !mouseRecording.getMousePaths().isEmpty()).filter(recording -> MouseRecording.matching(regions, recording) > 0).sorted(Comparator.comparingInt(recording -> MouseRecording.matching(regions, recording)).reversed()).collect(Collectors.toList());
            if (pathRegionResult.isEmpty() && regions.length == 0) {
                SwingUtilities.invokeLater(() -> JOptionPane.showMessageDialog(ClientUI.getFrame(), "No region specific recordings found, falling back to a default recording, be aware!", "Warning", 2));
                List<MouseRecording> list = paths.stream().map(MouseRecording::parse).collect(Collectors.toList());
                return list;
            }
            List<MouseRecording> list = pathRegionResult;
            return list;
        }
        catch (IOException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

    private static int matching(int[] regions, MouseRecording recording) {
        int matches = 0;
        for (int region : regions) {
            if (!recording.getRegions().contains(region)) continue;
            ++matches;
        }
        return matches;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static List<MouseRecording> allInRegion() {
        try (Stream<Path> pathStream = Files.walk(RECORDER_PATH, new FileVisitOption[0]);){
            List paths = pathStream.filter(filePath -> !Files.isDirectory(filePath, new LinkOption[0])).filter(filePath -> filePath.toString().endsWith(SQRF)).collect(Collectors.toList());
            Client client = Static.getClient();
            if (client == null || client.getGameState() != GameState.LOGGED_IN) {
                List<MouseRecording> list2 = Collections.emptyList();
                return list2;
            }
            int region = Players.getLocal().getWorldLocation().getRegionID();
            List<MouseRecording> list = paths.stream().map(MouseRecording::parse).filter(Objects::nonNull).filter(rec -> rec.getRegions().contains(region)).collect(Collectors.toList());
            return list;
        }
        catch (IOException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

    private static MouseRecording parse(Path from) {
        try {
            return GSON.fromJson((Reader)Files.newBufferedReader(from), MouseRecording.class);
        }
        catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void transfer() {
        if (!Files.exists(RECORDER_PATH, new LinkOption[0])) {
            return;
        }
        try (Stream<Path> stream = Files.walk(RECORDER_PATH, new FileVisitOption[0]);){
            stream.filter(filePath -> !Files.isDirectory(filePath, new LinkOption[0])).filter(filePath -> filePath.toString().endsWith(SQRF)).forEach(filePath -> {
                MouseRecording mr = MouseRecording.parse(filePath);
                if (mr == null) {
                    return;
                }
                if (mr.getMousePaths() == null || mr.getMousePaths().isEmpty()) {
                    try {
                        Files.delete(filePath);
                    }
                    catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            });
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void delete(String recording) {
        Player local = Players.getLocal();
        if (local == null) {
            return;
        }
        File file = new File(RECORDER_PATH.toFile(), recording + SQRF);
        if (!file.exists() || !file.delete()) {
            log.info("Failed to delete recording {}", (Object)recording);
        }
    }

    public static boolean matches(Path file, int region) {
        String fileName = file.getFileName().toString();
        String[] parts = fileName.split("_");
        try {
            int amount = Integer.parseInt(parts[0]);
            int packed = Integer.parseInt(parts[1].split("-")[0]);
            for (int i = amount - 1; i >= 0; --i) {
                int match = packed >> i * 6;
                if (match != region) continue;
                return true;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return false;
    }

    private String getDate() {
        File file = new File(RECORDER_PATH.toFile(), this.name + SQRF);
        if (!file.exists()) {
            return "";
        }
        return FORMAT.format(Instant.ofEpochMilli(file.lastModified()));
    }

    private String getTimeFormatted() {
        long amount = this.totalTime();
        if (amount <= 0L) {
            return " (old)";
        }
        return " (" + Time.format(Duration.of(amount, ChronoUnit.MILLIS)) + ")";
    }

    public long totalTime() {
        return this.mouseDelays.stream().reduce(0L, Long::sum);
    }

    public void addClick(MouseClick click) {
        this.mouseClicks.add(click);
        Client client = Static.getClient();
        MouseRecorder mr = client.getMouseRecorder();
        ArrayList<MouseMovement> mouseMovement = new ArrayList<MouseMovement>();
        for (int i = 0; i < mr.getIndex(); ++i) {
            mouseMovement.add(new MouseMovement(mr.getXs()[i], mr.getYs()[i], mr.getMillis()[i]));
        }
        if (this.lastClick != 0L) {
            this.mousePaths.add(new ArrayList(mouseMovement));
            this.mouseDelays.add(System.currentTimeMillis() - this.lastClick);
        }
        this.mouseMovementsQueued.clear();
        this.lastClick = System.currentTimeMillis();
    }

    public void addMovement(MouseEvent mouseEvent) {
        MouseMovement mouseMovement = new MouseMovement(mouseEvent.getX(), mouseEvent.getY(), System.currentTimeMillis());
        this.mouseMovementsQueued.add(mouseMovement);
    }

    public void export() {
        this.createFileName();
        if (this.mouseClicks.size() <= 5) {
            SwingUtilities.invokeLater(() -> JOptionPane.showMessageDialog(ClientUI.getFrame(), "Your recording is too short, not saving the recording"));
            return;
        }
        File file = new File(RECORDER_PATH.toFile(), this.name + SQRF);
        if (!file.getParentFile().exists() && !file.getParentFile().mkdirs()) {
            log.info("Failed to create directory for mouse clicks");
            return;
        }
        try (FileWriter writer = new FileWriter(file);){
            String json = GSON.toJson(this);
            writer.write(json);
            writer.flush();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int size() {
        return this.mouseClicks.size();
    }

    public MouseRecording reshape(Rectangle bounds) {
        double x = 0.0;
        double y = 0.0;
        for (MouseClick mouseClick : this.mouseClicks) {
            x = Math.max(mouseClick.getP().getX(), x);
            y = Math.max(mouseClick.getP().getY(), y);
        }
        MouseRecording mouseRecording = new MouseRecording();
        mouseRecording.setName(this.name);
        ArrayList<MouseClick> mcTransformed = new ArrayList<MouseClick>();
        for (MouseClick mouseClick : this.mouseClicks) {
            mcTransformed.add(new MouseClick(new Point((int)(mouseClick.getP().getX() * bounds.getWidth() / x), (int)(mouseClick.getP().getY() * bounds.getHeight() / y))));
        }
        mouseRecording.setMouseClicks(mcTransformed);
        return mouseRecording;
    }

    public String createFileName() {
        int index = this.regions.size();
        ThreadLocalRandom random = ThreadLocalRandom.current();
        int rand = ((Random)random).nextInt(Short.MAX_VALUE);
        this.name = String.format("%d_%d", rand, index);
        return this.name;
    }

    public String toString() {
        return this.getDate() + this.getTimeFormatted();
    }

    public List<MouseMovement> getMouseMovementsQueued() {
        return this.mouseMovementsQueued;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<MouseClick> getMouseClicks() {
        return this.mouseClicks;
    }

    public ArrayList<ArrayList<MouseMovement>> getMousePaths() {
        return this.mousePaths;
    }

    public ArrayList<Long> getMouseDelays() {
        return this.mouseDelays;
    }

    public Set<Integer> getRegions() {
        return this.regions;
    }

    public long getLastClick() {
        return this.lastClick;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMouseClicks(ArrayList<MouseClick> mouseClicks) {
        this.mouseClicks = mouseClicks;
    }

    public void setMousePaths(ArrayList<ArrayList<MouseMovement>> mousePaths) {
        this.mousePaths = mousePaths;
    }

    public void setMouseDelays(ArrayList<Long> mouseDelays) {
        this.mouseDelays = mouseDelays;
    }

    public void setRegions(Set<Integer> regions) {
        this.regions = regions;
    }

    public void setLastClick(long lastClick) {
        this.lastClick = lastClick;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MouseRecording)) {
            return false;
        }
        MouseRecording other = (MouseRecording)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$name = this.getName();
        String other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
            return false;
        }
        ArrayList<MouseClick> this$mouseClicks = this.getMouseClicks();
        ArrayList<MouseClick> other$mouseClicks = other.getMouseClicks();
        if (this$mouseClicks == null ? other$mouseClicks != null : !((Object)this$mouseClicks).equals(other$mouseClicks)) {
            return false;
        }
        ArrayList<ArrayList<MouseMovement>> this$mousePaths = this.getMousePaths();
        ArrayList<ArrayList<MouseMovement>> other$mousePaths = other.getMousePaths();
        if (this$mousePaths == null ? other$mousePaths != null : !((Object)this$mousePaths).equals(other$mousePaths)) {
            return false;
        }
        ArrayList<Long> this$mouseDelays = this.getMouseDelays();
        ArrayList<Long> other$mouseDelays = other.getMouseDelays();
        if (this$mouseDelays == null ? other$mouseDelays != null : !((Object)this$mouseDelays).equals(other$mouseDelays)) {
            return false;
        }
        Set<Integer> this$regions = this.getRegions();
        Set<Integer> other$regions = other.getRegions();
        return !(this$regions == null ? other$regions != null : !((Object)this$regions).equals(other$regions));
    }

    protected boolean canEqual(Object other) {
        return other instanceof MouseRecording;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        ArrayList<MouseClick> $mouseClicks = this.getMouseClicks();
        result = result * 59 + ($mouseClicks == null ? 43 : ((Object)$mouseClicks).hashCode());
        ArrayList<ArrayList<MouseMovement>> $mousePaths = this.getMousePaths();
        result = result * 59 + ($mousePaths == null ? 43 : ((Object)$mousePaths).hashCode());
        ArrayList<Long> $mouseDelays = this.getMouseDelays();
        result = result * 59 + ($mouseDelays == null ? 43 : ((Object)$mouseDelays).hashCode());
        Set<Integer> $regions = this.getRegions();
        result = result * 59 + ($regions == null ? 43 : ((Object)$regions).hashCode());
        return result;
    }
}

