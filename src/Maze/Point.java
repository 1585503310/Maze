package Maze;
//�Թ���Ϣ����
public class Point {
	private int x=0;
	private int y=0;
	private boolean visited=false;//���Ƿ񱻷��ʹ�
	private boolean path=false;//�Ƿ�Ϊ·��
	private int level=0;//�����Թ�ʱ��ȸ��ߵȼ�
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	private boolean iscreat=false;
	public boolean isIscreat() {
		return iscreat;
	}
	public void setIscreat(boolean iscreat) {
		this.iscreat = iscreat;
	}
	public boolean isPath() {
		return path;
	}
	public void setPath(boolean path) {
		this.path = path;
	}
	protected Point() {
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public boolean isVisited() {
		return visited;
	}
	public void setVisited(boolean visited) {
		this.visited = visited;
	}
}
