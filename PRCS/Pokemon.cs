using System;
using RestSharp;
using Newtonsoft.Json;
using System.Collections.Generic;

namespace PRCS{
    
    public class Types{        
        public TypeName type {get;set;}
    }

    public class TypeName{
        public string name {get; set;}        
    }
    
    public class Stats{
        public StatName stat {get;set;}
        public int base_stat {get;set;}
    }

    public class StatName{
        public string name {get;set;}
    }

    public class Abilities{
        public AbilityName ability {get;set;}
    }

    public class AbilityName{
        public string name {get;set;}
    }

    public class Pokemon
    {
        public string name {get;set;}
        public int order {get;set;}
        public int height {get;set;}
        public int weight {get;set;}
        public List<Stats> stats {get;set;}
        public List<Types> types {get;set;}
        public List<Abilities> abilities {get;set;}
        
        
    }
}