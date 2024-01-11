package Add_Tasks_Mod_04_RegEx;

public class Plane {
    private int x, y, z;
    private int countBombs;
    private int fuel;
    private int dir = 0;

    public Plane() {
        this.x = 100;
        this.y = 100;
        this.z = 100;
        this.fuel = 100;
        this.countBombs = 5;
    }

    public Plane(int x, int y, int z, int countBombs, int fuel) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.countBombs = countBombs;
        this.fuel = fuel;
    }

    public void flyStraight(int i) { //������� �� ���-�� ������ �����
        switch (dir) {
            case 0:
                this.x += i;
                break;
            case 1:
                this.y -= i;
                break;
            case 2:
                this.x -= i;
                break;
            case 3:
                this.y += i;
                break;
            default:
                System.out.println("��� �� ����� �� ���");
                break;
        }
        this.fuel--;
        if (this.fuel <= 0 && this.z > 0) {
            System.out.println("��������� �������(. ���� ��������");
        } else {
            System.out.println("�� ��������� ����� � ������ ���������� �� �����������: x= " + this.x + ", y= " + this.y + ", z= " + this.z + ". ������� ��������= " + this.fuel);
        }
    }

    private void flyStraightNonForPlayer(int i) { //������� �� ���-�� ������ �����
        switch (dir) {
            case 0:
                this.x += i;
                break;
            case 1:
                this.y -= i;
                break;
            case 2:
                this.x -= i;
                break;
            case 3:
                this.y += i;
                break;
            default:
                System.out.println("��� �� ����� �� ���");
                break;
        }
        fuel--;
    }

    public void flyUp(int up, int i) { //������� ���-�� ������ ����� � ���-�� ������ ������
        flyStraightNonForPlayer(i);
        this.z += up;

        if (this.fuel <= 0 && this.z > 0) {
            System.out.println("��������� �������(. ���� ��������");
        } else {
            System.out.println("�� ��������� ����� � ������ ���������� �� �����������: x= " + this.x + ", y= " + this.y + ", z= " + this.z + ". ������� ��������= " + this.fuel);
        }
    }

    public void flyDown(int down, int i) { //������� ���-�� ������ ����� � ���-�� ������ ������
        flyStraightNonForPlayer(i);
        this.z -= down;

        if (this.z <= 0) {
            this.z = 0;
            System.out.println("������� �����������)))");
        } else {
            System.out.println("�� ���������� ���� � ������ ���������� �� �����������: x= " + this.x + ", y= " + this.y + ", z= " + this.z + ". ������� ��������= " + this.fuel);
        }

    }

    public void fillFuel() {
        if (this.z > 0) {
            System.out.println("������ ������������ � �������");
        } else {
            this.fuel += 100;
            if (this.fuel > 100) {
                this.fuel = 100;
            }
            System.out.println("�� �����������. ������ �������= " + this.fuel
            );
        }
    }

    public void dropBombs() {
        if (countBombs > 0) {
            countBombs--;
            System.out.println("������� ������� ����� �� ����������� x=" + this.x + ", y=" + this.y + ". ���-�� ����= " + this.countBombs);
        } else {
            System.out.println("��� �� ����� �����");
        }
    }

    public void turnLeft() {
        dir--;
        if (dir == -1) {
            dir = 3;
        }
        System.out.println("�� ��������� ������");
    }

    public void turnRight() {
        dir++;
        if (dir == 4) {
            dir = 0;
        }
        System.out.println("�� ��������� �������");
    }
}