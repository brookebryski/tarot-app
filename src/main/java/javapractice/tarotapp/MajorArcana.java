package javapractice.tarotapp;

public class MajorArcana implements IMajorArcana{
    public String generateTraits(String card) {
        switch (card) {
            case "the fool":
                return "New beginnings, innocence, adventure";
            case "the magician":
                return "Willpower, creation, manifestation";
            case "the high priestess":
                return "Intuitive, unconscious, divine feminine";
            case "the empress":
                return "Femininity, nurturing, fertility, abundance";
            case "the emperor":
                return "Authority, structure, a father figure";
            case "the hierophant":
                return "Spiritual wisdom, tradition, conformity, morality, ethics";
            case "the lovers":
                return "Love, harmony, partnerships, choices";
            case "the chariot":
                return "Direction, control, willpower, determination, success, action";
            case "strength":
                return "Strength, courage, compassion, focus, persuasion, influence";
            case "the hermit":
                return "Wisdom, soul searching, solitude, spiritual enlightenment, receiving or giving guidance";
            case "the wheel of fortune":
                return "Chance, destiny and fate, karma, turning points, life cycles";
            case "justice":
                return "Fairness, integrity, legal disputes, cause and effect, life lessons";
            case "the hanged man":
                return "Letting go, sacrificing, pausing to reflect, uncertainty, spiritual development";
            case "death":
                return "Ending of a cycle, transitions, getting rid of excess, powerful movement, resolutions";
            case "temperance":
                return "Balance, moderation, good health, cooperating with others, finding solutions";
            case "devil":
                return "Material focus, trapped in bondage, addictions and depression, negative thinking, betrayal";
            case "the tower":
                return "Intense and sudden change, release, painful loss, tragedy, revelation";
            case "the star":
                return "Hope, renewal, creativity and inspiration, generosity, healing";
            case "the moon":
                return "Fear, anxiety, confusion, delusion, risk";
            case "the sun":
                return "Happiness, fertility, success, optimism, truth";
            case "judgement":
                return "Reflection, inner calling, reckoning, awakening, rebirth, absolution";
            default:
                return "Fulfillment, harmony, completion, integration, travel, unity";
        }
    }
}
