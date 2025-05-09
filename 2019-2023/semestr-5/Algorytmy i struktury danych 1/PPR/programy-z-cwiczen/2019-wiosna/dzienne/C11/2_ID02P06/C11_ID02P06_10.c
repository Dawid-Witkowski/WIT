///213.135.45.65:7080
#include <stdio.h>
#include <stdlib.h>
///*********************************************************
typedef struct {
    int x;
    int y;
    }Point;
///*********************************************************
typedef struct{
    Point X;
    Point Y;
    }Segment;
///*********************************************************
Point PointNew(int, int);
Point PointPrint(Point);
Point PointAdd(Point, Point);
///*********************************************************
Segment SegmentNew(Point, Point);
Segment SegmentPrint(Segment);
Segment SegmentAdd(Segment, Segment);
///*********************************************************
///*********************************************************
Point PointNew(int x, int y){
    Point myP1;
    myP1.x = x;
    myP1.y = y;
    return myP1;
    }
///*********************************************************
Point PointPrint(Point myP1){
    printf("x = %d, y = %d\n", myP1.x, myP1.y);
    return myP1;
    }
///*********************************************************
Point PointAdd(Point p1, Point p2){
    return PointNew(p1.x + p2.x, p1.y + p2.y);
    }
///*********************************************************
///*********************************************************
Segment SegmentNew(Point X, Point Y){
    Segment sG1;
    sG1.X = X;
    sG1.Y = Y;
    return sG1;
    }
///*********************************************************
Segment SegmentPrint(Segment sG1){
    printf("X: ");
    PointPrint(sG1.X);
    printf("Y: ");
    PointPrint(sG1.Y);
    return sG1;
    }
///*********************************************************
Segment SegmentAdd(Segment s1, Segment s2){
    return SegmentNew(PointAdd(s1.X, s2.X), PointAdd(s1.Y, s2.Y));
    }
///*********************************************************
///*********************************************************
int main(){
    Segment s1, s2, s3;

    s1 = SegmentNew(PointNew(1,2), PointNew(3,4));
    s2 = SegmentNew(PointNew(9,8), PointNew(7,6));
    s3 = SegmentAdd(s1, s2);
    SegmentPrint(s3);


    return 0;
    }
///1, 2, 3
