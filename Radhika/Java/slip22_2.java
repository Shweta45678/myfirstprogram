//======slip22_2=======//

import java.io.RandomAccessFile;
import java.io.*;
class slip22_2
{
public static void main(String ar[])throws IOException
{
File in=new File("f1.c");
File out=new File("f2.txt");

FileReader fr=new FileReader(in);
FileWriter fw=new FileWriter(out);

int ch;
RandomAccessFile raf=new RandomAccessFile("f1.c","r");
long pos=raf.length();
while((ch=fr.read())!=-1)
{

while(pos>0)
{
pos=pos-1;
raf.seek(pos);
byte b=raf.readByte();
fw.write((char)b);
}
}
fr.close();
fw.close();
}
}

/*=================output=================


}
;)opxe.]1-mret[p,ffeoc.]1-mret[p,")d%^x(d%"(ftnirp
;)opxe.]k[p,ffeoc.]k[p,"+)d%^x(d%"(ftnirp
)++k;1-mret<k;0=k(rof

;k tni
{
)mret tni,]01[p edon tcurts(yloPyalpsid diov

}


}
;++k
;++j
;opxe.]j[2p=opxe.]k[3p
;ffeoc.]j[2p=ffeoc.]k[3p
{
)2t<j(elihw

}
;++k
;++i
;opxe.]i[1p=opxe.]k[3p
;ffeoc.]i[1p=ffeoc.]k[3p
{
)1t<i(elihw


}
}
;++k
;++j
;opxe.]j[2p=opxe.]k[3p
;ffeoc.]j[2p=ffeoc.]k[3p
{
esle
}
;++k
;++i
;opxe.]i[1p=opxe.]k[3p
;ffeoc.]i[1p=ffeoc.]k[3p
{
)opxe.]j[2p>opxe.]i[1p(fiesle

;++k
;++j
;++i

;opxe.]i[1p=opxe.]k[3p
;ffeoc.]j[2p + ffeoc.]i[1p=ffeoc.]k[3p
{
)opxe.]j[2p==opxe.]i[1p(fi
{
)2t<j && 1t<i(elihw

;0=k
;0=j
;0=i


;k,j,i tni
{
)]01[3p edon tcurts,2t tni,1t tni,]01[2p edon tcurts,]01[1p edon tcurts(yloPdda tni

}
;)1t(nruter
}
;)opxe.]i[p&,"d%"(fnacs
;)1+i,":)d%(tnenopxe eht retnE  "(ftnirp
;)ffeoc.]i[p&,"d%"(fnacs
;)1+i,":)d%(tneiciffeoC eht retnE "(ftnirp
{
)++i;1t<i;0=i(rof
;)"n\REDRO GNIDNESED ni TNENOPXE dna TNEICIFFEOC eht retnE n\"(ftnirp

;)1t&,"d%"(fnacs
;)"laimonylop eht ni smret fo rebmun latot eht retnE n\n\"(ftnirp

;i,1t tni
{
)]01[p edon tcurts(yloPdaer tni

}
;0 nruter

;)"n\"(ftnirp
;)3t,3p(yloPyalpsid
;)": noitidda retfa laimonylop tnatluseR n\n\"(ftnirp
;)3p,2t,1t,2p,1p(yloPdda = 3t


;)2t,2p(yloPyalpsid
;)" :laimonylop dnoceS n\"(ftnirp
;)2p(yloPdaer=2t

;)1t,1p(yloPyalpsid
;)" :laimonylop tsriF n\"(ftnirp
;)1p(yloPdaer=1t


;3t,2t,1t tni
{
)(niam tni

;)ssmret tni,][edon tcurts(yloPyalpsid diov
;)edon tcurts,tni,tni,][edon tcurts,][edon tcurts(yloPdda tni
;)][edon tcurts(yloPdaer tni


;]01[3p,]01[2p,]01[1p edon tcurts




;}
;opxe tni
;ffeoc tni
{
edon tcurts


>h.oidts<edulcni#
*/
