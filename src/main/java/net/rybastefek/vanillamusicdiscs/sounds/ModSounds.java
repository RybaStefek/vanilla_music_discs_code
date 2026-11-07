package net.rybastefek.vanillamusicdiscs.sounds;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.rybastefek.vanillamusicdiscs.VanillaMusicDiscs;

public class ModSounds {
    private static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(BuiltInRegistries.SOUND_EVENT, VanillaMusicDiscs.MOD_ID);

    public static final DeferredHolder<SoundEvent, SoundEvent> AERIE = registerSoundEvent("aerie");
    public static final DeferredHolder<SoundEvent, SoundEvent> ALPHA = registerSoundEvent("alpha");
    public static final DeferredHolder<SoundEvent, SoundEvent> ANCESTRY = registerSoundEvent("ancestry");
    public static final DeferredHolder<SoundEvent, SoundEvent> ARIA_MATH = registerSoundEvent("aria_math");
    public static final DeferredHolder<SoundEvent, SoundEvent> AXOLOTL = registerSoundEvent("axolotl");
    public static final DeferredHolder<SoundEvent, SoundEvent> BEGINNING = registerSoundEvent("beginning");
    public static final DeferredHolder<SoundEvent, SoundEvent> BEGINNING_2 = registerSoundEvent("beginning_2");
    public static final DeferredHolder<SoundEvent, SoundEvent> CHRIS = registerSoundEvent("chris");
    public static final DeferredHolder<SoundEvent, SoundEvent> CHRYSOPOEIA = registerSoundEvent("chrysopoeia");
    public static final DeferredHolder<SoundEvent, SoundEvent> CLARK = registerSoundEvent("clark");
    public static final DeferredHolder<SoundEvent, SoundEvent> CONCRETE_HALLS = registerSoundEvent("concrete_halls");
    public static final DeferredHolder<SoundEvent, SoundEvent> DANNY = registerSoundEvent("danny");
    public static final DeferredHolder<SoundEvent, SoundEvent> DEATH = registerSoundEvent("death");
    public static final DeferredHolder<SoundEvent, SoundEvent> DOG = registerSoundEvent("dog");
    public static final DeferredHolder<SoundEvent, SoundEvent> DOOR = registerSoundEvent("door");
    public static final DeferredHolder<SoundEvent, SoundEvent> DREITON = registerSoundEvent("dreiton");
    public static final DeferredHolder<SoundEvent, SoundEvent> DROOPY_LIKES_RICOCHET = registerSoundEvent("droopy_likes_ricochet");
    public static final DeferredHolder<SoundEvent, SoundEvent> DROOPY_LIKES_YOUR_FACE = registerSoundEvent("droopy_likes_your_face");
    public static final DeferredHolder<SoundEvent, SoundEvent> DRY_HANDS = registerSoundEvent("dry_hands");
    public static final DeferredHolder<SoundEvent, SoundEvent> EXCUSE = registerSoundEvent("excuse");
    public static final DeferredHolder<SoundEvent, SoundEvent> FIREBUGS = registerSoundEvent("firebugs");
    public static final DeferredHolder<SoundEvent, SoundEvent> FLOATING_DREAM = registerSoundEvent("floating_dream");
    public static final DeferredHolder<SoundEvent, SoundEvent> HAGGSTROM = registerSoundEvent("haggstrom");
    public static final DeferredHolder<SoundEvent, SoundEvent> INFINITE_AMETHYST = registerSoundEvent("infinite_amethyst");
    public static final DeferredHolder<SoundEvent, SoundEvent> KEY = registerSoundEvent("key");
    public static final DeferredHolder<SoundEvent, SoundEvent> LABYRINTHINE = registerSoundEvent("labyrinthine");
    public static final DeferredHolder<SoundEvent, SoundEvent> LEFT_TO_BLOOM = registerSoundEvent("left_to_bloom");
    public static final DeferredHolder<SoundEvent, SoundEvent> LIVING_MICE = registerSoundEvent("living_mice");
    public static final DeferredHolder<SoundEvent, SoundEvent> MICE_ON_VENUS = registerSoundEvent("mice_on_venus");
    public static final DeferredHolder<SoundEvent, SoundEvent> MINECRAFT = registerSoundEvent("minecraft");
    public static final DeferredHolder<SoundEvent, SoundEvent> MOOG_CITY = registerSoundEvent("moog_city");
    public static final DeferredHolder<SoundEvent, SoundEvent> MOOG_CITY_2 = registerSoundEvent("moog_city_2");
    public static final DeferredHolder<SoundEvent, SoundEvent> ONE_MORE_DAY = registerSoundEvent("one_more_day");
    public static final DeferredHolder<SoundEvent, SoundEvent> OXYGENE = registerSoundEvent("oxygene");
    public static final DeferredHolder<SoundEvent, SoundEvent> RUBEDO = registerSoundEvent("rubedo");
    public static final DeferredHolder<SoundEvent, SoundEvent> SO_BELOW = registerSoundEvent("so_below");
    public static final DeferredHolder<SoundEvent, SoundEvent> SUBWOOFER_LULLABY = registerSoundEvent("subwoofer_lullaby");
    public static final DeferredHolder<SoundEvent, SoundEvent> SWEDEN = registerSoundEvent("sweden");
    public static final DeferredHolder<SoundEvent, SoundEvent> TASWELL = registerSoundEvent("taswell");
    public static final DeferredHolder<SoundEvent, SoundEvent> WENDING = registerSoundEvent("wending");
    public static final DeferredHolder<SoundEvent, SoundEvent> WET_HANDS = registerSoundEvent("wet_hands");

    private static DeferredHolder<SoundEvent, SoundEvent> registerSoundEvent(String name) {
        return SOUND_EVENTS.register(name, () ->
                SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(VanillaMusicDiscs.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}