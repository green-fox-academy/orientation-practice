using StgElse.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace StgElse
{
    public interface IAttractionsRepository
    {
        List<Attractions> GetAll();
        List<Attractions> GetAttractionsByCityAndCategory(string city, string category);
        void AddAttractions(Attractions attractions);
        Attractions GetById(int id);
        void Edit(Attractions attractions);
        void SaveAttraction(Attractions attractions);
    }
}
