using StgElse.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace StgElse.Services
{
    public class AttractionService
    {
        private IAttractionsRepository attractionsRepository;

        public AttractionService(IAttractionsRepository attractionsRepository)
        {
            this.attractionsRepository = attractionsRepository;
        }

        public List<Attractions> GetAttractions()
        {
            return attractionsRepository.GetAll();
        }

        public List<Attractions> GetAttractionsByCityAndCategory(string city, string category)
        {
            return attractionsRepository.GetAttractionsByCityAndCategory(city, category);
        }

        public void AddAttractions(Attractions attractions)
        {
            attractionsRepository.AddAttractions(attractions);
        }

        public Attractions GetById(int id)
        {
            return attractionsRepository.GetById(id);
        }

         public void SaveAttractions(Attractions attractions)
        {
            attractionsRepository.SaveAttraction(attractions);
        }
    }
}
