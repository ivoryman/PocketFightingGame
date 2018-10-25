package model;

public class Pokemon
{
    private String name;
    private int hp;
    private int ap;

    public Pokemon(String pName, int pHp, int pAp)
    {
        name = pName;
        hp = pHp;
        ap = pAp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAp() {
        return ap;
    }

    public void setAp(int ap) {
        this.ap = ap;
    }
    @Override
    public String toString()
    {   
        return name + " " + hp  + " " + ap + " ";

    }
}
