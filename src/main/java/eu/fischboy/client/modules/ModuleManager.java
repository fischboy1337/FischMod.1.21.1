package eu.fischboy.client.system;

import net.minecraft.client.gui.DrawContext;

import java.util.concurrent.ConcurrentHashMap;

public class SystemManager {

    private final ConcurrentHashMap<Class<? extends FischModSystem>, FischModSystem> systems = new ConcurrentHashMap<>();

    public void register(FischModSystem system) {
        if (systems.containsKey(system.getClass())) unregister(system);
        system.start();
        systems.put(system.getClass(), system);
    }

    public void unregister(FischModSystem system) {
        FischModSystem stopped = systems.remove(system.getClass());
        if (stopped == null) return;
        stopped.stop();
    }

    public void unregister(Class<? extends FischModSystem> system) {
        FischModSystem stopped = systems.remove(system.getClass());
        if (stopped == null) return;
        stopped.stop();
    }

    public void stop() {
        systems.values().forEach(FischModSystem::stop);
        systems.clear();
    }

    public void render(DrawContext context) {
        systems.values().forEach(system ->  system.render(context));
    }

    public void tick() {
        systems.values().forEach(FischModSystem::tick);
    }

    @SuppressWarnings("unchecked")
    public <T extends FischModSystem> T get(Class<T> system) {
        return (T) systems.get(system);
    }
}