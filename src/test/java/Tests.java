import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;
class Test {
    String[] arg1={"6X^3+14X^2+2X+6","2X^4-3X^3-15X^2+32X-12","X^11-3X^9+12X^7+5723X^6-6X^5+X^4-11X^3+X^2-X-33"
            ,"7X^5-X^4-X^3-X^2-12X+2","-5X^5+10X^4-X^2"};
    String[] arg2={"4X^2+2X^1+1","X^2-4X-12","X^7+5X^6-3X^5-X^4+X^3+X^2-3X-1"
            ,"X^2+X+1","-X^4-X^3-X"};
    Polinom []p1=new Polinom[5];
    Polinom []p2=new Polinom[5];
    Polinom []res=new Polinom[5];
    @org.junit.jupiter.api.Test
    void adunare() {
        Model m=new Model();

        String rez[]={"6X^3+18X^2+4X+7","2X^4-3X^3-14X^2+28X-24","X^11-3X^9+13X^7+5728X^6-9X^5-10X^3+2X^2-4X-34"
                ,"7X^5-X^4-X^3-11X+3","-5X^5+9X^4-X^3-X^2-X"};
        for(int i=0;i<5;i++)
        {
            p1[i]=Polinom.generate(arg1[i]);
            p2[i]=Polinom.generate(arg2[i]);
            res[i]=Polinom.generate(rez[i]);
        }
        assertAll(
                ()->assertEquals(res[0].toString(),m.adunare(p1[0],p2[0]).toString()),
                ()->assertEquals(res[1].toString(),m.adunare(p1[1],p2[1]).toString()),
                ()->assertEquals(res[2].toString(),m.adunare(p1[2],p2[2]).toString()),
                ()->assertEquals(res[3].toString(),m.adunare(p1[3],p2[3]).toString()),
                ()->assertEquals(res[4].toString(),m.adunare(p1[4],p2[4]).toString())
        );
    }

    @org.junit.jupiter.api.Test
    void scadere() {
        Model m=new Model();
        String rez[]={"6X^3+10X^2+5","2X^4-3X^3-16X^2+36X","X^11-3X^9+11X^7+5718X^6-3X^5+2X^4-12X^3+2X-32"
                ,"7X^5-X^4-X^3-2X^2-13X+1","-5X^5+11X^4+X^3-X^2+X"};
        for(int i=0;i<5;i++)
        {
            p1[i]=Polinom.generate(arg1[i]);
            p2[i]=Polinom.generate(arg2[i]);
            res[i]=Polinom.generate(rez[i]);
        }
        assertAll(
                ()->assertEquals(res[0].toString(),m.scadere(p1[0],p2[0]).toString()),
                ()->assertEquals(res[1].toString(),m.scadere(p1[1],p2[1]).toString()),
                ()->assertEquals(res[2].toString(),m.scadere(p1[2],p2[2]).toString()),
                ()->assertEquals(res[3].toString(),m.scadere(p1[3],p2[3]).toString()),
                ()->assertEquals(res[4].toString(),m.scadere(p1[4],p2[4]).toString())
        );
    }

    @org.junit.jupiter.api.Test
    void inmultire() {
        Model m=new Model();
        String rez[]={"24X^5+68X^4+42X^3+42X^2+14X+6","2X^6-11X^5-27X^4+128X^3+40X^2-336X+144","X^18+5X^17-6X^16-16X^15+22X^14+5787X^13+28567X^12-17214X^11-5690X^10+5687X^9+5717X^8-17216X^7-5878X^6+93X^5+65X^4-26X^3-31X^2+100X+33",
                "7X^7+6X^6+5X^5-3X^4-14X^3-11X^2-10X+2","5X^9-5X^8-10X^7+6X^6-9X^5+X^3"};
        for(int i=0;i<5;i++)
        {
            p1[i]=Polinom.generate(arg1[i]);
            p2[i]=Polinom.generate(arg2[i]);
            res[i]=Polinom.generate(rez[i]);
        }
        assertAll(
                ()->assertEquals(res[0].toString(),m.inmultire(p1[0],p2[0]).toString()),
                ()->assertEquals(res[1].toString(),m.inmultire(p1[1],p2[1]).toString()),
                ()->assertEquals(res[2].toString(),m.inmultire(p1[2],p2[2]).toString()),
                ()->assertEquals(res[3].toString(),m.inmultire(p1[3],p2[3]).toString()),
                ()->assertEquals(res[4].toString(),m.inmultire(p1[4],p2[4]).toString())
        );
    }

