
public class BarrierEntity extends Entity {

	private Game game;
	
	public BarrierEntity(Game game,String ref,int x,int y) {
		super(ref,x,y);
		this.game = game;
	}
	
	public void collidedWith(Entity other) {
		if(other instanceof ShotEntity){
			game.removeEntity(this);
			game.removeEntity(other);
		}
		else if(other instanceof AlienEntity){
			game.removeEntity(this);
		}
	}
	
}
