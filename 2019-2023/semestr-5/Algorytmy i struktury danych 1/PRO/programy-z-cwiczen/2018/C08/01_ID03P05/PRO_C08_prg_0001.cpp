#include <iostream>
using std::cout;
using std::cin;
using std::endl;
using std::string;
using std::ostream;
using std::istream;
///*********************************************************************************************
///*********************************************************************************************
class MyApplication{
    public:
            void Main01();
            void Main02();
    };
///*********************************************************************************************
///*********************************************************************************************
class Candy{
    public:
        Candy(int, int);
        Candy(){cout<<"CANDY"<<endl; }
        int GetSugar();
        int GetkCal();
        Candy operator+(const Candy&)const;
    private:
        int sugar;
        int kCal;
friend ostream& operator<<(ostream& , const Candy&);
    };
///*********************************************************************************************
///*********************************************************************************************
class Box{
    public:
        Box(Candy, Candy);
        Box(){cout<<"BOX"<<endl;}

/*        Candy GetCoco();
        Candy GetJam();
        Box operator+(const Box&)const;*/
    private:
        Candy coco;
        Candy jam;
//friend ostream& operator<<(ostream& , const Box&);
    };
///*********************************************************************************************
///*********************************************************************************************
Candy::Candy(int sugar, int kCal):sugar(sugar), kCal(kCal){}
///*********************************************************************************************
int Candy::GetSugar(){return sugar;}
///*********************************************************************************************
int Candy::GetkCal(){return kCal;}
///*********************************************************************************************
Candy Candy::operator+(const Candy& candy)const{
    return Candy(sugar+candy.sugar, kCal+candy.kCal);
    }
///*********************************************************************************************
ostream& operator<<(ostream& s, const Candy& candy){
    s<<"("<<candy.sugar<<", "<<candy.kCal<<")";
    return s;
    }
///*********************************************************************************************
///*********************************************************************************************
Box::Box(Candy coco, Candy jam):coco(coco),jam(jam){}
///*********************************************************************************************


///*********************************************************************************************
///*********************************************************************************************
int main(){
    (new MyApplication)->Main02();
    return 0;
    }
///*********************************************************************************************
///*********************************************************************************************
void MyApplication::Main02(){
    Box box;
    }
///*********************************************************************************************
///*********************************************************************************************