    @org.junit.jupiter.api.Test
    void impartire() {
        Model m=new Model();
        String rez[]={"2X-7","0.5X^2-2X+8","X^2-2X-5"};
        String[] argi1={"6X^3-17X^2-8X+2","X^3-1","X^3-3X^2-3X+5"};
        String[] argi2={"3X^2+2X-1","2X+8","X-1"};
        for(int i=0;i<3;i++)
        {
            p1[i]=Polinom.generate(argi1[i]);
            p2[i]=Polinom.generate(argi2[i]);
            res[i]=Polinom.generate(rez[i]);
        }
        assertAll(
                ()->assertEquals(res[0].toString(),m.impartire(p1[0],p2[0]).toString()),
                ()->assertEquals(res[1].toString(),m.impartire(p1[1],p2[1]).toString()),
                ()->assertEquals(res[2].toString(),m.impartire(p1[2],p2[2]).toString())
        );
    }

    @org.junit.jupiter.api.Test
    void derivare() {
        Model m=new Model();
        String rez[]={"18X^2+28X+2","8X^3-9X^2-30X+32","11X^10-27X^8+84X^6+34338X^5-30X^4+4X^3-33X^2+2X-1",
                "35X^4-4X^3-3X^2-2X-12","-25X^4+40X^3-2X"};
        for(int i=0;i<5;i++)
        {
            p1[i]=Polinom.generate(arg1[i]);
            p2[i]=Polinom.generate(arg2[i]);
            res[i]=Polinom.generate(rez[i]);
        }
        assertAll(
                ()->assertEquals(res[0].toString(),m.derivare(p1[0]).toString()),
                ()->assertEquals(res[1].toString(),m.derivare(p1[1]).toString()),
                ()->assertEquals(res[2].toString(),m.derivare(p1[2]).toString()),
                ()->assertEquals(res[3].toString(),m.derivare(p1[3]).toString()),
                ()->assertEquals(res[4].toString(),m.derivare(p1[4]).toString())
        );
    }

    @org.junit.jupiter.api.Test
    void integrare() {
        Model m=new Model();
        String rez[]={"1.50X^4+4.67X^3+X^2+6X","0.40X^5-0.75X^4-5X^3+16X^2-12X",
        "0.08X^12-0.30X^10+1.50X^8+817.57X^7-X^6+0.20X^5-2.75X^4+0.33X^3-0.50X^2-33X",
        "1.17X^6-0.20X^5-0.25X^4-0.33X^3-6X^2+2X","-0.83X^6+2X^5-0.33X^3"};
        for(int i=0;i<5;i++)
        {
            p1[i]=Polinom.generate(arg1[i]);
            p2[i]=Polinom.generate(arg2[i]);
            res[i]=Polinom.generate(rez[i]);
        }
        assertAll(
                ()->assertEquals(res[0].toString(),m.integrare(p1[0]).toString()),
                ()->assertEquals(res[1].toString(),m.integrare(p1[1]).toString()),
                ()->assertEquals(res[2].toString(),m.integrare(p1[2]).toString()),
                ()->assertEquals(res[3].toString(),m.integrare(p1[3]).toString()),
                ()->assertEquals(res[4].toString(),m.integrare(p1[4]).toString())
        );
    }
}