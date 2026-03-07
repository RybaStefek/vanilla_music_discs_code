package net.rybastefek.vanillamusicdiscs.sounds;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rybastefek.vanillamusicdiscs.VanillaMusicDiscs;

public class ModSounds {
    private static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, VanillaMusicDiscs.MOD_ID);

    public static final RegistryObject<SoundEvent> AERIE = registerSoundEvent("aerie");
    public static final RegistryObject<SoundEvent> ANCESTRY = registerSoundEvent("ancestry");
    public static final RegistryObject<SoundEvent> ARIA_MATH = registerSoundEvent("aria_math");
    public static final RegistryObject<SoundEvent> AXOLOTL = registerSoundEvent("axolotl");
    public static final RegistryObject<SoundEvent> BEGINNING = registerSoundEvent("beginning");
    public static final RegistryObject<SoundEvent> CHRIS = registerSoundEvent("chris");
    public static final RegistryObject<SoundEvent> CHRYSOPOEIA = registerSoundEvent("chrysopoeia");
    public static final RegistryObject<SoundEvent> CLARK = registerSoundEvent("clark");
    public static final RegistryObject<SoundEvent> DANNY = registerSoundEvent("danny");
    public static final RegistryObject<SoundEvent> DEATH = registerSoundEvent("death");
    public static final RegistryObject<SoundEvent> DOG = registerSoundEvent("dog");
    public static final RegistryObject<SoundEvent> DOOR = registerSoundEvent("door");
    public static final RegistryObject<SoundEvent> DREITON = registerSoundEvent("dreiton");
    public static final RegistryObject<SoundEvent> DROOPY_LIKES_RICOCHET = registerSoundEvent("droopy_likes_ricochet");
    public static final RegistryObject<SoundEvent> DROOPY_LIKES_YOUR_FACE = registerSoundEvent("droopy_likes_your_face");
    public static final RegistryObject<SoundEvent> DRY_HANDS = registerSoundEvent("dry_hands");
    public static final RegistryObject<SoundEvent> EXCUSE= registerSoundEvent("excuse");
    public static final RegistryObject<SoundEvent> FIREBUGS= registerSoundEvent("firebugs");
    public static final RegistryObject<SoundEvent> FLOATING_DREAM = registerSoundEvent("floating_dream");
    public static final RegistryObject<SoundEvent> HAGGSTROM = registerSoundEvent("haggstrom");
    public static final RegistryObject<SoundEvent> INFINITE_AMETHYST = registerSoundEvent("infinite_amethyst");
    public static final RegistryObject<SoundEvent> KEY = registerSoundEvent("key");
    public static final RegistryObject<SoundEvent> LABYRINTHINE= registerSoundEvent("labyrinthine");
    public static final RegistryObject<SoundEvent> LEFT_TO_BLOOM = registerSoundEvent("left_to_bloom");
    public static final RegistryObject<SoundEvent> LIVING_MICE = registerSoundEvent("living_mice");
    public static final RegistryObject<SoundEvent> MICE_ON_VENUS= registerSoundEvent("mice_on_venus");
    public static final RegistryObject<SoundEvent> MINECRAFT = registerSoundEvent("minecraft");
    public static final RegistryObject<SoundEvent> MOOG_CITY = registerSoundEvent("moog_city");
    public static final RegistryObject<SoundEvent> ONE_MORE_DAY = registerSoundEvent("one_more_day");
    public static final RegistryObject<SoundEvent> RUBEDO = registerSoundEvent("rubedo");
    public static final RegistryObject<SoundEvent> SO_BELOW = registerSoundEvent("so_below");
    public static final RegistryObject<SoundEvent> SUBWOOFER_LULLABY = registerSoundEvent("subwoofer_lullaby");
    public static final RegistryObject<SoundEvent> SWEDEN = registerSoundEvent("sweden");
    public static final RegistryObject<SoundEvent> THIRTEEN = registerSoundEvent("thirteen");
    public static final RegistryObject<SoundEvent> WENDING = registerSoundEvent("wending");
    public static final RegistryObject<SoundEvent> WET_HANDS = registerSoundEvent("wet_hands");

    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(VanillaMusicDiscs.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}