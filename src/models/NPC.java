public class NPC extends Character {
    private boolean aggression;
    private String[] dialogue;
    private int damage;

    public NPC(String name, int hp, boolean aggression, String[] dialogue, int damage) {
        super(name, hp);
        this.aggression = aggression;
        this.dialogue = dialogue;
        this.damage = damage;
    }

    public void attackPlayer(Player player) {
        if (aggression) {
            System.out.println(name + " attacks " + player.getName() + " for " + damage + " damage!");
            player.setHp(player.getHp() - damage);
        } else {
            System.out.println(name + " is not aggressive.");
        }
    }

    public String converse() {
        return name + " says: " + dialogue;
    }
}
