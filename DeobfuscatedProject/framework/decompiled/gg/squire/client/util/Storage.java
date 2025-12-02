/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonSyntaxException
 *  net.runelite.http.api.RuneLiteAPI
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.client.util;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import gg.squire.client.Squire;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.runelite.http.api.RuneLiteAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Storage<T> {
    private static final Logger log = LoggerFactory.getLogger(Storage.class);
    public static final Predicate<String> IS_JSON = str -> str.endsWith(".json");
    private final Class<T> types;
    private final Path folder;

    private Storage(File home, String folder, Class<T> types) {
        this.types = types;
        this.folder = Paths.get(home.getAbsolutePath(), folder);
    }

    public static <T> Storage<T> of(String folder, Class<T> types) {
        return new Storage<T>(Squire.SQUIRE_HOME, folder, types);
    }

    public static <T> Storage<T> of(Class<T> types) {
        return new Storage<T>(Squire.SQUIRE_HOME, types.getSimpleName().toLowerCase(), types);
    }

    public String getName() {
        return this.folder.getName(this.folder.getNameCount() - 1).toString();
    }

    public Storage<T> create() {
        if (!Files.exists(this.folder, new LinkOption[0])) {
            try {
                Files.createDirectories(this.folder, new FileAttribute[0]);
            }
            catch (IOException e) {
                log.debug("Error creating folder");
            }
        }
        return this;
    }

    public List<T> all() {
        ArrayList<T> list = new ArrayList<T>();
        for (StorageEntry entry : this.getEntries(IS_JSON)) {
            list.add(this.parse(entry));
        }
        return list;
    }

    public T matching(Predicate<T> test) {
        for (T t : this.all()) {
            if (!test.test(t)) continue;
            return t;
        }
        return null;
    }

    public T named(String name) {
        for (StorageEntry entry : this.getEntries(IS_JSON)) {
            if (!entry.getName().equals(name)) continue;
            return this.parse(entry);
        }
        return null;
    }

    public List<StorageEntry> getEntriesParsed(Predicate<T> matching) {
        return this.getEntries(IS_JSON).stream().filter(entry -> matching.test(this.parse((StorageEntry)entry))).collect(Collectors.toList());
    }

    public List<StorageEntry> getEntries(Predicate<String> matching) {
        List<StorageEntry> list;
        block8: {
            Stream<Path> stream = Files.walk(this.folder, new FileVisitOption[0]);
            try {
                list = stream.filter(x$0 -> Files.isRegularFile(x$0, new LinkOption[0])).filter(p -> matching.test(p.getFileName().toString())).map(p -> new StorageEntry(p.getFileName().toString().replaceFirst("[.][^.]+$", ""), p.toFile())).collect(Collectors.toList());
                if (stream == null) break block8;
            }
            catch (Throwable throwable) {
                try {
                    if (stream != null) {
                        try {
                            stream.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (IOException e) {
                    log.debug("Error walking over files", (Throwable)e);
                    return Collections.emptyList();
                }
            }
            stream.close();
        }
        return list;
    }

    public StorageEntry save(T json, String name) {
        Gson gson = RuneLiteAPI.GSON;
        Path path = Paths.get(this.folder.toString(), name + ".json");
        try (FileWriter writer = new FileWriter(path.toFile());){
            gson.toJson(json, (Appendable)writer);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        return new StorageEntry(name, path.toFile());
    }

    public void delete(StorageEntry entry) {
        entry.getFile().delete();
    }

    public T parse(StorageEntry entry) {
        Gson gson = RuneLiteAPI.GSON;
        Path path = entry.getFile().toPath();
        try {
            return (T)gson.fromJson((Reader)Files.newBufferedReader(path), this.types);
        }
        catch (JsonSyntaxException | IOException e) {
            log.warn("Error parsing file, deleting {}", (Object)path, (Object)e);
            this.delete(entry);
            return null;
        }
    }

    public static class StorageEntry {
        private String name;
        private File file;

        public String toString() {
            return this.name;
        }

        public String getName() {
            return this.name;
        }

        public File getFile() {
            return this.file;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setFile(File file) {
            this.file = file;
        }

        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof StorageEntry)) {
                return false;
            }
            StorageEntry other = (StorageEntry)o;
            if (!other.canEqual(this)) {
                return false;
            }
            String this$name = this.getName();
            String other$name = other.getName();
            if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
                return false;
            }
            File this$file = this.getFile();
            File other$file = other.getFile();
            return !(this$file == null ? other$file != null : !((Object)this$file).equals(other$file));
        }

        protected boolean canEqual(Object other) {
            return other instanceof StorageEntry;
        }

        public int hashCode() {
            int PRIME = 59;
            int result = 1;
            String $name = this.getName();
            result = result * 59 + ($name == null ? 43 : $name.hashCode());
            File $file = this.getFile();
            result = result * 59 + ($file == null ? 43 : ((Object)$file).hashCode());
            return result;
        }

        public StorageEntry(String name, File file) {
            this.name = name;
            this.file = file;
        }
    }
}
