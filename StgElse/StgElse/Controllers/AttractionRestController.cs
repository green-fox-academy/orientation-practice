using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using StgElse.Models;
using StgElse.Services;

namespace StgElse.Controllers
{
    

    [Produces("application/json")]
    [Route("api")]
    public class AttractionRestController : Controller
    {
        private readonly AttractionService attractionService;

        public AttractionRestController(AttractionService attractionService)
        {
            this.attractionService = attractionService;
        }

        [HttpGet("filter")]
        public List<Attractions> GetAllAttractions(string city, string category)
        {
            return attractionService.GetAttractionsByCityAndCategory(city, category);
        } 

    }
}