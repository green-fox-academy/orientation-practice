using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using StgElse.Models;

namespace StgElse.Repositories
{
    public class AttractionsRepository : IAttractionsRepository
    {
        private readonly MacrotisOrientationExamContext MacrotisOrientationExamContext;

        public AttractionsRepository(MacrotisOrientationExamContext macrotisOrientationExamContext)
        {
            MacrotisOrientationExamContext = macrotisOrientationExamContext;
        }

        public void AddAttractions(Attractions attractions)
        {
            MacrotisOrientationExamContext.Add(attractions);
            MacrotisOrientationExamContext.SaveChanges();
        }

        public void Edit(Attractions attractions)
        {
            AddAttractions(attractions);
            MacrotisOrientationExamContext.SaveChanges();
        }

        public List<Attractions> GetAll()
        {
            return MacrotisOrientationExamContext.Attractions.ToList();
        }

        public List<Attractions> GetAttractionsByCityAndCategory(string city, string category)
        {
            if (city != null && category != null)
            {
                return MacrotisOrientationExamContext.Attractions
                    .Where(attr => attr.City.Equals(city)
                    && attr.Category.Equals(category)).ToList();
            }
            else if (city == null && category != null)
            {
                return MacrotisOrientationExamContext.Attractions
                    .Where(attr => attr.Category.Equals(category))
                    .ToList();
            }
            else if (city != null && category == null)
            {
                return MacrotisOrientationExamContext.Attractions
                    .Where(attr => attr.City.Equals(city))
                    .ToList();
            }
            else
            {
                return MacrotisOrientationExamContext.Attractions.ToList();
            }
        }

        public Attractions GetById(int id)
        {
            return MacrotisOrientationExamContext.Attractions
                .Where(attr => attr.Id == id).FirstOrDefault();
        }

        public void SaveAttraction(Attractions attractions)
        {
            MacrotisOrientationExamContext.Update(attractions);
            MacrotisOrientationExamContext.SaveChanges();
        }
    }
}
