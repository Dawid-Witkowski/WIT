﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SimpleCalculator
{
    class OperationFactory
    {
        private delegate double Operation(double a, double b);
        private static readonly Dictionary<string, Operation> map = new Dictionary<string, Operation>()
        {
            {"+",(a,b) => a+b},
            {"-",(a,b) => a-b},
            {"*",(a,b) => a*b},
            {"/",(a,b) => a/b},
        };
        public static readonly string[] keys = map.Keys.OrderBy(s => s).ToArray();
        public static double calculate(double a, string operation, double b)
        {
            //Operation op = map[operation];
            //op(a, b);
            return map[operation](a, b);
        }
    }
}
