﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DecoratorTest
{
    class LeatherSeats : CarDecorator
    {
        public LeatherSeats(Car car) : base(car) { }
        public override string info() { return base.info() + " + Leather Seats"; }
        public override int price() { return base.price() + 3000; }
    }
}
