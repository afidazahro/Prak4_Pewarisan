
package memberpbo;

public class MemberPBO {
        protected String name;
        protected int age;

        public MemberPBO(String name, int age){
            this.name = name;
            this.age = age;
        }

        public void display() {
            System.out.println("Nama : " + name);
            System.out.println("Umur : " + age);
        }
    }
    